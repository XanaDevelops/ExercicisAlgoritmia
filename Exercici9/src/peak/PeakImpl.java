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
     * Aquest metode retorna al elemnt del cim que estroba dins un arrays de enters 
     * @pre (A.lenght≥3)∧∃!j(A.lenght-1>j>1)∧(∀i:0≤i≤j:A<sub>j</sub>>A<sub>i</sub>)∧(∀k:A.lenght>k>j:A<sub>j</sub>>A<sub>k</sub>)
     * @post ∃!j:(A.lenght-1>j>1)∧(max(A)==A<sub>j</sub>)∧(A<sub>j</sub>>A<sub>j+1</sub>)∧(A<sub>j</sub>>A<sub>j-1</sub>)
     * @ord O(log<sub>2</sub>(n)) al dividir per 2 cada recursió i al utilitzar una cerca binaria internament<br>
     * @param a array que va creixent fins que arriba a un maxim despres decreix fins al final del array 
     * @return retorna un Point que conté l'element cim i el seu index, null en cas de conjunt d'elements no vàlids
     */
    @Override
    public Point peak(int[] a) {
        Point p = new Point();
        int r = cBinaria(a);
        if(r==-1){
            return null;
        }
        p.x = a[r];
        p.y = r;
        return p;
    }

    /**
     * Cerca binaria recursiva
     *
     * @pre elements no nulls ordenats
     * @post index element 
     * @ord O(log(n)) al dividir per 2 cada recursió <br>
     * @param <E> tipues element
     * @param elems array de elements
     * @return index element o -1 si no
     */
    private <E extends Comparable<E>> int cBinaria(int[] elems) {
        if (elems == null) {
            throw new NullPointerException();
        }
        if (elems.length < 3) {
            return -1;
        }
        //cas trivial
        if(elems.length==3){
            return elems[1];
        }

        return cBinaria(elems, 0, elems.length - 1);
    }

    private <E extends Comparable<E>> int cBinaria(int[] elems, int l, int h) {
        if (l > h) {
            return -1;
        }
        int m = (l + h) >>> 1;
        
        //llegado a los extremos, no valido
        if(m==0 || m==elems.length-1){
            return -1;
        }
        int elem = elems[m];

        int lC = elems[m-1]-elem;
        int rC = elems[m+1]-elem;
        //comparacion en trios
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
