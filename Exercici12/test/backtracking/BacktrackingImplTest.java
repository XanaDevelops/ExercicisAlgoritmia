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

        ArrayList<Integer> s = new ArrayList<>();
        s.add(5);
        expResult.add(s);

        s = new ArrayList<>();
        s.add(3);
        s.add(2);
        expResult.add(s);

        s = new ArrayList<>();
        s.add(1);
        s.add(3);
        s.add(1);
        expResult.add(s);

        BacktrackingImpl instance = new BacktrackingImpl();
        ArrayList<ArrayList<Integer>> result = instance.sumM(a, M);
        //assertEquals(expResult, result);
        assertEquals(true, comprobador(expResult, result));

    }

    @Test
    public void test2() {
        int M = 4;
        int a[] = {1, 3, 1, 5, 2};

        ArrayList<ArrayList<Integer>> expResult = new ArrayList<>();
        ArrayList<Integer> s = new ArrayList<>();
        //exp2
        s = new ArrayList<>();
        s.add(3);
        s.add(1);
        expResult.add(s);

        s = new ArrayList<>();
        s.add(1);
        s.add(1);
        s.add(2);
        expResult.add(s);

        s = new ArrayList<>();
        s.add(1);
        s.add(3);
        expResult.add(s);

        BacktrackingImpl instance = new BacktrackingImpl();
        ArrayList<ArrayList<Integer>> result = instance.sumM(a, M);

        assertEquals(true, comprobador(expResult, result));
    }

    @Test
    public void test3() {
        int M = 25;
        int a[] = {1, 3, 1, 5, 2};

        ArrayList<ArrayList<Integer>> expResult = new ArrayList<>();
        ArrayList<Integer> s = new ArrayList<>();


        BacktrackingImpl instance = new BacktrackingImpl();
        ArrayList<ArrayList<Integer>> result = instance.sumM(a, M);

        assertEquals(true, comprobador(expResult, result));
    }

        @Test
    public void test4() {
        int M = 7;
        int a[] = {1, 3, 7, 4, 2, 1, 3};

        ArrayList<ArrayList<Integer>> expResult = new ArrayList<>();
        ArrayList<Integer> s = new ArrayList<>();

        s = new ArrayList<>();
        s.add(7);
        expResult.add(s);

        s = new ArrayList<>();
        s.add(1);
        s.add(3);
        s.add(2);
        s.add(1);
        expResult.add(s);
        
        s = new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(3);
        expResult.add(s);
        
        s = new ArrayList<>();
        s.add(1);
        s.add(3);
        s.add(3);
        expResult.add(s);

        s = new ArrayList<>();
        s.add(1);
        s.add(4);
        s.add(2);
        expResult.add(s);
        
        s = new ArrayList<>();
        s.add(3);
        s.add(1);
        s.add(3);
        expResult.add(s);
        
        s = new ArrayList<>();
        s.add(3);
        s.add(4);
        expResult.add(s);
        
        s = new ArrayList<>();
        s.add(4);
        s.add(2);
        s.add(1);
        expResult.add(s);
        
        s = new ArrayList<>();
        s.add(4);
        s.add(3);
        expResult.add(s);
        
        BacktrackingImpl instance = new BacktrackingImpl();
        ArrayList<ArrayList<Integer>> result = instance.sumM(a, M);
        
        assertEquals(true, comprobador(expResult, result));
    }
    
    @Test
    public void test5() {
        int M = 0;
        int a[] = {2, 3, 2, 5, 2};

        ArrayList<ArrayList<Integer>> expResult = new ArrayList<>();
        ArrayList<Integer> s = new ArrayList<>();

        s = new ArrayList<>(); //no coger ninguno
        expResult.add(s);

        BacktrackingImpl instance = new BacktrackingImpl();
        ArrayList<ArrayList<Integer>> result = instance.sumM(a, M);

        assertEquals(true, comprobador(expResult, result));
    }
    
    @Test
    public void test6() {
        int M = 1;
        int a[] = {2, 3, 2, 5, 2};

        ArrayList<ArrayList<Integer>> expResult = new ArrayList<>();
        ArrayList<Integer> s = new ArrayList<>();

        BacktrackingImpl instance = new BacktrackingImpl();
        ArrayList<ArrayList<Integer>> result = instance.sumM(a, M);

        assertEquals(true, comprobador(expResult, result));
    }
    /**
     * Funcion auxiliar test, por si no coincide el orden esperado de los
     * subconjuntos, pero si estan todos
     *
     * @param exp
     * @param test
     * @return
     */
    private boolean comprobador(ArrayList<ArrayList<Integer>> exp, ArrayList<ArrayList<Integer>> test) {
        System.out.println("Test: "+test);
        System.out.println("Expected: "+exp);
        if(exp.isEmpty() && test.isEmpty()){
            return true;
        }
        for (ArrayList<Integer> subc : exp) {
            if (test.contains(subc)) {
                test.remove(subc);
            }
            else{
                return false;
            }
        }
        return test.isEmpty();
    }
}
