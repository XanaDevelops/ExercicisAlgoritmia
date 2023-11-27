/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriu;

import java.lang.reflect.Array;

/**
 * Implementació de matriu array per files
 * @author antoni
 * @param <E> Elements
 */
public class MatriuImpl<E extends Comparable<E>> implements Matriu<E> {

    private E[] matriu;
    private int cols;
    private int rows;

    /**
     * Es crea una matriu representada en un array per files
     *
     * @param cols nº columnes
     * @param rows nº files
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

    /**
     * Cas base: Matriu 1x1, retorna true <br>
     * Cas general: Matriu NxN on la primera fila és igual a la primera columna. 
     * Es va reduint la matriu fins arribar al cas base
     * @pre true
     * @post (∀i,j Mij==Mji=>simetric=true)∨(∃i,j mij!=mj1=>simetric=false) Indica
     * si la matriu és simètrica.
     * @ord el orden de complejidad es n**2 ja que se hacer un recorrido de
     * todas las filas i columnas de la matriz Indica si la matriu és simètrica.
     * Algorisme recursiu
     * {@inheritDoc }
     */
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
        if (diago == this.cols) { //cas base
            return true;
        }
        
        for (int x = 1; x < this.cols - diago; x++) {
            if (this.get(diago, diago + x).compareTo(this.get(diago + x, diago)) != 0) {
                return false; //tant precondició com postcondició es compleix
            }
        }
        return isSymmetricalRecursiu(diago + 1); //reducció tamany
    }

    /**
     * @pre true
     * @post (∀i,j Mij==Mji=>simetric=true)∨(∃i,j Mij!=Mj1=>simetric=false)
     * @ord O(n^2) perquè recorr tots els elements de la matriu n*n en el pitjor
     * dels casos
     * {@inheritDoc }
     */
    @Override
    public boolean isSymmetricalIteratiu() { //RecFinal2Iteratiu
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
            //System.out.println("h: " + h);
            for (int i = 1; h + i < this.cols; i++) {
                //System.out.println("DBG: "+get(h,h+i)+" "+get(h+i,h));
                if (get(h, h + i).compareTo(get(h + i, h)) != 0) {
                    return false; //postcondició es compleix
                }
            }
            h++; //Reducció tamany dades
        }
        return true;
    }
}
