package JUnitTests;

import DataStructureInterfaces.Map;
import Implementations.MyMap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMapTest {
    @Test
    public void testSize(){
        Map map = new MyMap();
        assertEquals(0,map.size());
        map.put("A",1);
        assertEquals(1,map.size());
        map.put("A",2);
        assertEquals(1,map.size());
        assertEquals(2,map.get("A"));
        assertNotEquals(1,map.get("A"));
        map.put("B",2);
        assertEquals(2,map.size());
    }

    @Test
    public void testIsEmpty(){
        Map map = new MyMap();
        assertTrue(map.isEmpty());
        map.put("A",3);
        assertFalse(map.isEmpty());
    }

    @Test
    public void testContainsKey(){
        Map map = new MyMap();
        assertFalse(map.containsKey("A"));
        assertFalse(map.containsKey(null));
        map.put("A",3);
        map.put("B",4);
        assertTrue(map.containsKey("A"));
        assertTrue(map.containsKey("B"));
        assertFalse(map.containsKey("C"));
    }

    @Test
    public void testContainsValue(){
        Map map = new MyMap();
        assertFalse(map.containsValue("A"));
        assertFalse(map.containsValue(null));
        map.put("A",3);
        map.put("B",4);
        assertTrue(map.containsValue(3));
        assertTrue(map.containsValue(4));
        assertFalse(map.containsValue("A"));
        assertFalse(map.containsValue(5));
    }

    @Test
    public void testGet(){
        Map map = new MyMap();
        assertEquals(null,map.get("A"));
        assertEquals(null,map.get(null));
        map.put("A",3);
        map.put("B",4);
        assertEquals(3,map.get("A"));
        assertEquals(4,map.get("B"));
        assertNotEquals(4,map.get("A"));
        assertEquals(null,map.get("C"));
    }

    @Test
    public void testPut(){
        Map map = new MyMap();
        assertEquals(0,map.size());
        assertEquals(1,map.put("A",1));
        assertNotEquals(2,map.put("B",3));
        assertEquals(2,map.size());
    }

    @Test
    public void testRemove(){
        Map map = new MyMap();
        assertEquals(null,map.remove("a"));
        map.put("a",1);
        assertEquals(1,map.remove("a"));
        map.put("b",2);
        map.put("c",3);
        assertEquals(2,map.remove("b"));
        assertEquals(3,map.remove("c"));
        assertEquals(null,map.remove("a"));
    }

    @Test
    public void testClear(){
        Map map = new MyMap();
        for (int i=0;i<10;i++)
            assertEquals(i+1,map.put(i,i+1));
        assertEquals(10,map.size());
        map.clear();
        assertEquals(0,map.size());
    }

}