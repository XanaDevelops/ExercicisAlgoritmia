/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package LlistaOrdenada.refs;

import LlistaOrdenada.cursor.LListaCursor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danie
 */
public class LlistaOrdreTest {
    
    public LlistaOrdreTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class LlistaOrdre.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Integer a = 3;
        LlistaOrdre<Integer> instance = new LlistaOrdre<>();
        instance.add(a);
        assertTrue(!instance.isEmpty());
        assertTrue(instance.contains(a));
    }
    
    /**
     * Test of add method, of class LlistaOrdre.
     */
    @Test
    public void testAdd2() {
        System.out.println("add2");
        Integer[] a = {2,4,6,8};
        LlistaOrdre<Integer> instance = new LlistaOrdre<>();
        for(int x:a){
            instance.add(x);
        }
        assertEquals("2,4,6,8,",instance.toString());
        assertTrue(!instance.isEmpty());
        instance.add(3);
        instance.add(1);
        instance.add(9);
        assertEquals("1,2,3,4,6,8,9,", instance.toString());
    }

    /**
     * Test of clear method, of class LlistaOrdre.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        LlistaOrdre instance = new LlistaOrdre();
        instance.add(3);
        instance.add(1);
        instance.add(9);
        assertTrue(!instance.isEmpty());
        instance.clear();
        assertTrue(instance.isEmpty());

    }

    /**
     * Test of contains method, of class LlistaOrdre.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        LlistaOrdre instance = new LlistaOrdre();
        instance.add(3);
        instance.add(1);
        instance.add(9);
        boolean result = instance.contains(3);
        assertEquals(true, result);
        assertTrue(!instance.contains(0));
    }

    /**
     * Test of isEmpty method, of class LlistaOrdre.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        LlistaOrdre instance = new LlistaOrdre();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);

    }

    /**
     * Test of remove method, of class LlistaOrdre.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        LlistaOrdre instance = new LlistaOrdre();
        instance.add(3);
        instance.add(1);
        instance.add(9);
        instance.remove(3);
        assertEquals("1,9,",instance.toString());
        instance.remove(2);
        assertEquals("1,9,",instance.toString());
        instance.remove(1);
        assertEquals("9,", instance.toString());
        instance.remove(9);
        assertTrue(instance.isEmpty());
        instance.add(3);
        instance.add(1);
        instance.add(9);
        instance.remove(9);
        assertEquals("1,3,",instance.toString());
    }

   
    
    
    @Test
    public void testContains2() {
        System.out.println("contains2");
         LListaCursor<Integer> instance = new LListaCursor(3, Integer.class);
        instance.add(3);
        instance.add(1);
        instance.add(9);
        boolean result = instance.contains(3);
        assertEquals(true, result);
        assertTrue(!instance.contains(0));
    }

    /**
     * Test of isEmpty method, of class LlistaOrdre.
     */
    @Test
    public void testIsEmpty2() {
        System.out.println("isEmpty2");
         LListaCursor<Integer> instance = new LListaCursor(3, Integer.class);
        instance.add(3);
        instance.add(1);
        instance.add(9);
        
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);

    }

    /**
     * Test of remove method, of class LlistaOrdre.
     */
    
      
    
    
    
}
