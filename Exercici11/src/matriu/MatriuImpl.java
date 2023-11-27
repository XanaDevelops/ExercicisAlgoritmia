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
    public boolean isSymmetricalRecursiu(int diago) {

        boolean iguals = false;
        if (this.cols == this.rows && diago < this.cols) {
            int i = 0;
            while ((diago * this.cols + diago + i) < (diago * this.cols + this.rows) && (this.get(diago, diago + i).compareTo(this.get(diago + i, diago)) == 0)) {
                i++;
            }
            if ((diago * this.cols + diago + i) == (diago * this.cols + this.rows)) {

                iguals = isSymmetricalRecursiu(diago + 1);

            } else {
                return false;
            }
        } else if (diago==this.cols) {
            return true;
        } else {
            return false;
        }
        return iguals;
    }

    @Override
    public boolean isSymmetricalIteratiu() {
        if (this.cols != this.rows){
            return false;
        }
        if( this.cols*this.rows==1){
            return true;
        }
        
        int h=0;
        while(h<this.cols){
            for(int i = h; i<this.cols;i++){
                if(this.matriu[h+this.cols+i].compareTo(this.matriu[(h+i)*this.cols])!=0){
                    return false;
                }
            }
            h++;
        }
        return true;
    }
}
