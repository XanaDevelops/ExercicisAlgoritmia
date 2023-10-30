/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LlistaOrdenada;

/**
 *
 * @author danie
 * @param <E>
 */
public class Node<E extends Comparable<E>> implements Comparable<Node<E>>{
    private final E elem;
    
    private Node<E> prev;
    private Node<E> next;
    
    /**
     * Node de la llista de referències
     * @param e Element a emmagatzemar
     */
    public Node(E e){
        this.elem = e;
    }

    /**
     * 
     * @return Element emmagatzemat
     */
    public E getElem() {
        return elem;
    }

    /**
     *
     * @return Node anterior
     */
    public Node<E> getPrev() {
        return prev;
    }

    /**
     * Estableix el node anterior
     * @param prev Node anterior
     */
    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }

    /**
     * 
     * @return Node posterior
     */
    public Node<E> getNext() {
        return next;
    }

    /**
     * Estableix el següent node
     * @param next Node
     */
    public void setNext(Node<E> next) {
        this.next = next;
    }

    /**
     * Compara segons el {@link Comparable<E>} del element
     * @param o Node amb l'emement a comparar
     * @return {@link Integer} resultat comparació
     * @see Comparable
     */
    @Override
    public int compareTo(Node<E> o) {
        return this.elem.compareTo(o.getElem());
    }
}