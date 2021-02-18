package JUnitTests;

import DataStructureInterfaces.List;
import DataStructureInterfaces.LinkedListFunctions;
import Implementations.MyList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyListTest {
    @Test
    public void testAdd(){
        List list = new MyList();
        assertTrue(list.add("A"));
        assertTrue(list.contains("A"));
        for (int i=0;i<10;i++){
            assertTrue(list.add(i));
        }
    }

    @Test
    public void testSize(){
        List list = new MyList();
        assertEquals(0,list.size());
        list.add("A");
        assertEquals(1,list.size());
    }

    @Test
    public void testIsEmpty(){
        List list = new MyList();
        assertTrue(list.isEmpty());
        list.add("A");
        assertFalse(list.isEmpty());
    }

    @Test
    public void testContains(){
        List list = new MyList();
        assertFalse(list.contains("A"));
        list.add("A");
        assertTrue(list.contains("A"));
        assertFalse(list.contains("a"));
    }

    @Test
    public void testRemove(){
        List list = new MyList();
        assertFalse(list.remove("a"));
        list.add("a");
        assertTrue(list.remove("a"));
        list.add("a");
        list.add("b");
        assertTrue(list.remove("b"));
        assertEquals(1,list.size());
        assertFalse(list.contains("b"));
        assertTrue(list.contains("a"));
    }

    @Test
    public void testClear(){
        List list = new MyList();
        for (int i=0;i<10;i++)
            list.add(i);
        assertEquals(10,list.size());
        list.clear();
        assertEquals(0,list.size());
    }

    @Test
    public void testGet(){
        List list = new MyList();
        for (int i=0;i<10;i++)
            list.add(String.valueOf(i));
        assertEquals(null,list.get(10));
        assertEquals("9",list.get(9));
        assertNotEquals(9,list.get(9));
        assertEquals(null,list.get(-1));
        assertNotEquals(null,list.get(0));
    }

    @Test
    public void testRemoveWithIndex(){
        List list = new MyList();
        for (int i=0;i<10;i++) {
            list.add(String.valueOf(i + 1));
        }
        assertNull(list.remove(10));
        assertEquals("10",list.remove(9));
        assertEquals("8",list.remove(7));
        assertNotEquals("8",list.remove(7));
        assertNull(list.remove(-1));
        assertNotEquals(null,list.remove(1));
    }

    @Test
    public void testRotation(){
        LinkedListFunctions list = new MyList();
        for (int i=1;i<=7;i++)
            list.add(i);
        assertEquals(1,list.get(0));
        list.rotate(3,list.size());
        assertEquals(5,list.get(0));
        list.rotate(3,list.size());
        assertEquals(2,list.get(0));
    }
}