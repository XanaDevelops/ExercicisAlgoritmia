/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package backtracking;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author antoni
 */
public class BacktrackingImplTest {
    
//        /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        int M = 5;
//        int a[] = {1, 3, 1, 5, 2};
//        //int a[] = {1, 5, 2};
//
//        //sumM(a, M);
//    }

    /**
     * Test of sumM method, of class BacktrackingImpl.
     */
    @Test
    public void testSumM() {
        System.out.println("sumM");
        int M = 5;
        int a[] = {1, 3, 1, 5, 2};
        ArrayList<ArrayList<Integer>> expResult = new ArrayList<>();
        ArrayList<ArrayList<Integer>> expResult2 = new ArrayList<>();
        
        ArrayList<Integer> s = new ArrayList<>();
        s.add(5);
        expResult.add(s);
        
        s = new ArrayList<>();
        s.add(3);s.add(2);
        expResult.add(s);
        
        s = new ArrayList<>();
        s.add(1);s.add(3);s.add(1);
        expResult.add(s);
        
        s = new ArrayList<>();
        s.add(1);s.add(3);
        expResult2.add(s);
        
        s = new ArrayList<>();
        s.add(3);s.add(1);
        expResult2.add(s);
        
        s = new ArrayList<>();
        s.add(1);s.add(1);s.add(2);
        expResult2.add(s);

        BacktrackingImpl instance = new BacktrackingImpl();
        ArrayList<ArrayList<Integer>> result = instance.sumM(a, M);
        assertEquals(expResult, result);
        
        result = instance.sumM(a, 4);
        assertEquals(expResult2, result);

    }
}
