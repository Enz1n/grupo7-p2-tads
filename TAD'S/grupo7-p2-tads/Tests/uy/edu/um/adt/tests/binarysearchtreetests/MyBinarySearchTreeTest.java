package uy.edu.um.adt.tests.binarysearchtreetests;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import uy.edu.um.adt.binarysearchtree.MyBinarySearchTree;
import uy.edu.um.adt.binarysearchtree.Node;

public class MyBinarySearchTreeTest {
    @Test
    public void TestAdd() {
        MyBinarySearchTree<Integer, Integer> mytree = new MyBinarySearchTree<>();
        mytree.add(1, 101);
        mytree.add(2, 102);
        mytree.add(3, 103);
        mytree.add(4, 104);
        mytree.add(5, 505);
        Assertions.assertEquals(505, mytree.find(5));
        Assertions.assertEquals(103, mytree.find(3));
        Assertions.assertEquals(101, mytree.find(1));
    }

    @Test
    public void TestRemove(){
        MyBinarySearchTree<Integer, String> mytree2 = new MyBinarySearchTree<>();
        mytree2.add(1, "gonzalo");
        mytree2.add(2, "sebastian");
        mytree2.add(3, "gerardo");
        mytree2.add(4, "tomas");
        mytree2.add(5, "pepe");

        mytree2.remove(1);
        mytree2.remove(2);

        Assertions.assertEquals(null, mytree2.find(1));
        Assertions.assertEquals(null, mytree2.find(2));
        Assertions.assertEquals("gerardo", mytree2.find(3));
        Node<Integer, String> gerardo = mytree2.getRoot();
        System.out.println(gerardo.getValue());

    }
}
