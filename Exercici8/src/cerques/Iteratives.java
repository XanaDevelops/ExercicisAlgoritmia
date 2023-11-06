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

    /**
     * Cerca lineal iterativa
     * @pre: elements no nuls ordenats
     * @post: index element o -1
     * @ord O(n) al ser lineal
     * @param <E> tipues element
     * @param elem  element a cercar
     * @param elems array de elements
     * @return index element o -1 si no
     */
    public static <E extends Comparable<E>> CResult cLineal(E elem, E[] elems) {
        if (elem == null || elems == null) {
            throw new NullPointerException();
        }
        if (elems.length == 0) {
            return new CResult(-1, 0);
        }
        int i;
        for (i = 0; i < elems.length; i++) {
            if (elems[i].compareTo(elem) == 0) {
                return new CResult(i,i+1);
            }
        }
        return new CResult(-1, i+1);
    }

    /**
     * Cerca binaria iterativa
     * @pre elements no nulls ordenats
     * @post: index element o -1
     * @ord O(log(n)) per dividir per 2 els elements per iteracio
     * @param <E> tipues element
     * @param elem  element a cercar
     * @param elems array de elements
     * @return index element o -1 si no
     */
    public static <E extends Comparable<E>> CResult cBinaria(E elem, E[] elems) {
        if (elem == null || elems == null) {
            throw new NullPointerException();
        }
        if (elems.length == 0) {
            return new CResult(-1, 0);
        }
        CResult cResult = new CResult(-1,0);
        int l = 0, h = elems.length - 1;
        while (l <= h) {
            int m = (l + h) >>> 1; //lsr 1, evita overflows
            cResult.addAccess();
            if (elem.compareTo(elems[m]) == 0) {
                cResult.setResult(m);
                return cResult;
            }
            cResult.addAccess();
            if (elem.compareTo(elems[m]) > 0) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return cResult;
    }
}
