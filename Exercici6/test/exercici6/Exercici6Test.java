/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package exercici6;

import java.util.Arrays;
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
public class Exercici6Test {
    
    public Exercici6Test() {
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
     * Test of main method, of class Exercici6.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Exercici6.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of binarySearch method, of class Exercici6.
     */
    @Test
    public void testBinarySearch_GenericType_GenericType() {
        System.out.println("binarySearch");
        Integer elem = 3;
        Integer[] elems = {1,2,3};
        int expResult = Arrays.binarySearch(elems, elem);
        int result = Exercici6.binarySearch(elem, elems);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of binarySearch method, of class Exercici6.
     */
    @Test
    public void testBinarySearch_3args() {
        fail("TODO");
        System.out.println("binarySearch");
        int expResult = 0;
        int result = Exercici6.binarySearch(null, null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
