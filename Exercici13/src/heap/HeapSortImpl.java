/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap;

/**
 * Per el teorema del quocient, tenim 2 cridades recursives, un element reductor
 * de valor 2 i una alfa igual a 1, donant un valor de O(nlog<sub>2</sub>(n)
 * En l'ús de CPU és costós ja que realitza moltes comparacions i desplaçaments.
 * En l'ús de memòria es bastant eficient ja que s'ordena sobre el mateix array.
 * Es podria optimitzar més encara si la implementació fos iterativa, ja que no
 * s'emplearia el stack de cridades.
 * 
 * @author Pere, Daniel
 * @author antoni
 * @param <E> Tipus dades a ordenar
 */
public class HeapSortImpl<E extends Comparable<E>> implements HeapSort<E> {

    /**
     * {@inheritDoc }
     *
     * @pre ∀i: 0&lt;=i&lt;h.length: h<sub>i</sub>!=null
     * @post ∀i: 0&lt;=i&lt;h.length-1: h<sub>i</sub>&lt;h<sub>i+1</sub>
     * @ord O(nlog<sub>2</sub>(n))
     * @param h Array a ordenar
     */
    @Override
    public void heapSort(E[] h) {
        int n = h.length;

        //construim el maxim monticle
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(h, n, i);
        }

        //colocam en ordre
        for (int i = n - 1; i > 0; i--) {
            E temp = h[0];
            h[0] = h[i];
            h[i] = temp;

            heapify(h, i, 0);
        }
    }

    private void heapify(E[] h, int n, int i) {
        int mayor = i;
        int izquierda = 2 * i + 1; //fill esquerra 
        int derecha = 2 * i + 2; // fill dret 

        //miram si el esquerra es major
        if (izquierda < n && h[izquierda].compareTo(h[mayor]) > 0) {
            mayor = izquierda;
        }

        // miram si el de la dreta es major
        if (derecha < n && h[derecha].compareTo(h[mayor]) > 0) {
            mayor = derecha;
        }

        // Si el mayor no es l'arrel
        if (mayor != i) {
            // Intercambiam el element mayor amb l'arrel
            E temp = h[i];
            h[i] = h[mayor];
            h[mayor] = temp;

            // Miram el subarbre
            heapify(h, n, mayor);
        }
    }

}
