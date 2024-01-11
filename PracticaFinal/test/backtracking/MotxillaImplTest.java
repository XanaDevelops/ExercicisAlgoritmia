/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package backtracking;

import ElementGenerator.Generator;
import ElementGenerator.VideoGame;
import com.opencsv.exceptions.CsvValidationException;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Exemple molt senzill de test.
 *
 * @author antoni
 */
public class MotxillaImplTest {

    //s'usa per els elements this.critScore, this.userScore, this.salesGlobal
    private ElementMotxilla<String> a[];
    private Motxilla m;

    //permet duplicats, però sempre posar en ordre ascendent i min>=1
    private int[][] testIndexes = {{1},
    {1, 3, 4},
    {399, 691, 2814},
    {43, 98, 131, 234}};

    @Before
    public void setUp() {
        a = new ElementMotxilla[5];
        a[0] = new ElementMotxilla("A", 1.0, 2.0, 3.0);
        a[1] = new ElementMotxilla("B", 3.0, 1.0, 7.0);
        a[2] = new ElementMotxilla("C", 2.0, 1.0, 5.0);
        a[3] = new ElementMotxilla("D", 2.0, 1.0, 6.0);
        a[4] = new ElementMotxilla("E", 1.0, 2.0, 5.0);
        m = new MotxillaImpl();

    }

    /**
     * Test of recursiu method, of class MotxillaImpl.
     */
    @Test
    public void testRecursiu() {
        System.out.println("recursiu");
        test(m.recursiu(a, 3.0, 5.0));
    }

    /**
     * Test of iteratiu method, of class MotxillaImpl.
     */
    @Test
    public void testIteratiu() {
        System.out.println("iteratiu");
        test(m.iteratiu(a, 3.0, 5.0));
    }

    /*
    @Test
    public void testGame1Rec() throws IOException, CsvValidationException{
        System.out.println("recursiu TEST TEST"); //test del test
        ElementMotxilla[] result = m.recursiu(gen.generate(test1Indexes), 200, 20);
        for(ElementMotxilla e:result){
            System.out.println("R: "+((VideoGame)e.getElement()).toString());
        }
        assertTrue(true);
    }*/

    @Test
    public void testElem1() {
        try {
            ElementMotxilla[] cases = Generator.generate(testIndexes[0]);

            System.out.println("test 1 element, hi cap");
            System.out.println("Recursiu");
            ElementMotxilla[] resultr = m.recursiu(cases, 9999, 9999);
            assertEquals(1, resultr.length);
            assertEquals("Wii Sports", ((VideoGame) resultr[0].getElement()).getName());
            printGames(resultr);

            System.out.println("Iteratiu");
            ElementMotxilla[] resulti = m.iteratiu(cases, 9999, 9999);
            assertEquals(1, resulti.length);
            assertEquals("Wii Sports", ((VideoGame) resultr[0].getElement()).getName());
            printGames(resulti);
        } catch (IOException | CsvValidationException ex) {
            Logger.getLogger(MotxillaImplTest.class.getName()).log(Level.SEVERE, null, ex);
            fail();
        }
    }

    @Test
    public void testElem1Buit() {
        try {
            ElementMotxilla[] cases = Generator.generate(testIndexes[0]);

            System.out.println("test 1 element, no hi cap");
            System.out.println("Recursiu");
            ElementMotxilla[] resultr = m.recursiu(cases, 1, 1);
            assertEquals(0, resultr.length);

            System.out.println("Iteratiu");
            ElementMotxilla[] resulti = m.iteratiu(cases, 1, 1);
            assertEquals(0, resulti.length);
        } catch (IOException | CsvValidationException ex) {
            Logger.getLogger(MotxillaImplTest.class.getName()).log(Level.SEVERE, null, ex);
            fail();
        }
    }

    @Test
    public void testElem3w1() {
        try {
            ElementMotxilla[] cases = Generator.generate(testIndexes[1]);

            System.out.println("test 3 elements, same w2");
            System.out.println("Recursiu");
            ElementMotxilla[] resultr = m.recursiu(cases, 160, 16);
            assertEquals(2, resultr.length);
            assertEquals(158, ElementMotxilla.w1(resultr), 0);
            assertEquals(16, ElementMotxilla.w2(resultr), 0);
            printGames(resultr);

            System.out.println("Iteratiu");
            ElementMotxilla[] resulti = m.iteratiu(cases, 160, 16);
            assertEquals(2, resulti.length);
            assertEquals(158, ElementMotxilla.w1(resulti), 0);
            assertEquals(16, ElementMotxilla.w2(resulti), 0);
            printGames(resulti);
        } catch (IOException | CsvValidationException ex) {
            Logger.getLogger(MotxillaImplTest.class.getName()).log(Level.SEVERE, null, ex);
            fail();
        }
    }

    @Test
    public void testElem3w2() {
        try {
            ElementMotxilla[] cases = Generator.generate(testIndexes[2]);

            System.out.println("test 3 elements, same w1");
            System.out.println("Recursiu");
            ElementMotxilla[] resultr = m.recursiu(cases, 150, 16);
            assertEquals(2, resultr.length);
            assertEquals(150, ElementMotxilla.w1(resultr), 0);
            assertEquals(10, ElementMotxilla.w2(resultr), 0);
            printGames(resultr);

            System.out.println("Iteratiu");
            ElementMotxilla[] resulti = m.iteratiu(cases, 150, 16);
            assertEquals(2, resulti.length);
            assertEquals(150, ElementMotxilla.w1(resulti), 0);
            assertEquals(10, ElementMotxilla.w2(resulti), 0);
            printGames(resulti);
        } catch (IOException | CsvValidationException ex) {
            Logger.getLogger(MotxillaImplTest.class.getName()).log(Level.SEVERE, null, ex);
            fail();
        }
    }
    
    @Test
    public void testElem4() {
        try {
            ElementMotxilla[] cases = Generator.generate(testIndexes[3]);

            System.out.println("test 4 elements, 1 max");
            System.out.println("Recursiu");
            ElementMotxilla[] resultr = m.recursiu(cases, 100, 10);
            assertEquals(1, resultr.length);
            assertEquals(97, ElementMotxilla.w1(resultr), 0);
            assertEquals(8, ElementMotxilla.w2(resultr), 0);
            assertEquals(12.61, ElementMotxilla.profit(resultr),0);
            printGames(resultr);

            System.out.println("Iteratiu");
            ElementMotxilla[] resulti = m.iteratiu(cases, 150, 16);
            assertEquals(1, resulti.length);
            assertEquals(97, ElementMotxilla.w1(resulti), 0);
            assertEquals(8, ElementMotxilla.w2(resulti), 0);
            assertEquals(12.61, ElementMotxilla.profit(resulti),0);
            printGames(resulti);
        } catch (IOException | CsvValidationException ex) {
            Logger.getLogger(MotxillaImplTest.class.getName()).log(Level.SEVERE, null, ex);
            fail();
        }
    }

    private void test(ElementMotxilla[] result) {
        assertEquals(3.0, ElementMotxilla.w1(result), 0.0);
        assertEquals(3.0, ElementMotxilla.w2(result), 0.0);
        assertEquals(11.0, ElementMotxilla.profit(result), 0.0);
        assertEquals(2, result.length);
        assertEquals("D", result[0].getElement());
        assertEquals("E", result[1].getElement());
    }

    private void printGames(ElementMotxilla[] result) {
        System.out.println("Result:");
        for (ElementMotxilla x : result) {
            System.out.println((VideoGame) x.getElement());
        }
    }
}
