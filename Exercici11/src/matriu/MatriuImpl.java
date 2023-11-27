/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriu;

import java.lang.reflect.Array;

/**
 *
 * @author antoni
 * @param <E>
 */
public class MatriuImpl<E extends Comparable<E>> implements Matriu<E> {

    private E[] matriu;
    private int cols;
    private int rows;

    /**
     * Es crea una matriu representada en un array per files
     *
     * @param cols
     * @param rows
     */
    public MatriuImpl(E[] matriu, int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matriu = matriu;
    }

    @Override
    public void set(E e, int row, int col) {
        this.matriu[row * this.cols + col] = e;
    }

    @Override
    public E get(int row, int col) {
        return this.matriu[row * this.cols + col];
    }

    @Override
    public boolean isSymmetricalRecursiu() {
        //compruebas cuadrado
        //lo que sea
        //aqui puedes comprobar el caso base
        //return isSymmetricalRecursiu(0);
        if (this.cols != this.rows) {
            return false;
        } else {
            return this.isSymmetricalRecursiu(0);
        }

    }

    private boolean isSymmetricalRecursiu(int diago) {

        if (diago == this.cols) {
            return true;
        }
        for (int x = diago; x < this.cols; x++) {

            if (this.get(diago, diago + 1).compareTo(this.get(diago + 1, diago)) != 0) {
                return false;
            } else {
               return isSymmetricalRecursiu(diago + 1);
            }

        }
        return false;
    }

    /**
     * {@inheritDoc} Cas inicial: Matriu 1x1. Retorna True <br>
     * Cas general: Matriu NxN.
     *
     * @return
     */
    @Override
    public boolean isSymmetricalIteratiu() {
        //si quadrada
        if (this.cols != this.rows) {
            return false;
        }
        //si cas base
        if (this.cols * this.rows == 1) {
            return true;
        }

        //iterar
        int h = 0;
        while (h < this.cols) {
            System.out.println("h: " + h);
            for (int i = h; h + i < this.cols; i++) {
                //System.out.println("DBG: "+get(h,h+i)+" "+get(h+i,h));
                if (get(h, h + i).compareTo(get(h + i, h)) != 0) {
                    return false;
                }
            }
            h++; //Reducció tamany dades
        }
        return true;
    }
}
