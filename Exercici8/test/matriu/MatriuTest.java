/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package matriu;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daniel
 */
public class MatriuTest {
    
    public MatriuTest() {
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

    @Test
    /**
     * Test inserccion datos
     */
    public void testIns(){
        Matriu<Integer> m = new Matriu<>(2,2,Integer.class);
        m.set(1, 0, 0);
        m.set(2,1,0);
        m.set(3,0,1);
        m.set(4,1,1);
        System.out.println(m);
        m.get(0,0);
    }
    
    /**
     * Test of mult method, of class Matriu.
     */
    @Test
    public void testMult() {
        assertTrue(true);
    }
    
}
