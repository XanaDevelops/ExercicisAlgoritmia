/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PilaCua;

/**
 *
 * @author daniel
 */
public interface PilaCua<E> {
    
    public void push(E elem) throws PilaCuaFullException;
    public void pop()        throws PilaCuaEmptyException;
    public E top()           throws PilaCuaEmptyException;
    
    public boolean isEmpty();
}
