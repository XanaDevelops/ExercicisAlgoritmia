/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici8;

import matriu.Matriu;
import matriu.excepciones.DimensionNoAdecuada;
import matriu.excepciones.NoMultiplicable;

/**
 *
 * @author daniel
 */
public class Exercici8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DimensionNoAdecuada {
        Matriu<Integer> a = new Matriu(3,3,Integer.class);
        Integer [] aval={0,1,2,3,4,5,6,7,8};
        a.actualizarMat(aval);
         System.out.println(a.toString());
        Matriu<Integer> b = new Matriu(3,3,Integer.class);
         b.actualizarMat(aval);
          System.out.println(b.toString());
        Matriu<Integer> c=null;
        try{
          c=a.mult(b);}
        catch(NoMultiplicable e){}
        System.out.println(c.toString());
    }
    
}
