package uy.edu.um.adt.tests.hashtable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uy.edu.um.adt.hashtable.MyHashTable;

public class MyHashTableTest {
    private MyHashTable<String, Integer> hashTable;

    @BeforeEach
    public void setup() {
        hashTable = new MyHashTable<>(10);
    }

    @Test
    public void testPutAndGet() {
        hashTable.put("apple", 10);
        hashTable.put("banana", 20);
        hashTable.put("orange", 30);

        Assertions.assertEquals(10, hashTable.get("apple"));
        Assertions.assertEquals(20, hashTable.get("banana"));
        Assertions.assertEquals(30, hashTable.get("orange"));
    }

    @Test
    public void testContains() {
        hashTable.put("apple", 10);
        hashTable.put("banana", 20);
        hashTable.put("orange", 30);

        Assertions.assertTrue(hashTable.contains("apple"));
        Assertions.assertTrue(hashTable.contains("banana"));
        Assertions.assertTrue(hashTable.contains("orange"));
        Assertions.assertFalse(hashTable.contains("grape"));
    }

    @Test
    public void testRemove() {
        hashTable.put("apple", 10);
        hashTable.put("banana", 20);
        hashTable.put("orange", 30);

        hashTable.remove("banana");

        Assertions.assertFalse(hashTable.contains("banana"));
        Assertions.assertEquals(2, hashTable.size());
    }

    @Test
    public void testSizeAndIsEmpty() {
        Assertions.assertEquals(0, hashTable.size());
        Assertions.assertTrue(hashTable.isEmpty());

        hashTable.put("apple", 10);
        hashTable.put("banana", 20);

        Assertions.assertEquals(2, hashTable.size());
        Assertions.assertFalse(hashTable.isEmpty());

        hashTable.remove("apple");

        Assertions.assertEquals(1, hashTable.size());
        Assertions.assertFalse(hashTable.isEmpty());
    }
}
