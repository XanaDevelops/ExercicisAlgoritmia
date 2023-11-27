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
        if(this.cols!=this.rows){return false;}
        
        else{return this.isSymmetricalRecursiu(0);}
        
        
    }
    private boolean isSymmetricalRecursiu(int diago){
        boolean iguals;
     if(diago>=this.cols){return true;}
      int i = 0;
      while ((diago * this.cols + diago + i) < (diago * this.cols + this.rows) && (this.get(diago, diago + i).compareTo(this.get(diago + i, diago)) == 0)) {
                i++;
            }
            if ((diago * this.cols + diago + i) == (diago * this.cols + this.rows)) {

                iguals = isSymmetricalRecursiu(diago + 1);

            } else {
                iguals=false;
            }
        
            
        return iguals;
        }
        
        
        
    

    /**
     * {@inheritDoc}
     * Cas inicial: Matriu 1x1. Retorna True <br>
     * Cas general: Matriu NxN.
     * @return 
     */
    @Override
    public boolean isSymmetricalIteratiu() {
        //si quadrada
        if (this.cols != this.rows){
            return false;
        }
        //si cas base
        if( this.cols*this.rows==1){
            return true;
        }
        
        //iterar
        int h=0;
        while(h<this.cols){
            System.out.println("h: "+h);
            for(int i = h; h+i<this.cols;i++){
                //System.out.println("DBG: "+get(h,h+i)+" "+get(h+i,h));
                if(get(h,h+i).compareTo(get(h+i,h))!=0){
                    return false;
                }
            }
            h++; //Reducció tamany dades
        }
        return true;
    }
}
