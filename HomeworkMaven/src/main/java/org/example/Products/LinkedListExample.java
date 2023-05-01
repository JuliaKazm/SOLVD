package org.example.Products;

public class LinkedListExample<T> {
    private Node<T> head;
    private int size;

    public LinkedListExample() {
        head = null;
        size = 0;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> currentNode = head;
        while (currentNode != null) {
            sb.append(currentNode.getData()).append(" ");
            currentNode = currentNode.getNext();
        }
        return sb.toString();
    }
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
        size++;
    }
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        Node<T> currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode.getData();
    }
    public boolean remove(T data) {
        if (head == null) {
            return false;
        }
        if (head.getData().equals(data)) {
            head = head.getNext();
            size--;
            return true;
        }
        Node<T> currentNode = head;
        while (currentNode.getNext() != null && !currentNode.getNext().getData().equals(data)) {
            currentNode = currentNode.getNext();
        }
        if (currentNode.getNext() != null) {
            currentNode.setNext(currentNode.getNext().getNext());
            size--;
            return true;
        }
        return false;
    }
    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            next = null;
        }

        public T getData() {
            return data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}
