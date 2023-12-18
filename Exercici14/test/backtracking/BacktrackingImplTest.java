/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package backtracking;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author antoni
 */
public class BacktrackingImplTest {
    
    public BacktrackingImplTest() {
    }

    /**
     * Test of knapSack method, of class BacktrackingImpl.
     */
    @Test
    public void testKnapSack1() {
        System.out.println("knapSack1");
        int W = 3;
        int w[] = {2, 3, 2, 1};
        int p[] = {3, 3, 1, 10};
        int[] expResult = {1, 0, 0, 1};
        BacktrackingImpl instance = new BacktrackingImpl();
        int[] result = instance.knapSack(W, w, p);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(expResult, result);
    }
    
    /**
     * Test of knapSack method, of class BacktrackingImpl.
     */
    @Test
    public void testKnapSack2() {
        System.out.println("knapSack2");
        int W = 0;
        int w[] = {2, 3, 2, 1};
        int p[] = {3, 3, 1, 10};
        int[] expResult = {0, 0, 0, 0};
        BacktrackingImpl instance = new BacktrackingImpl();
        int[] result = instance.knapSack(W, w, p);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(expResult, result);
    }
    
    /**
     * Test of knapSack method, of class BacktrackingImpl.
     */
    @Test
    public void testKnapSack3() {
        System.out.println("knapSack3");
        int W = 99;
        int w[] = {2, 3, 2, 1};
        int p[] = {3, 3, 1, 10};
        int[] expResult = {1, 1, 1, 1};
        BacktrackingImpl instance = new BacktrackingImpl();
        int[] result = instance.knapSack(W, w, p);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(expResult, result);
    }
    
    /**
     * Test of knapSack method, of class BacktrackingImpl.
     */
    @Test
    public void testKnapSack4() {
        System.out.println("knapSack4");
        int W = 3;
        int w[] = {12, 53, 4, 5};
        int p[] = {3, 3, 1, 10};
        int[] expResult = {0, 0, 0, 0};
        BacktrackingImpl instance = new BacktrackingImpl();
        int[] result = instance.knapSack(W, w, p);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(expResult, result);
    }
    
    /**
     * Test of knapSack method, of class BacktrackingImpl.
     */
    @Test
    public void testKnapSack5() {
        System.out.println("knapSack5");
        int W = 5;
        int w[] = {2, 3, 2, 1};
        int p[] = {3, 3, 1, 10};
        int[] expResult = {1, 0, 1, 1};
        BacktrackingImpl instance = new BacktrackingImpl();
        int[] result = instance.knapSack(W, w, p);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(expResult, result);
    }
}
