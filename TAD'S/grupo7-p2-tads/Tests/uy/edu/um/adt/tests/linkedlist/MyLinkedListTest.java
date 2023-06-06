package uy.edu.um.adt.tests.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uy.edu.um.adt.linkedlist.MyLinkedList;

public class MyLinkedListTest {
    private MyLinkedList<Integer> linkedList;

    @BeforeEach
    public void setup() {
        linkedList = new MyLinkedList<>();
    }

    @Test
    public void testAddAndGet() {
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        Assertions.assertEquals(10, linkedList.get(0));
        Assertions.assertEquals(20, linkedList.get(1));
        Assertions.assertEquals(30, linkedList.get(2));
    }

    @Test
    public void testRemove() {
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        linkedList.remove(20);

        Assertions.assertEquals(10, linkedList.get(0));
        Assertions.assertEquals(30, linkedList.get(1));
    }

    @Test
    public void testSize() {
        Assertions.assertEquals(0, linkedList.size());

        linkedList.add(10);
        linkedList.add(20);

        Assertions.assertEquals(2, linkedList.size());

        linkedList.remove(10);

        Assertions.assertEquals(1, linkedList.size());
    }

    @Test
    public void testPrint() {
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        linkedList.print();
    }
}
