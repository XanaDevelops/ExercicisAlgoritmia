/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici6;

import java.util.Comparator;
import java.util.Arrays;
/**
 *
 * @author daniel
 */
public class Exercici6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
    public static <E extends Comparable<E>> int binarySearch(E elem, E[] elems){
        if(elem==null || elems==null){
            throw new NullPointerException();
        }
        if(elems.length==0){
            return -1;
        }
        int l=0, h=elems.length-1;
        while(l<=h){
            int m = (l+h) >>> 1; //lsr 1, evita overflows
            
            if(elem.compareTo(elems[m])==0){
                return m;
            }
            
            if(elem.compareTo(elems[m])>0){
                l=m+1;
            }else{
                h=m-1;
            }
        }
        return -1;
    }
    
    public static <E> int binarySearch(E elem, E[] elems, Comparator<E> c){
        if(elem==null || elems==null || c==null){
            throw new NullPointerException();
        }
        if(elems.length==0){
            return -1;
        }
        int l=0, h=elems.length-1;
        while(l<=h){
            int m = (l+h) >>> 1; //lsr 1, evita overflows
            
            if(c.compare(elem, elems[m])==0){
                return m;
            }
            
            if(c.compare(elem, elems[m])<0){
                l=m+1;
            }else{
                h=m-1;
            }
        }
        return -1;
    }
    
}
