package uy.edu.um.adt.tests;

import uy.edu.um.adt.queue.EmptyQueueException;
import uy.edu.um.adt.queue.Queue;

public class MyQueueTest {
    public static void main(String[] args) throws EmptyQueueException {
        // Crea una instancia de Queue
        Queue<Integer> queue = new Queue<>();

        // Prueba el método enqueueleft()
        queue.enqueueleft(1);
        queue.enqueueleft(2);
        queue.enqueueleft(3);

        // Prueba el método enqueuerigth()
        queue.enqueuerigth(4);
        queue.enqueuerigth(5);

        // Prueba el método dequeueleft()
        System.out.println("Elemento removido de la izquierda: " + queue.dequeueleft()); // Debe imprimir 3

        // Prueba el método dequeuerigth()
        System.out.println("Elemento removido de la derecha: " + queue.dequeuerigth()); // Debe imprimir 5

        // Prueba el método borrarElemento()
        queue.borrarElemento(2);

        // Prueba el método printqueue()
        queue.printqueue(); // Debe imprimir la cola resultante

        // Prueba el método isEmpty()
        System.out.println("La cola está vacía: " + queue.isEmpty()); // Debe imprimir false
    }
}