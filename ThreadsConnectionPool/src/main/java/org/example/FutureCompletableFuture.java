package org.example;

import java.util.concurrent.*;

public class FutureCompletableFuture {
    private static final int maxPoolSize = 5;
    private BlockingQueue<Connection> pool;

    private FutureCompletableFuture() {
        pool = new LinkedBlockingQueue<>(maxPoolSize);
        for (int i = 0; i < maxPoolSize; i++) {
            pool.offer(new Connection());
        }
    }

    private static class ConnectionPoolHolder {
        private static final FutureCompletableFuture instance = new FutureCompletableFuture();
    }

    public static FutureCompletableFuture getInstance() {
        return ConnectionPoolHolder.instance;
    }

    public Future<Connection> getConnectionAsync() {
        CompletableFuture<Connection> future = new CompletableFuture<>();

        try {
            Connection connection = pool.take();
            future.complete(connection);
        } catch (InterruptedException e) {
            future.completeExceptionally(e);
        }

        return future;
    }

    public void releaseConnection(Connection connection) {
        pool.offer(connection);
    }

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

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        FutureCompletableFuture connectionPool = FutureCompletableFuture.getInstance();
        ExecutorService threadPool = Executors.newFixedThreadPool(7);
        Callable<Connection> task = () -> {
            Future<Connection> future = connectionPool.getConnectionAsync();
            return future.get();
        };

        for (int i = 0; i < 5; i++) {
            threadPool.submit(() -> {
                try {
                    Connection connection = task.call();
                    System.out.println("Connection acquired: " + connection);
                    Thread.sleep(2000);
                    connectionPool.releaseConnection(connection);
                    System.out.println("Connection released: " + connection);
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });
        }

        for (int i = 0; i < 2; i++) {
            threadPool.submit(() -> {
                try {
                    System.out.println("Waiting for next available connection...");
                    Connection connection = null;
                    try {
                        connection = task.call();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
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
