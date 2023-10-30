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
     * Aquest es el constructor
     *
     * @param dimensio aquest parametre determinara el nomebre de elements de la
     * llista
     * @param C aquest parametre inica la classe de objectes que s'introduoran
     * dins la llista
     */
    public LListaCursor(int dimensio, Class<E> C) {

        data = (E[]) Array.newInstance(C, dimensio);
        next = new int[dimensio];
        first = -1;
        free = 0;
        aux = 0;
        inicianalizarNext();
    }

    /**
     * Aquest metode insereix el element e dins la llista la precondicio es que
     * el element sigui del meteix tipus que el determinat el pas per perametres
     * de la funcio la postcondicio es que el element es trobi en el espai buit
     * despres de haver acabat i que el punter next del element free anterior
     * apunti en aquest nou element o que si la llista es plena se mos indici
     * mitjançant un missatge
     *
     * @param e element que es vol inserir
     */
    @Override
    public void add(E e) {
        E temporal;

        if (first == -1) {
            first = 0;

        } else {
            int i = first;

            if (e.compareTo(data[first]) == -1) {
                temporal = data[first];
                data[first] = e;
                e = temporal;
            }
            while (next[i] != -1) {
                if (e.compareTo(data[i]) == -1) {
                    temporal = data[i];
                    data[i] = e;
                    e = temporal;
                   
                }
             i = next[i];
            }
            next[aux] = free;
        }
        if (free != -1) {

            data[free] = e;
            aux3 = aux;
            aux = free;
            free = next[free];

            next[aux] = -1;
        } else {
            System.out.println("La lista esta plena");
        }

    }

    /**
     * Aquest metode nateja la llista, no te precondicio i la post condicio es
     * que el array data tengui tots els elements a null i que en el array next
     * totes les caselles apuntin al proxim menys la ultima que apuntara a -1
     */
    @Override
    public void clear() {
        inicianalizarNext();
        data = (E[]) Array.newInstance(data[0].getClass(), next.length);

    }

    /**
     * Aquest metode mira si el element que es passa esta dintre de la llista la
     * precondicio es que el element sigui del mateix tipus que els elements de
     * la llista la postcondicio es que torni fals si no es troba el element i
     * vartader si es troba
     *
     * @param e aquest parametre es el objecte a cercar
     * @return un boolea que ens diu si el element es troba o no
     */
    @Override
    public boolean contains(E e) {
        int i = first;
        if (e.equals(data[first]) == false) {
            while (next[i] != -1 && !data[next[i]].equals(e)) {
                i = next[i];
            }
        }
        if (next[i] == -1) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Aquest metode ens diu si la llista esta plena
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
     * Aquest metode elimina el element e dins la llista la precondicio es que
     * el element sigui del meteix tipus que el determinat el pas per perametres
     * de la funcio la postcondicio es que el element no es trobi en el espai
     * buit despres de haver acabat i que el punter next del element free
     * anterior apunti al element que si la llista es plena se mos indici
     * mitjançant un missatge
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

 public void imprimir(){
 int i = first;
  System.out.print(data[first]+","); 
            while (next[i] != -1 ) {
              System.out.print(data[next[i]]+",");  
                i = next[i];
            }
 
 
 System.out.println(); 
 
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
