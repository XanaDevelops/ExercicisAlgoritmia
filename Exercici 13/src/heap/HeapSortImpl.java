/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap;

import java.util.Random;

/**
 *
 * @author antoni
 */
public class HeapSortImpl<E extends Comparable<E>> implements HeapSort<E> {

    @Override
    public void heapSort(E[] h) {
     int n = h.length;

        //construim el maxim monticle
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(h, n, i);
        }

       
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
