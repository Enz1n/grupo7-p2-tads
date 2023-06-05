package uy.edu.um.adt.tests;

import uy.edu.um.adt.stack.Stack;

public class StackTest {
    public static void main(String[] args) {
        // Crea una instancia de Stack
        Stack<Integer> stack = new Stack<>();

        // Prueba el método push()
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Prueba el método top()
        System.out.println("Elemento en la parte superior de la pila: " + stack.top()); // Debe imprimir 3

        // Prueba el método pop()
        stack.pop();
        System.out.println("Elemento removido de la pila");

        // Prueba el método print()
        stack.print(); // Debe imprimir la pila resultante

        // Prueba el método isEmpty()
        System.out.println("La pila está vacía: " + stack.isEmpty()); // Debe imprimir false

        // Prueba el método makeEmpty()
        stack.makeEmpty();
        System.out.println("La pila está vacía después de makeEmpty: " + stack.isEmpty()); // Debe imprimir true

        // Prueba el método contains()
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println("La pila contiene el elemento 5: " + stack.contains(5)); // Debe imprimir true

        // Prueba el método delete()
        stack.delete(5);
        stack.print(); // Debe imprimir la pila resultante después de eliminar el elemento 5
    }
}