/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package backtracking;

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
    public void testKnapSack() {
        System.out.println("knapSack");
        int W = 3;
        int w[] = {2, 3, 2, 1};
        int p[] = {3, 3, 1, 10};
        int[] expResult = {1, 0, 0, 1};
        BacktrackingImpl instance = new BacktrackingImpl();
        int[] result = instance.knapSack(W, w, p);
        assertArrayEquals(expResult, result);
    }
    
}
