import uy.edu.um.adt.hashtable.MyHashTable;
import uy.edu.um.adt.linkedlist.MyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyHashTable<Integer,Integer> hashTable = new MyHashTable<>(10);
        hashTable.put(20,30);
        hashTable.put(1,31);
        hashTable.put(1,32);
        hashTable.put(1,38);
        hashTable.put(1891,1891);
        hashTable.put(1891,1899);
        hashTable.put(1894,777);
        //hashTable.remove(20);
        System.out.println("hola enzo" + hashTable.get(1891));
        System.out.println(hashTable.size());
        hashTable.printHashTable();

    }
}