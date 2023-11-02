/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercici8;

/**
 *
 * @author daniel
 * @param <E>
 */
public class Matriu<E extends Number>  {
    private int w,h;
    private E[] matriu;
    
    public Matriu(int w, int h){
        
    }
    
    public void set(E value, int w, int h){
        matriu[w*h+w] = value;
    }
    
    public E get(int w, int h){
        return matriu[w*h+w];
    }
    
    public Matriu<E> mult(Matriu<E> m){
        return null;
    }
}
