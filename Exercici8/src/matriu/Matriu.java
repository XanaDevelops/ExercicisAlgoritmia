/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matriu;

import java.lang.reflect.Array;

import matriu.excepciones.NoMultiplicable;

/**
 *
 * @author daniel
 * @param <T>
 */
public class Matriu<T extends Number>  {
    private final int w;
    private final int h;
    private final T[] matriu;
    
    public Matriu(int w, int h, Class<T> type){
        this.w = w;
        this.h = h;
        matriu = (T[])Array.newInstance(type, w*h);
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }
    
    
    
    
    
    public void set(T value, int w, int h){
        matriu[w*h+w] = value;
    }
    
    public T get(int w, int h){
        return matriu[w*h+w];
    }
    
    public Matriu<T> mult(Matriu<T> m) throws NoMultiplicable{
      if(w!=m.getH()) {
         throw new NoMultiplicable(); 
          
      }
        
        
    return null;  
    }
}
