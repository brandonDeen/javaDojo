package com.brandondeen.datastructures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LinkedListTest {

    @Test
    public void testCreateLinkedList() {
        LinkedList linkedList = new LinkedList(new LinkedList.Node(1));
        LinkedList.Node node = linkedList.getHead();
        Assertions.assertEquals(1, (int) node.getValue(), "");
    }

    @Test
    public void testGetSize() {
        LinkedList linkedList = new LinkedList(new LinkedList.Node(1));
        int size = linkedList.getSize();
        Assertions.assertEquals(1, size, "");
    }

    @Test
    public void testAdd() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(new LinkedList.Node(1));
        LinkedList.Node node = linkedList.findByValue(1);
        Assertions.assertEquals(1, (int) node.getValue(), "");
    }

    @Test
    public void testToArrayList() {
        LinkedList linkedList = new LinkedList(new LinkedList.Node(1));
        List<LinkedList.Node> list = linkedList.toArrayList();

        Assertions.assertEquals(list.size(), linkedList.getSize(), "");
        Assertions.assertAll(
                "LinkedList.toArrayList() should return an arraylist of the same size with the same nodes",
                () -> Assertions.assertEquals(list.size(), linkedList.getSize()),
                () -> Assertions.assertEquals(list.get(0), linkedList.getNodeAtIndex(0))
        );
    }

    @Test
    public void testReverse() {
        // 1, 2, 3
        LinkedList linkedList = new LinkedList();
        linkedList.push(new LinkedList.Node(1));
        linkedList.push(new LinkedList.Node(2));
        linkedList.push(new LinkedList.Node(3));
        linkedList.reverse();

        Assertions.assertAll("LinkedList.reverse() should reverse the nodes in the list",
                () -> Assertions.assertEquals(linkedList.getNodeAtIndex(0).getValue(), 1),
                () -> Assertions.assertEquals(linkedList.getNodeAtIndex(1).getValue(), 2),
                () -> Assertions.assertEquals(linkedList.getNodeAtIndex(2).getValue(), 3)
        );
    }

    @Test
    public void testFindByValue() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(new LinkedList.Node(1));
        linkedList.push(new LinkedList.Node(2));
        linkedList.push(new LinkedList.Node(3));

        Assertions.assertAll("LinkedList.findByValue",
                () -> Assertions.assertNotNull(linkedList.findByValue(1), "should return Node with value"),
                () -> Assertions.assertNull(linkedList.findByValue(-1), "should return null if no Node found")
        );
    }

    @Test
    public void testToString() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(new LinkedList.Node(1));
        linkedList.push(new LinkedList.Node(2));
        linkedList.push(new LinkedList.Node(3));

        Assertions.assertEquals(linkedList.toString(), "3 -> 2 -> 1", "should return Node with value");
    }

    @Test
    public void testNodeEquals() {
        LinkedList.Node a = new LinkedList.Node(1);
        LinkedList.Node b = new LinkedList.Node(1);
        LinkedList.Node c = new LinkedList.Node(2);
        Object d = new Object();

        Assertions.assertAll("",
                () -> Assertions.assertEquals(a, b, ""),
                () -> Assertions.assertNotEquals(a, c, ""),
                () -> Assertions.assertNotEquals(a, d, "")
        );
    }

    @Test
    public void testRemoveNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(new LinkedList.Node(1)); // 1
        linkedList.push(new LinkedList.Node(2)); // 2, 1
        linkedList.push(new LinkedList.Node(3)); // 3, 2, 1

        linkedList.removeNode(2); // 3, 1
        Assertions.assertEquals(linkedList.getSize(), 2);

        linkedList.removeNode(3); // 1
        Assertions.assertEquals(linkedList.getSize(), 1);
        Assertions.assertEquals(linkedList.getHead().getValue(), 1);
    }

    @Test
    public void testEnqueue() {
        LinkedList linkedList = new LinkedList();
        linkedList.enqueue(new LinkedList.Node(1)); // 1
        linkedList.enqueue(new LinkedList.Node(2)); // 1, 2
        linkedList.enqueue(new LinkedList.Node(3)); // 1, 2, 3

        Assertions.assertAll("",
                () -> Assertions.assertEquals(linkedList.getNodeAtIndex(0).getValue(), 1, ""),
                () -> Assertions.assertEquals(linkedList.getNodeAtIndex(1).getValue(), 2, ""),
                () -> Assertions.assertEquals(linkedList.getNodeAtIndex(2).getValue(), 3, "")
                );
    }

    @Test
    public void testDequeue() {
        LinkedList linkedList = new LinkedList();
        linkedList.enqueue(new LinkedList.Node(1)); // 1
        linkedList.enqueue(new LinkedList.Node(2)); // 1, 2
        linkedList.enqueue(new LinkedList.Node(3)); // 1, 2, 3
        System.out.println(linkedList);

        Assertions.assertAll("",
                () -> Assertions.assertEquals(linkedList.dequeue().getValue(), 1, linkedList.toString()),
                () -> Assertions.assertEquals(linkedList.dequeue().getValue(), 2, linkedList.toString()),
                () -> Assertions.assertEquals(linkedList.dequeue().getValue(), 3, linkedList.toString()),
                () -> Assertions.assertEquals(linkedList.dequeue(), null, linkedList.toString())
        );
    }

    @Test
    public void testPop() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(new LinkedList.Node(1)); // 1
        linkedList.push(new LinkedList.Node(2)); // 1, 2
        linkedList.push(new LinkedList.Node(3)); // 1, 2, 3
        System.out.println(linkedList);

        Assertions.assertAll("",
                () -> Assertions.assertEquals(linkedList.pop().getValue(), 3, linkedList.toString()),
                () -> Assertions.assertEquals(linkedList.pop().getValue(), 2, linkedList.toString()),
                () -> Assertions.assertEquals(linkedList.pop().getValue(), 1, linkedList.toString()),
                () -> Assertions.assertEquals(linkedList.pop(), null, linkedList.toString())
        );
    }
}
