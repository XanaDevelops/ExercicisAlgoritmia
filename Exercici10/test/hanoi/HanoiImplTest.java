package hanoi;

import java.util.Stack;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author antoni
 */
public class HanoiImplTest {

    private Stack<Integer> a;
    private Stack<Integer> b;
    private Stack<Integer> c;
    private Stack<Integer> copyAInit;
    private int h;

    @Before
    public void setUp() {
        a = new Stack();
        b = new Stack();
        c = new Stack();
        h = 5;
        for (int i = h; i > 0; i--) {
            a.push(i);
        }
        copyAInit = (Stack<Integer>) a.clone();
    }

    @Test
    public void testRecursiuHanoi() {
        System.out.println("recursiuHanoi");
        assertEquals(true, a.equals(copyAInit));
        assertEquals(true, b.isEmpty());
        assertEquals(true, c.isEmpty());
        Hanoi pHanoi = new HanoiImpl();
        pHanoi.recursiuHanoi(h, a, b, c);
        assertEquals(true, a.isEmpty());
        assertEquals(true, b.isEmpty());
        assertEquals(true, c.equals(copyAInit));
    }

    @Test
    public void HanoiUnDisco() {

        a = new Stack();
        b = new Stack();
        c = new Stack();
        h = 1;
        for (int i = h; i > 0; i--) {
            a.push(i);
        }
        copyAInit = (Stack<Integer>) a.clone();
        System.out.println("hanoi1disco");
        assertEquals(true, a.equals(copyAInit));
        assertEquals(true, b.isEmpty());
        assertEquals(true, c.isEmpty());
        Hanoi pHanoi = new HanoiImpl();
        pHanoi.recursiuHanoi(h, a, b, c);
        assertEquals(true, a.isEmpty());
        assertEquals(true, b.isEmpty());
        assertEquals(true, c.equals(copyAInit));
    }

    @Test
    public void HanoiTresDiscos() {

        a = new Stack();
        b = new Stack();
        c = new Stack();
        h = 3;
        for (int i = h; i > 0; i--) {
            a.push(i);
        }
        copyAInit = (Stack<Integer>) a.clone();
        System.out.println("hanoi3discos");
        assertEquals(true, a.equals(copyAInit));
        assertEquals(true, b.isEmpty());
        assertEquals(true, c.isEmpty());
        Hanoi pHanoi = new HanoiImpl();
        pHanoi.recursiuHanoi(h, a, b, c);
        assertEquals(true, a.isEmpty());
        assertEquals(true, b.isEmpty());
        assertEquals(true, c.equals(copyAInit));
    }

}
