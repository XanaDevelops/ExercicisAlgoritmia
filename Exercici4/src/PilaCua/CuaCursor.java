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
    private int nElements = 0;
    private int first, last;

    public CuaCursor(int n, Class<E> c) {
        N = n;
        elems = (E[]) Array.newInstance(c, N);

        first = 0;
        last = 0;
    }

    @Override
    public void queue(E elem) throws CuaFullException {
        if (nElements < N) { //TODO
            last = (first + nElements) % N;
            nElements++;
            elems[last] = elem;
        } else {
            throw new CuaFullException();
        }
    }

    @Override
    public void dequeue() throws CuaEmptyException {
        if (nElements <= N) { //Esta comparación es la causante, miralo
            first = (first + 1) % N;
            nElements--;

        } else {
            throw new CuaEmptyException();
        }
    }

    @Override
    public E first() throws CuaEmptyException {
        if (nElements == 0) {
            throw new CuaEmptyException();
        }
        return elems[first];

    }

    @Override
    public E last() throws CuaEmptyException {
        if (nElements == 0) {
            throw new CuaEmptyException();
        }
        return elems[last];
    }

    @Override
    public boolean isEmpty() {
        boolean vacio = false;
        if (nElements == 0) {
            vacio = true;
        }
        return vacio;
    }

}
