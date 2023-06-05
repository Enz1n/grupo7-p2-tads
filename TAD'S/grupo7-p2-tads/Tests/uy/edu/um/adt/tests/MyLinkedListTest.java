package uy.edu.um.adt.tests;

import uy.edu.um.adt.linkedlist.MyLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        // Crea una instancia de MyLinkedList
        MyLinkedList<String> linkedList = new MyLinkedList<>();

        // Prueba el método add()
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        // Prueba el método get()
        System.out.println("Elemento en la posición 1: " + linkedList.get(1)); // Debe imprimir "B"

        // Prueba el método remove()
        linkedList.remove("B");
        linkedList.print(); // Debe imprimir la lista después de eliminar "B"

        // Prueba el método size()
        System.out.println("Tamaño de la lista: " + linkedList.size()); // Debe imprimir 2
    }
}
