/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PilaCua;

import PilaCua.Exceptions.CuaEmptyException;
import PilaCua.Exceptions.CuaFullException;
import PilaCua.Interfaces.Cua;
import java.lang.reflect.Array;
import java.lang.Class;

/**
 *
 * @author daniel
 */
public class CuaPunters<E> implements Cua<E> {

    Node<E> first, last;

    public CuaPunters() {
        first = null;
        last = null;
    }

    @Override
    public void queue(E elem) {
        Node<E> node = new Node(elem);
        node.setNext(last);
        node.setPrev(null);
        if (first == null) {
            first = node;
        }
        if (last != null) {
            last.setPrev(node);
        }

        last = node;

    }

    @Override
    public void dequeue() throws CuaEmptyException {
        if (first == null) {
            throw new CuaEmptyException();
        }
        Node node = first;
        first = node.getPrev();
        if (first != null) {
            first.setNext(null);
        } else {
            last = null;
        }

    }

    @Override
    public E first() throws CuaEmptyException {
        if (first == null) {
            throw new CuaEmptyException();
        }
        return first.getElem();
    }

    @Override
    public E last() throws CuaEmptyException {
        if (last == null) {
            throw new CuaEmptyException();
        }
        return last.getElem();
    }

    @Override
    public boolean isEmpty() {
        return first==null;
    }

}
