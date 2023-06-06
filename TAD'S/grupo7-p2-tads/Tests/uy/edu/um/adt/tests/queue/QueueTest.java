package uy.edu.um.adt.tests.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uy.edu.um.adt.queue.EmptyQueueException;
import uy.edu.um.adt.queue.Queue;

public class QueueTest {

    private Queue<Integer> queue;

    @BeforeEach
    public void setup() {
        queue = new Queue<>();
    }

    @Test
    public void testEnqueueRightAndDequeueRight() throws EmptyQueueException {
        queue.enqueuerigth(1);
        queue.enqueuerigth(2);
        queue.enqueuerigth(3);

        Assertions.assertEquals(3, queue.dequeuerigth());
        Assertions.assertEquals(2, queue.dequeuerigth());
        Assertions.assertEquals(1, queue.dequeuerigth());
    }

    @Test
    public void testEnqueueLeftAndDequeueLeft() throws EmptyQueueException {
        queue.enqueueleft(1);
        queue.enqueueleft(2);
        queue.enqueueleft(3);

        Assertions.assertEquals(3, queue.dequeueleft());
        Assertions.assertEquals(2, queue.dequeueleft());
        Assertions.assertEquals(1, queue.dequeueleft());
    }

    @Test
    public void testIsEmpty() throws EmptyQueueException {
        Assertions.assertTrue(queue.isEmpty());

        queue.enqueuerigth(1);
        Assertions.assertFalse(queue.isEmpty());

        queue.dequeuerigth();
        Assertions.assertTrue(queue.isEmpty());
    }

    @Test
    public void testPrintQueue() {
        queue.enqueuerigth(1);
        queue.enqueuerigth(2);
        queue.enqueuerigth(3);

        queue.printqueue(); // Expected output: 1, 2, 3
    }

    @Test
    public void testBorrarElemento() throws EmptyQueueException {
        queue.enqueuerigth(1);
        queue.enqueuerigth(2);
        queue.enqueuerigth(3);

        queue.borrarElemento(2);

        Assertions.assertFalse(queue.contains(2));
        Assertions.assertEquals(1, queue.dequeueleft());
        Assertions.assertEquals(3, queue.dequeueleft());
    }
}
