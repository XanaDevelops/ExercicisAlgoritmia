/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cerques;

/**
 *
 * @author danie
 */
public class Iteratives {

    public static <E extends Comparable<E>> int cLineal(E elem, E[] elems) {
        if (elem == null || elems == null) {
            throw new NullPointerException();
        }
        if (elems.length == 0) {
            return -1;
        }

        for (int i = 0; i < elems.length; i++) {
            if (elems[i].compareTo(elem) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static <E extends Comparable<E>> int cBinaria(E elem, E[] elems) {
        if (elem == null || elems == null) {
            throw new NullPointerException();
        }
        if (elems.length == 0) {
            return -1;
        }
        int l = 0, h = elems.length - 1;
        while (l <= h) {
            int m = (l + h) >>> 1; //lsr 1, evita overflows

            if (elem.compareTo(elems[m]) == 0) {
                return m;
            }

            if (elem.compareTo(elems[m]) > 0) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return -1;
    }
}
