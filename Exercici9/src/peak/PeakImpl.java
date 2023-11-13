package peak;

import java.awt.Point;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author antoni
 */
public class PeakImpl implements Peak {

    /**
     * @pre (A.lenght≥3)∧∃!j(A.lenght-1>j>1)∧(∀i:0≤i≤j:Aj>Ai)∧(∀k:A.lenght>K>j:Aj>Ak)
     * @post ∃!j:A.lenght-1>j>1:(max(A)==Aj)∧(Aj+1>Aj>Aj-1)
     *Aquest metode retorna al elemnt del cim que estroba dins un arrays de enters 
     * @param a array que va creixent fins que arriba a un maxim despres decreix fins al final del array 
     * @return retorna un enter que es el nombre maxim del array 
     */
    @Override
    public Point peak(int[] a) {
        Point p = new Point();
        int r = cBinaria(a);
        p.x = a[r];
        p.y = r;
        return p;
    }

    /**
     * Cerca binaria recursiva
     *
     * @pre elements no nulls ordenats
     * @post index element 
     * @ord O(log(n)) al dividir per 2 cada recursió
     * @param <E> tipues element
     * @param elems array de elements
     * @return index element o -1 si no
     */
    public static <E extends Comparable<E>> int cBinaria(int[] elems) {
        if (elems == null) {
            throw new NullPointerException();
        }
        if (elems.length == 0) {
            return -1;
        }

        return cBinaria(elems, 0, elems.length - 1);
    }

    private static <E extends Comparable<E>> int cBinaria(int[] elems, int l, int h) {
        if (l > h) {
            return -1;
        }
        int m = (l + h) >>> 1;
        int elem = elems[m];
        //System.err.println("elem " + elem+" lmh "+l+" "+m+" "+h);
        //se podria hacer un switch para hacer solo una comparación
        //int lC = elem.compareTo(elems[m-1]);
        //int rC = elem.compareTo(elems[m+1]);
        int lC = elems[m-1]-elem;
        int rC = elems[m+1]-elem;
        if (lC < 0 && rC <0) {
            return m;
        }
        if (rC > 0) {
            return cBinaria(elems, m + 1, h);
        } else {
            return cBinaria(elems, l, m - 1);
        }
    }

}
