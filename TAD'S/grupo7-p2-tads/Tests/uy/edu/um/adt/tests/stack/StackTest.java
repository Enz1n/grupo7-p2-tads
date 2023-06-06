package uy.edu.um.adt.tests.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uy.edu.um.adt.stack.Stack;

import java.util.EmptyStackException;

public class StackTest {

    private Stack<Integer> stack;

    @BeforeEach
    public void setup() {
        stack = new Stack<>();
    }

    @Test
    public void testPushAndTop() {
        stack.push(1);
        Assertions.assertEquals(1, stack.top());
        stack.push(2);
        Assertions.assertEquals(2, stack.top());
        stack.push(3);
        Assertions.assertEquals(3, stack.top());
    }

    @Test
    public void testPop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        Assertions.assertEquals(2, stack.top());
        stack.pop();
        Assertions.assertEquals(1, stack.top());
        stack.pop();
        Assertions.assertThrows(EmptyStackException.class, () -> stack.top());
    }

    @Test
    public void testIsEmpty() {
        Assertions.assertTrue(stack.isEmpty());
        stack.push(1);
        Assertions.assertFalse(stack.isEmpty());
        stack.pop();
        Assertions.assertTrue(stack.isEmpty());
    }

    @Test
    public void testMakeEmpty() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.makeEmpty();
        Assertions.assertTrue(stack.isEmpty());
        Assertions.assertThrows(EmptyStackException.class, () -> stack.top());
    }

    @Test
    public void testContains() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assertions.assertTrue(stack.contains(2));
        Assertions.assertFalse(stack.contains(4));
    }

    @Test
    public void testDelete() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.delete(2);
        Assertions.assertFalse(stack.contains(2));
        Assertions.assertEquals(3, stack.top());
        stack.delete(1);
        Assertions.assertFalse(stack.contains(1));
        Assertions.assertEquals(3, stack.top());
        stack.delete(3);
        Assertions.assertTrue(stack.isEmpty());
        Assertions.assertThrows(EmptyStackException.class, () -> stack.top());
    }
}


