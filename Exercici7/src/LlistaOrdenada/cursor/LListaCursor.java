/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LlistaOrdenada.cursor;

import LlistaOrdenada.LlistaOrdenada;
import LlistaOrdenada.LlistaOrdenada;
import java.lang.reflect.Array;

/**
 *
 * @author trufi
 * @param <E>
 */
public class LListaCursor<E extends Comparable<E>> implements LlistaOrdenada<E> {

    private E[] data;
    private int[] next;
    private int first;
    private int free;
    private int aux;
    private int aux3;

    /**
     *Aquest es el constructor
     * @param dimensio aquest parametre determinara el nomebre de elements de la llista 
     * @param C aquest parametre inica la classe de objectes que s'introduoran dins la llista
     */
    public LListaCursor(int dimensio, Class<E> C) {

        data = (E[]) Array.newInstance(C, dimensio);
        next = new int[dimensio];
        first = -1;
        free = 0;
        aux = 1;
        inicianalizarNext();
    }

    /**
     *
     * @param e
     */
    @Override
    public void add(E e) {

        if (first == -1) {
            first = 0;

        } else {
            next[aux] = free;
        }
        if (free != -1) {

            data[free] = e;
            aux3 = aux;
            aux = free;
            free = next[free];

            next[aux] = -1;
        } else {
            System.out.println("La lista esta vacia");
        }

    }

    /**
     *
     */
    @Override
    public void clear() {
        inicianalizarNext();
        data = (E[]) Array.newInstance(data[0].getClass(), next.length);

    }

    /**
     *
     * @param e
     * @return
     */
    @Override
    public boolean contains(E e) {
        int i = first;
        if(e.equals(data[first])==false){
        while (next[i] != -1 && !data[next[i]].equals(e)) {
            i = next[i];
        }}
        if(next[i]==-1){return false;}

        else {return true;}
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        if (free == -1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @param e
     */
    @Override
    public void remove(E e) {
        int aux2 = 0;
        if (data[first].equals(e)) {
            aux2 = next[first];
            next[first] = free;
            free = first;
            first = aux2;

        } else {
            int i = first;
            while (next[i] != -1 && !data[next[i]].equals(e)) {
                i = next[i];
            }
            if (next[i] != -1) {
                if (data[next[i]].equals(e) && next[next[i]] == -1) {
                    next[next[i]] = free;
                    free = next[i];
                    aux = aux3;

                } else if (data[next[i]].equals(e)) {
                    aux2 = next[next[i]];
                    next[next[i]] = free;

                    free = next[i];
                    next[i] = aux2;
                }
            }

        }

    }

    /**
     *
     */
    public void inicianalizarNext() {
        for (int i = 0; i < next.length - 1; i++) {
            next[i] = i + 1;
        }

        next[next.length - 1] = -1;

    }

}