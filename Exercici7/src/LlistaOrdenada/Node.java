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
    
    public Node(E e){
        this.elem = e;
    }

    public E getElem() {
        return elem;
    }

    public Node<E> getPrev() {
        return prev;
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    @Override
    public int compareTo(Node<E> o) {
        return this.elem.compareTo(o.getElem());
    }
}