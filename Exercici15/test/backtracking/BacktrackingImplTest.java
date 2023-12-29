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
     * Test of mapColor method, of class BacktrackingImpl.
     */
    @Test
    public void testMapColor() {
        System.out.println("mapColor");
        int[][] map = {{1,3},{0,2,3,4},{1,4},{0,1},{1,2}};
        int nColors = 3;
        BacktrackingImpl instance = new BacktrackingImpl();
        boolean expResult = true;
        boolean result = instance.mapColor(map, nColors);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSingle(){
        System.out.println("1 color, mapa vacio");
        int[][] map = {{}};
        int nColors = 1;
        BacktrackingImpl instance = new BacktrackingImpl();
        boolean expResult = true;
        boolean result = instance.mapColor(map, nColors);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVecino(){
        System.out.println("1 color, 2 vecinos");
        int[][] map = {{1},{0}};
        int nColors = 1;
        BacktrackingImpl instance = new BacktrackingImpl();
        boolean expResult = false;
        boolean result = instance.mapColor(map, nColors);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVecinoTrue(){
        System.out.println("2 color, 2 vecinos");
        int[][] map = {{1},{0}};
        int nColors = 2;
        BacktrackingImpl instance = new BacktrackingImpl();
        boolean expResult = true;
        boolean result = instance.mapColor(map, nColors);
        assertEquals(expResult, result);
    }
    
}
