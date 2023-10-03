/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PilaCua.Interfaces;

import PilaCua.Exceptions.CuaEmptyException;
import PilaCua.Exceptions.CuaFullException;

/**
 *
 * @author daniel
 * @param <E>
 */
public interface Cua<E> {
    
    public void queue(E elem)    throws CuaFullException;
    public void dequeue()        throws CuaEmptyException;
    public E first()             throws CuaEmptyException;
    public E last()              throws CuaEmptyException;
    
    public boolean isEmpty();
}
