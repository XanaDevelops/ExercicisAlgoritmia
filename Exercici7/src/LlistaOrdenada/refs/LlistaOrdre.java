/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LlistaOrdenada.refs;

import LlistaOrdenada.LlistaOrdenada;
import LlistaOrdenada.Node;

/**
 *
 * @author danie
 * @param <E>
 */
public class LlistaOrdre<E extends Comparable<E>> implements LlistaOrdenada<E> {

    private Node<E> first;

    /**
     * Constructor d'una Llista Ordenada
     *
     * @see LlistaOrdenada
     */
    public LlistaOrdre() {
        first = null;
    }

    /**
     * Afegeix un Element a la llista. Després s'ordena per l'ordre natural Pre:
     * Element no null Post: Llista ordenada amb l'element O(n)
     *
     * @param e
     */
    @Override
    public void add(E e) {
        Node<E> node = new Node<>(e);
        if (first == null) {
            first = node;
            node.setNext(null);
            node.setPrev(null);
            return;
        }
        Node<E> comp = first;
        while (comp.getNext() != null && node.compareTo(comp) >= 0) {
            comp = comp.getNext();
        }

        if (node.compareTo(comp) >= 0) {
            comp.setNext(node);
            node.setPrev(comp);
            node.setNext(null);
        } else {
            if (comp.getPrev() != null) {
                node.setPrev(comp.getPrev());
                comp.getPrev().setNext(node);

            } else {
                first = node;
            }
            node.setNext(comp);
            comp.setPrev(node);
        }

    }

    /**
     * Pre: Res Post: Llista buida O(1)
     */
    @Override
    public void clear() {
        first = null;
    }

    /**
     * Pre: element no nul a cercar Post: true si el citat element existeix,
     * false en cas contrari O(n)
     *
     * @param e Element a cercar
     * @return Si existeix l'element
     */
    @Override
    public boolean contains(E e) {
        Node<E> node = first;
        while (node != null) {
            if (node.getElem().compareTo(e) == 0) {
                return true;
            }
            node = node.getNext();
        }
        return false;
    }

    /**
     * Pre: Cap Post: true si existeix al manco un element, sino false O(1)
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Pre: Element no null a eliminar Post: Llista ordenada amb l'element
     * eliminat O(n)
     *
     * @param e Element
     */
    @Override
    public void remove(E e) {
        Node<E> node = first;
        while (node != null) {
            if (node.getElem().compareTo(e) == 0) {
                if (node.getPrev() != null) {
                    node.getPrev().setNext(node.getNext());
                }else{
                    first=node.getNext(); //es el primer
                }
                if (node.getNext() != null) {
                    node.getNext().setPrev(node.getPrev());
                }
                return;
            }
            node = node.getNext();
        }

    }

    /**
     * Retorna {@link String} dels elements de la Llista
     *
     * @return String
     */
    @Override
    public String toString() {
        String s = "";
        Node<E> n = first;
        while (n != null) {
            s += n.getElem() + ",";
            n = n.getNext();
        }
        return s;

    }

}
