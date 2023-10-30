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
 */
public class LListaCursor<E extends Comparable<E>> implements LlistaOrdenada<E> {

    private E[] data;
    private int[] next;
    private int first;
    private int free;
    private int aux;

    public LListaCursor(int dimensio, Class<E> C) {
        data = (E[]) Array.newInstance(C, dimensio);
        next = new int[dimensio];
        first = -1;
        free = 0;
        aux = 1;
        inicianalizarNext();
    }

    @Override
    public void add(E e) {

        if (first == -1) {
            first = 0;

        } else {
            next[aux] = free;
        }
        if (free != -1) {
            data[free] = e;
            aux = free;
            free = next[free];
        } else {
            System.out.println("La lista esta vacia");
        }

        next[aux] = -1;
        System.out.println();
        for (int i = 0; i < next.length; i++) {
            System.out.print(next[i] + ", ");
        }
        System.out.println("..");
        System.out.print(data[first] + ", ");
       int  i=next[first];
        while(i!=-1&&next[i]!=-1){
            
            System.out.print(data[i] + ", ");
            i=next[i];
        }
        if(i!=-1){
          System.out.print(data[i] + ", "); }
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(E e) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void remove(E e) {
        int aux2 = 0;
        if (data[first].equals(e)) {
            next[first] = free;
            free = first;
             first++;
            
        }else{
        int i = first;
        while (next[i] == -1 && data[next[i]].equals(e)) {
           i=next[i];
        }
        if (data[next[i]].equals(e)) {
            aux2 = next[next[i]];
            next[next[i]] = free;
            free = next[i];
            next[i] = aux2;

        }}
System.out.println();
        for (int z = 0; z < next.length; z++) {
            System.out.print(next[z] + ", ");
        }
    }

    public void inicianalizarNext() {
        for (int i = 0; i < next.length - 1; i++) {
            next[i] = i + 1;
        }

        next[next.length - 1] = -1;

    }

}
