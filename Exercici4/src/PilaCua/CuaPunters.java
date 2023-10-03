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
    
    private final int N;
    private E[] elems;
    
    public CuaPunters(int n, Class<E> c){
        N=n;
        elems = (E[]) Array.newInstance(c, N);
    }

    @Override
    public void queue(E elem) throws CuaFullException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
