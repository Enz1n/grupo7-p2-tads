package uy.edu.um.adt.tests.heaptests;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import uy.edu.um.adt.heap.MyHeap;

public class MyHeapTest {
    @Test
    public void TestInsert(){
        Integer[] arrayP = new Integer[15];
        MyHeap<Integer> heapMax = new MyHeap<>(arrayP, true, false);

        heapMax.insert(5);
        heapMax.insert(7);
        heapMax.insert(3);
        heapMax.insert(10);
        heapMax.insert(12);

        Assertions.assertEquals(12,arrayP[0]);
        Assertions.assertEquals(10,arrayP[1]);
        Assertions.assertEquals(5, heapMax.size());

        Integer[] arrayP2 = new Integer[15];
        MyHeap<Integer> heapMin = new MyHeap<>(arrayP2,false,true);

        heapMin.insert(15);
        heapMin.insert(10);
        heapMin.insert(20);
        heapMin.insert(1);
        heapMin.insert(21);

        Assertions.assertEquals(5, heapMin.size());
        Assertions.assertEquals(1,arrayP2[0]);
        Assertions.assertEquals(21,arrayP2[4]);
    }

    @Test
    public void TestDeleteAndReturn(){
        Integer[] arrayP = new Integer[15];
        MyHeap<Integer> heapMax = new MyHeap<>(arrayP, true, false);

        heapMax.insert(5);
        heapMax.insert(7);
        heapMax.insert(3);
        heapMax.insert(10);
        heapMax.insert(12);

        Assertions.assertEquals(12,heapMax.deleteAndReturn());
        Assertions.assertEquals(10,heapMax.deleteAndReturn());
        Assertions.assertEquals(7,heapMax.deleteAndReturn());
        Assertions.assertEquals(5,heapMax.deleteAndReturn());
        Assertions.assertEquals(3,heapMax.deleteAndReturn());
    }
}
