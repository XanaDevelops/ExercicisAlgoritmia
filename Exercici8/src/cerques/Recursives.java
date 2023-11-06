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

    /**
     * Cerca lineal recursiva
     * @pre elements no nulls ordenats
     * @post: index element o -1
     * @ord O(n) al ser lineal
     * @param <E>
     * @param elem
     * @param elems
     * @return
     */
    public static <E extends Comparable<E>> CResult cLineal(E elem, E[] elems) {
        if (elem == null || elems == null) {
            throw new NullPointerException();
        }
        if (elems.length == 0) {
            return new CResult(-1, 0);
        }

        return cLineal(elem, elems, 0);
    }

    private static <E extends Comparable<E>> CResult cLineal(E elem, E[] elems, int i) {
        if (i >= elems.length) {
            return new CResult(-1, i);
        }
        if (elems[i].compareTo(elem) == 0) {
            return new CResult(i, i+1);
        }
        return cLineal(elem, elems, i+1);
    }

    /**
     * Cerca binaria recursiva
     * @pre elements no nulls ordenats
     * @post: index element o -1
     * @ord O(log(n)) al dividir per 2 cada recursió
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

        return cBinaria(elem, elems, 
                0, (0 + elems.length) >>> 1, elems.length-1,
                new CResult(-1, 0));
    }

    private static <E extends Comparable<E>> CResult cBinaria(E elem, E[] elems, int l, int m, int h, CResult cResult) {
        if(l>h){
            return cResult;
        }
        m = (l + h) >>> 1;
        //System.err.println("elem " + elem+" lmh "+l+" "+m+" "+h);
        //se podria hacer un switch para hacer solo una comparación
        cResult.addAccess();
        if (elem.compareTo(elems[m]) == 0) {
            cResult.setResult(m);
            return cResult;
        }
        cResult.addAccess();
        if (elem.compareTo(elems[m]) > 0) {
            return cBinaria(elem, elems, 
                    m + 1, m, h, cResult);
        } else {
            return cBinaria(elem, elems, 
                    l, m, m-1, cResult);
        }
    }
}
