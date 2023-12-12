/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package heap;

import java.util.Arrays;
import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author antoni
 */
public class HeapSortImplTest {
    
    public HeapSortImplTest() {
    }

    /**
     * Test of heapSort method, of class HeapSortImpl.
     */
    @Test
    public void testHeapSort() {
        System.out.println("heapSort");
        Integer a[] = new Integer[100];
        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
        }

        HeapSortImpl<Integer> hs = new HeapSortImpl<>();
        hs.heapSort(a);

        boolean result = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                result = false;
            }
        }
        assertEquals(true, result);
    }
    
    @Test
    public void testHeapSort1() {
        System.out.println("heapSort1n");
        Integer a[] = new Integer[100];
        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(-100, 100);
        }

        HeapSortImpl<Integer> hs = new HeapSortImpl<>();
        hs.heapSort(a);

        boolean result = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                result = false;
            }
        }
        assertEquals(true, result);
    }
    
    @Test
    public void testHeapSort2() {
        System.out.println("heapSort2");
        Integer a[] = new Integer[10];
        Random r = new Random();

        
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
        }

        System.out.println(Arrays.toString(a));
        HeapSortImpl<Integer> hs = new HeapSortImpl<>();
        hs.heapSort(a);
        System.out.println(Arrays.toString(a));

        boolean result = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                result = false;
            }
        }
        assertEquals(true, result);
    }
    
    @Test
    public void testHeapSort3() {
        System.out.println("heapSort3");
        Character a[] = new Character[20];
        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = (char)r.nextInt(97,123);
        }

        System.out.println(Arrays.toString(a));
        HeapSortImpl<Character> hs = new HeapSortImpl<>();
        hs.heapSort(a);
        System.out.println(Arrays.toString(a));

        boolean result = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                result = false;
            }
        }
        assertEquals(true, result);
    }
    
    @Test
    public void testHeapSort4() {
        System.out.println("heapSort4");
        Character a[] = new Character[1];
        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = (char)r.nextInt(97,123);
        }

        System.out.println(Arrays.toString(a));
        HeapSortImpl<Character> hs = new HeapSortImpl<>();
        hs.heapSort(a);
        System.out.println(Arrays.toString(a));

        boolean result = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                result = false;
            }
        }
        assertEquals(true, result);
    }
    
    @Test
    public void testHeapSort5() {
        System.out.println("heapSort5");
        Integer a[] = new Integer[20];
        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        System.out.println(Arrays.toString(a));
        HeapSortImpl<Integer> hs = new HeapSortImpl<>();
        hs.heapSort(a);
        System.out.println(Arrays.toString(a));

        boolean result = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                result = false;
            }
        }
        assertEquals(true, result);
    }
    
    @Test
    public void testHeapSort6() {
        System.out.println("heapSort6");
        Integer a[] = new Integer[20];
        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = a.length-i;
        }

        System.out.println(Arrays.toString(a));
        HeapSortImpl<Integer> hs = new HeapSortImpl<>();
        hs.heapSort(a);
        System.out.println(Arrays.toString(a));

        boolean result = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                result = false;
            }
        }
        assertEquals(true, result);
    }
}
