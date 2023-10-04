package PilaCua;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import PilaCua.Exceptions.PilaEmptyException;
import PilaCua.Exceptions.PilaFullException;
import PilaCua.Interfaces.Pila;
import java.lang.reflect.Array;

/**
 *
 * @author daniel
 */
public class PilaCursor<E> implements Pila<E> {

    private int top = -1;
    private E pila[];
    private int maxim;

    public PilaCursor(int maxim, Class<E> c) {
        pila = (E[]) Array.newInstance(c, maxim);
        this.maxim = maxim;

    }

    @Override
    public void push(E elem) throws PilaFullException {
        if (top + 1 == maxim) {
            throw new PilaFullException();
        } else {
            top++;
            pila[top] = elem;

        }
    }

    @Override
    public void pop() throws PilaEmptyException {
        if (top == -1) {
            throw new PilaEmptyException();
        } else {
            top--;
        }
    }

    @Override
    public E top() throws PilaEmptyException {
        if (top == -1) {
            throw new PilaEmptyException();
        }

        return pila[top];

    }

    @Override
    public boolean isEmpty() {
        boolean vacio = false;
        if (top == -1) {
            vacio = true;
        }
        return vacio;
    }

}
