/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PilaCua;

import PilaCua.Exceptions.CuaEmptyException;
import PilaCua.Exceptions.CuaFullException;
import PilaCua.Interfaces.Cua;
import java.lang.reflect.Array;

/**
 *
 * @author daniel
 * @param <E>
 */
public class CuaCursor<E> implements Cua<E> {

    private final int N;
    private final E[] elems;
    
    private int first, last;
    
    public CuaCursor(int n, Class<E> c){
        N=n;
        elems = (E[]) Array.newInstance(c, N);
        
        first = 0;
        last  = 0;
    }
    @Override
    public void queue(E elem) throws CuaFullException {
        if(first>=last){ //TODO
            elems[first++] = elem;
        }
    }

    @Override
    public void dequeue() throws CuaEmptyException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public E first() throws CuaEmptyException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public E last() throws CuaEmptyException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
