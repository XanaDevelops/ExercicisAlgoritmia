/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package matriu;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author antoni
 */
public class MatriuImplTest {

    private MatriuImpl<Integer> m1;
    private MatriuImpl<Integer> m2;
    private MatriuImpl<Integer> m3;

    private MatriuImpl<Integer> m4, m5, m6, m7;

    @Before
    public void setUp() throws Exception {
        Integer matriu1[] = {0};
        Integer matriu2[] = {0, 1, 2, 3, 1, 2, 2, 2, 3};
        Integer matriu3[] = {0, 1, 2, 1, 1, 2};
        Integer[] mat4 = {4, -5, 0, 3, 8, 7, -9, 1, 3};
        Integer[] mat5 = {1, 3, 5, 3, 8, 2, 5, 2, 666};
        Integer[] mat6 = {1, 3, 5, 0, 3, 8, 2, -7, 5, 2, 666, 666, 0, -7, 666, 777};
        Integer[] mat7 = {1, 3, 5, 0, 3, 8, 2, -7, 5, 2, 666, 667, 0, -7, 666, 777};
        m1 = new MatriuImpl<>(matriu1, 1, 1);
        m2 = new MatriuImpl<>(matriu2, 3, 3);
        m3 = new MatriuImpl<>(matriu3, 2, 3);
        m4 = new MatriuImpl<>(mat4, 3, 3);
        m5 = new MatriuImpl<>(mat5, 3, 3);
        m6 = new MatriuImpl<>(mat6, 4,4);
        m7 = new MatriuImpl<>(mat7, 4,4);
    }   

    /**
     * Test of isSymmetricalRecursiu method, of class MatriuImpl.
     */
    @Test
    public void testIsSymmetricalRecursiu() {
        System.out.println("isSymmetricalRecursiu");
        assertEquals(true, m1.isSymmetricalRecursiu());
        assertEquals(false, m2.isSymmetricalRecursiu());
        assertEquals(false, m3.isSymmetricalRecursiu());
    }

    @Test
    public void testIsSymmetricalRecursiu2() {
        System.out.println("isSymmetricalRecursiu 2");
        assertEquals(false, m4.isSymmetricalRecursiu());
        assertEquals(true, m5.isSymmetricalRecursiu());
        assertEquals(true, m6.isSymmetricalRecursiu());
        assertEquals(false, m7.isSymmetricalRecursiu());
    }
    
    @Test
    public void testIsSymmetricalIteratiu() {
        System.out.println("isSymmetricalIteratiu");
        assertEquals(true, m1.isSymmetricalIteratiu());
        assertEquals(false, m2.isSymmetricalIteratiu());
        assertEquals(false, m3.isSymmetricalIteratiu());
    }

    @Test
    public void testIsSymmetricalIteratiu2() {
        System.out.println("isSymmetricalIteratiu 2");
        assertEquals(false, m4.isSymmetricalIteratiu());
        assertEquals(true, m5.isSymmetricalIteratiu());
        assertEquals(true, m6.isSymmetricalIteratiu());
        assertEquals(false, m7.isSymmetricalIteratiu());
    }

}
