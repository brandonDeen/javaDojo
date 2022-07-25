package com.brandondeen.datastructures;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public LinkedList(Node node) {
        this.head = node;
    }

    public void push(Node node) {
        Node next = this.head;
        this.head = node;
        this.head.setNext(next);
    }

    public void enqueue(Node node) {
        if (this.head == null) {
            this.head = node;
        } else {
            Node current = this.head;
            while (current.getNext() != null) {
                current = current.getNext();
            }

            current.setNext(node);
        }
    }

    public Node dequeue() {
        Node current = this.head;
        if (this.head != null) {
            this.head = this.head.getNext();
        }

        return current;
    }

    public Node pop() {
        return this.dequeue();
    }

    public void reverse() {
        Node current = this.head;
        Node previous = null;
        while (current != null) {
            // save current.next
            Node temp = current.getNext();

            // set current.next = previous
            current.setNext(previous);

            // set previous to current
            previous = current;

            // set current to temp
            current = temp;
        }

        this.setHead(previous);
    }

    public int getSize() {
        int size = 0;
        Node current = this.head;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    public List<Node> toArrayList() {
        List<Node> result = new ArrayList<>();
        Node current = this.head;
        while (current != null) {
            result.add(current);
            current = current.getNext();
        }
        return result;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = this.head;
        while (current != null) {
            sb.append(current.getValue());
            if (current.getNext() != null) {
                sb.append(" -> ");
            }
            current = current.getNext();
        }

        return sb.toString();
    }

    public Node findByValue(Integer value) {
        Node current = this.head;

        while (current != null) {
            if (current.getValue().equals(value)) {
                return current;
            }
            current = current.getNext();
        }

        return null;
    }

    public Node getNodeAtIndex(int index) {
        Node current = this.head;
        int currentIndex = 0;
        while (current != null && currentIndex <= index) {
            if (currentIndex == index) {
                return current;
            }

            currentIndex++;
            current = current.getNext();
        }

        return null;
    }

    public Node getHead() {
        return this.head;
    }

    public void setHead(Node node) {
        this.head = node;
    }

    public Node removeNode(Integer value) {
        Node current = this.head;
        Node previous = null;
        while (current != null) {
            if (current.getValue() == value) {
                if (previous == null) { this.setHead(current.getNext()); }
                else { previous.setNext(current.getNext()); }
                return current;
            }
            previous = current;
            current = current.getNext();
        }
        return null;
    }

    public static class Node {
        private Integer value;
        private Node next;

        public Node(Integer value) {
            this.setValue(value);
            this.next = null;
        }

        public Integer getValue() {
            return this.value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public Node getNext() {
            return this.next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Node)) {
                return false;
            }
            Node node = (Node) o;
            return getValue().equals(node.getValue());
        }
    }
}

