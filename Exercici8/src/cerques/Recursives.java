/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cerques;

/**
 *
 * @author danie
 */
public class Recursives {

    public static <E extends Comparable<E>> int cLineal(E elem, E[] elems) {
        if (elem == null || elems == null) {
            throw new NullPointerException();
        }
        if (elems.length == 0) {
            return -1;
        }

        return cLineal(elem, elems, 0);
    }

    private static <E extends Comparable<E>> int cLineal(E elem, E[] elems, int i) {
        if (i >= elems.length) {
            return -1;
        }
        if (elems[i].compareTo(elem) == 0) {
            return i;
        }
        return cLineal(elem, elems, i++);
    }

    public static <E extends Comparable<E>> int cBinaria(E elem, E[] elems) {
        if (elem == null || elems == null) {
            throw new NullPointerException();
        }
        if (elems.length == 0) {
            return -1;
        }

        return cBinaria(elem, elems, 
                0, (0 + elems.length) >>> 1, elems.length-1);
    }

    private static <E extends Comparable<E>> int cBinaria(E elem, E[] elems, int l, int m, int h) {
        if(l>h){
            return -1;
        }
        m = (l + h) >>> 1;
        //System.err.println("elem " + elem+" lmh "+l+" "+m+" "+h);
        if (elem.compareTo(elems[m]) == 0) {
            return m;
        }

        if (elem.compareTo(elems[m]) > 0) {
            return cBinaria(elem, elems, 
                    m + 1, m, h);
        } else {
            return cBinaria(elem, elems, 
                    l, m, m-1);
        }
    }
}
