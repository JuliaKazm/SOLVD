package org.example;

import java.util.concurrent.*;

public class ConnectionPoolExample {
    private static final int maxPoolSize = 5;
    private BlockingQueue<Connection> pool;

    private ConnectionPoolExample() {
        pool = new LinkedBlockingQueue<>(maxPoolSize);

        // Lazy initialization
        for (int i = 0; i < maxPoolSize; i++) {
            pool.offer(new Connection());
        }
    }

    private static class ConnectionPoolHolder {
        private static final ConnectionPoolExample instance = new ConnectionPoolExample();
    }

    public static ConnectionPoolExample getInstance() {
        return ConnectionPoolHolder.instance;
    }

    public Connection getConnection() throws InterruptedException {
        return pool.take();
    }

    public void releaseConnection(Connection connection) {
        pool.offer(connection);
    }

    // Class Connection managing connections
    private static class Connection {
        private String url;
        private String username;
        private String password;

        public Connection() {
            // Initialize connection properties
            this.url = "jdbc:mysql://localhost:12/mydatabase";
            this.username = "root";
            this.password = "password";
        }

        @Override
        public String toString() {
            return "Connection [url=" + url + ", username=" + username + ", password=" + password + "]";
        }
    }

    public static void main(String[] args) {
        ConnectionPoolExample connectionPool = ConnectionPoolExample.getInstance();

        // Thread Pool with 7 threads
        ExecutorService threadPool = Executors.newFixedThreadPool(7);
        Runnable task = () -> {
            try {
                Connection connection = connectionPool.getConnection();
                System.out.println("Connection acquired: " + connection);
                Thread.sleep(2000);
                connectionPool.releaseConnection(connection);
                System.out.println("Connection released: " + connection);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        // Tasks submitting to the thread pool
        for (int i = 0; i < 5; i++) {
            threadPool.submit(task);
        }

        // Tasks waiting for the next available connection
        for (int i = 0; i < 2; i++) {
            threadPool.submit(() -> {
                try {
                    System.out.println("Waiting for next available connection...");
                    Connection connection = connectionPool.getConnection();
                    System.out.println("Connection acquired: " + connection);
                    Thread.sleep(2000);
                    connectionPool.releaseConnection(connection);
                    System.out.println("Connection released: " + connection);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        threadPool.shutdown();
    }
}
