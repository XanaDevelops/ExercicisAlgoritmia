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

    private ElementMotxilla<String> a[];
    private Motxilla m;
    
    private Generator gen;
    private ElementMotxilla<VideoGame> games[];
    private int[] test1Indexes = {1,3,4,7};

    @Before
    public void setUp() {
        a = new ElementMotxilla[5];
        a[0] = new ElementMotxilla("A", 1.0, 2.0, 3.0);
        a[1] = new ElementMotxilla("B", 3.0, 1.0, 7.0);
        a[2] = new ElementMotxilla("C", 2.0, 1.0, 5.0);
        a[3] = new ElementMotxilla("D", 2.0, 1.0, 6.0);
        a[4] = new ElementMotxilla("E", 1.0, 2.0, 5.0);
        m = new MotxillaImpl();
        try {
            gen = new Generator();
        } catch (IOException ex) {
            Logger.getLogger(MotxillaImplTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CsvValidationException ex) {
            Logger.getLogger(MotxillaImplTest.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    
    @Test
    public void testGame1Rec() throws IOException, CsvValidationException{
        System.out.println("recursiu 1");
        ElementMotxilla[] result = m.recursiu(gen.generate(test1Indexes), 200, 20);
        for(ElementMotxilla e:result){
            System.out.println("R: "+((VideoGame)e.getElement()).toString());
        }
               
                
        assertTrue(true);
    }

    private void test(ElementMotxilla[] result) {
        assertEquals(3.0, ElementMotxilla.w1(result), 0.0);
        assertEquals(3.0, ElementMotxilla.w2(result), 0.0);
        assertEquals(11.0, ElementMotxilla.profit(result), 0.0);
        assertEquals(2, result.length);
        assertEquals("D", result[0].getElement());
        assertEquals("E", result[1].getElement());
    }
}
