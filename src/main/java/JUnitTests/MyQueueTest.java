package JUnitTests;

import DataStructureInterfaces.Queue;
import Implementations.MyQueue;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {
    @Test
    public void testOffer(){
        Queue queue = new MyQueue();
        assertTrue(queue.offer("A"));
        assertTrue(queue.offer(1));
        assertFalse(queue.offer(null));
    }

    @Test
    public void testRemove(){
        Queue queue = new MyQueue();
        assertThrows(NoSuchElementException.class,() -> queue.remove());
        queue.offer(2);
        queue.offer(3);
        assertEquals(2,queue.remove());
        assertEquals(3,queue.remove());
        assertThrows(NoSuchElementException.class,() -> queue.remove());
    }

    @Test
    public void testPoll(){
        Queue queue = new MyQueue();
        assertEquals(null,queue.poll());
        queue.offer(2);
        queue.offer(3);
        assertEquals(2,queue.poll());
        assertEquals(3,queue.poll());
        assertEquals(null,queue.poll());
    }

    @Test
    public void testElement(){
        Queue queue = new MyQueue();
        assertThrows(NoSuchElementException.class,() -> queue.element());
        queue.offer(2);
        queue.offer(3);
        assertEquals(2,queue.element());
        assertEquals(2,queue.remove());
        assertEquals(3,queue.remove());
        assertThrows(NoSuchElementException.class,() -> queue.element());
    }

    @Test
    public void testPeek(){
        Queue queue = new MyQueue();
        assertEquals(null,queue.peek());
        queue.offer(2);
        queue.offer(3);
        assertEquals(2,queue.peek());
        assertNotEquals(3,queue.peek());
        assertNotEquals(null,queue.peek());
    }
}