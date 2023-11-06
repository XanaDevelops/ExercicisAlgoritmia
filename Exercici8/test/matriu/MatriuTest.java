/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package matriu;

import matriu.excepciones.DimensionNoAdecuada;
import matriu.excepciones.NoMultiplicable;
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
     * @throws matriu.excepciones.DimensionNoAdecuada
     */
    @Test
    public void testMult() throws DimensionNoAdecuada {
        Matriu<Integer> a = new Matriu(3, 3, Integer.class);
        Integer[] aval = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        a.actualizarMat(aval);
        System.out.println(a.toString());
        Matriu<Integer> b = new Matriu(3, 3, Integer.class);
        b.actualizarMat(aval);
        System.out.println(b.toString());
        Matriu<Integer> c = null;
        
        Matriu<Integer> r = new Matriu<>(3,3,Integer.class);
        r.actualizarMat(new Integer[]{15,18,21,42,54,66,69,90,111});
        
        try {
            c = a.mult(b);
        } catch (NoMultiplicable e) {
        }
        assertEquals(r.toString(), c.toString());
    }
    
}
