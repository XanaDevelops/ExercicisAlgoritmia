/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package cerques;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author danie
 */
public class RecursivesTest {

    private static final Integer[] array = new Integer[1000000];
    private static final int TEST1 = 0, TEST2 = 100000, TEST3 = 10000000;

    private static final int[] TESTS = {TEST1, TEST2, TEST3};
    private static final int[] SOLS = {TEST1, TEST2, -1};

    @Rule
    public ExpectedException stackOV = ExpectedException.none();

    public RecursivesTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        stackOV = ExpectedException.none();

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of cLineal method, of class Recursives.
     */
    @Test
    public void testCLineal() {
        System.out.println("cLineal");
        CResult cr = Recursives.cLineal(TESTS[0], array);
        assertEquals(SOLS[0], cr.getResult());
        System.out.println("Accessos: "+cr.getAccess());
        
    }
    @Test
    public void testCLinealStackOverflow(){
        stackOV.expect(StackOverflowError.class);
        CResult cr;
        for (int i = 1; i < TESTS.length; i++) {
            System.out.println(i);
            cr = Recursives.cLineal(TESTS[i], array);
            assertEquals(SOLS[i], cr.getResult());
        }
    }

    /**
     * Test of cBinaria method, of class Recursives.
     */
    @Test
    public void testCBinaria() {
        System.out.println("cBinaria");

        for (int i = 0; i < TESTS.length; i++) {
            System.out.println(i);
            CResult cr = Recursives.cBinaria(TESTS[i], array);
            assertEquals(SOLS[i], cr.getResult());
            System.out.println("Accessos: "+cr.getAccess());
        }
    }

}
