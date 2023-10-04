/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PilaCua.Interfaces;

import PilaCua.Exceptions.PilaEmptyException;
import PilaCua.Exceptions.PilaFullException;

/**
 *
 * @author daniel
 */
public interface Pila<E> {
    
    public void push(E elem) throws PilaFullException;
    public void pop()        throws PilaEmptyException;
    public E top()           throws PilaEmptyException;
    
    public boolean isEmpty();
}
