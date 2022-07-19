package com.brandondeen.datastructures;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    private LinkedList linkedList;


    @BeforeEach
    public void setup() {
        this.linkedList = new LinkedList();
    }

    @AfterEach
    public void tearDown() {
        this.linkedList = null;
    }

    @Test
    public void testCreateLinkedList() {
        this.linkedList.add(Integer.valueOf(1), "1");
        LinkedList.Node node = this.linkedList.findByValue(Integer.valueOf(1));
        Assertions.assertTrue(node.getValue().equals(1));
    }
}
