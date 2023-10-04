/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PilaCua;

import PilaCua.Exceptions.PilaEmptyException;
import PilaCua.Exceptions.PilaFullException;
import PilaCua.Interfaces.Pila;

/**
 *
 * @author daniel
 */
public class PilaPunters<E> implements Pila<E> {

    private Node<E> top;
    
    public PilaPunters(){
        top=null;
    }
    
    @Override
    public void push(E elem) {
        Node<E> node = new Node<>(elem);
        node.setPrev(top);
        top = node;
    }

    @Override
    public void pop() throws PilaEmptyException {
        if(top==null){
            throw new PilaEmptyException();
        }
        top = top.getPrev();
    }

    @Override
    public E top() throws PilaEmptyException {
        if(top==null){
            throw new PilaEmptyException();
        }
        return top.getElem();
    }

    @Override
    public boolean isEmpty() {
        return top==null;
    }
    
}
