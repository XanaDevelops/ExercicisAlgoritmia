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
import java.lang.NullPointerException;
/**
 *
 * @author danie
 */
public class Exercici6Test {
    
    /**
     *
     */
    public Exercici6Test() {
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
     * Este test comprueba que la busqueda de un elemento que se encuentra  en la parte superior del  array se lleve acabo de forma correcte dandonos la posicion correcta del elemento dentro del array
     */
    @Test
    public void testLimiteSuperior() {
        System.out.println("LimitSuperior");
        Integer elem = 3;
        Integer[] elems = {1,2,3};
        int expResult = Arrays.binarySearch(elems, elem);
        int result = Exercici6.binarySearch(elem, elems);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     *Este test comprueba que la busqueda de un elemento que se encuentra  en la parte inferior del  array se lleve acabo de forma correcte dandonos la posicion correcta del elemento dentro del array
     */
    @Test
    public void testLimiteInferior() {
        System.out.println("LimitInferior");
        Integer elem = 1;
        Integer[] elems = {1,2,3};
        int expResult = Arrays.binarySearch(elems, elem);
        int result = Exercici6.binarySearch(elem, elems);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     *Este test comprueba a ver que passa cuando intentas buscar un elemento que no existe dentro del array i es mas pequeño que el primer elemento que si esxiste dentro del array
     */
    @Test
    public void testForaDeLImitInferior() {
        System.out.println("ForaDeLimitInferior");
        Integer elem = 0;
        Integer[] elems = {1,2,3};
        int expResult = Arrays.binarySearch(elems, elem);
        int result = Exercici6.binarySearch(elem, elems);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     *Este test comprueba a ver que passa cuando intentas buscar un elemento que no existe dentro del array i es mas grande que el ultimo elemento que si esxiste dentro del array
     */
    @Test
    public void testForaDeLImitSuperior() {
        System.out.println("ForaDeLimitSuperior");
        Integer elem = 0;
        Integer[] elems = {1,2,3};
        int expResult = Arrays.binarySearch(elems, elem);
        int result = Exercici6.binarySearch(elem, elems);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }   
    /**
     * Este test mira si se lanza la exception correcta cuando el array o el elemento introducido son nulos
     */
    
    @Test
    public void testBinarySearchWithNullArguments() {
        System.out.println("ValorNull");
        assertThrows(NullPointerException.class, () -> {
            Exercici6.binarySearch(null, null); 
        });
    }
}
