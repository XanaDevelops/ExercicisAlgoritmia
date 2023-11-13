/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package peak;

import java.awt.Point;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author antoni
 */
public class PeakImplTest {
    
    /**
     * Test of peak method, of class PeakImpl.
     */
    @Test
    public void testPeak() {
        System.out.println("peak");
        int[] a = {1,3,5,7,8,5,2,1};
        Point expResult = new Point(8,4);
        Peak p = new PeakImpl();
        Point result = p.peak(a);
        assertEquals(expResult, result);
    }
    @Test
    public void testPeak2() {
        System.out.println("peak2");
        int[] a = {1,8,5,4,3,2,1,0};
        Point expResult = new Point(8,1);
        Peak p = new PeakImpl();
        Point result = p.peak(a);
        assertEquals(expResult, result);
    }
    @Test
    public void extremDret() {
        System.out.println("extremDret");
        int[] a = {1,2,3,4,5,6,7,9};
        Point expResult =null;
        Peak p = new PeakImpl();
        Point result = p.peak(a);
        assertEquals(expResult, result);
    }
    @Test
    public void extremEsquerra() {
        System.out.println("extremEsquerra");
        int[] a = {9,8,7,6,5,4,3,2,1};
        Point expResult =null;
        Peak p = new PeakImpl();
        Point result = p.peak(a);
        assertEquals(expResult, result);
    } 
    @Test
    public void arrayMenor3() {
        System.out.println("extremEsquerra");
        int[] a = {9,8};
        Peak p = new PeakImpl();
        assertEquals(null, p.peak(a));
    } 
}
