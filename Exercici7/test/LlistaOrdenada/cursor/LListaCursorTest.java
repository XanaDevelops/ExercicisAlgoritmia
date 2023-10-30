/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LlistaOrdenada.cursor;

import LlistaOrdenada.cursor.LListaCursor;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author trufi
 */
public class LListaCursorTest {

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
    @Test
    public void testRemove2() {
        System.out.println("remove2");
        LListaCursor<Integer> instance = new LListaCursor(3, Integer.class);
        instance.add(3);
        instance.add(1);
        instance.add(9);
        instance.remove(3);
        assertEquals("1,9,", instance.toString());
        instance.remove(2);
        assertEquals("1,9,", instance.toString());
        instance.remove(1);
        assertEquals("9,", instance.toString());
        instance.remove(9);
        
    }

}
