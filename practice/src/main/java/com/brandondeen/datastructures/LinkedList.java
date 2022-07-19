package com.brandondeen.datastructures;

import java.util.List;

/**
 *
 */
public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public LinkedList(Node node) {
        this.head = node;
    }

    public LinkedList(List<Node> nodes) {
        nodes.forEach(node -> this.add(node));
    }

    /**
     *
     * @param nodeValue
     * @param nodeLabel
     */
    public void add(Integer nodeValue, String nodeLabel) {
        Node node = new Node(nodeValue, nodeLabel);
        this.add(node);
    }

    /**
     *
     * @param node
     */
    public void add(Node node) {
        Node next = this.head;
        this.head = node;
        this.head.setNext(next);
    }

    /**
     *
     */
    public void reverse() {
        Node current = this.head;
        Node previous = null;
        while (current.getNext() != null) {
            // save current.next
            Node temp = current.getNext();

            // set current.next = previous
            current.setNext(previous);

            // set previous to current
            previous = current;

            // set current to temp
            current = temp;
        }
    }

    /**
     *
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = this.head;
        while (current != null) {
            sb.append(current.getLabel());
            sb.append("(");
            sb.append(current.getValue());
            sb.append(")");
            if (current.getNext() != null) {
                sb.append(" -> ");
            }
        }

        return sb.toString();
    }

    /**
     *
     * @param value
     * @return
     */
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

    public class Node {
        private Integer value;
        private String label;
        private Node next;

        public Node(Integer value, String label) {
            this.value = value;
            this.label = label;
            this.next = null;
        }

        public Integer getValue() {
            return this.value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public String getLabel() {
            return this.label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public Node getNext() {
            return this.next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}

