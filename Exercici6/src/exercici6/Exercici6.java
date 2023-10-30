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
      
       Character elem = 'E';
       Character[] elems = {'B','A','G','F','E'};
       Arrays.sort(elems);
       
       System.out.println("El caracter "+elem+" se encuentra en la posicion "+ binarySearch(elem, elems));
        
    }
    
    /**
     *Este metodo tiene como finalidad llevar a cabo la busqueda de un elemento dentro de un array usando el metodo binario.
     *La precondicion para poder llevar a cabo la busqueda binaria sera que los elementos que se encuentran dentro del array han de estar ordenados de mayor a menor.
     * La condicion de salida es que el metodo ha de sacar un entero que este entre el -1 i la longitud menos uno del array siendo menos uno el valor que saque cuano el elemento no exista dentro del array i un numero entre el 0 i la longitud maxima del array la posicion del elemento cuando exista
     * @param <E> elemento generico 
     * @param elem elemento generico que se busca 
     * @param elems array de elementos ordenado 
     * @return int que indica la posicion del elemento , si este es -1 significa que el elemento que se busca esta fuera del array
     */
    public static<E extends Comparable<E>> int binarySearch(E elem, E[] elems){
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
    
    /**
      *Este metodo tiene como finalidad llevar a cabo la busqueda de un elemento dentro de un array usando el metodo binario.
     *La precondicion para poder llevar a cabo la busqueda binaria sera que los elementos que se encuentran dentro del array han de estar ordenados de mayor a menor.
     * La condicion de salida es que el metodo ha de sacar un entero que este entre el -1 i la longitud menos uno del array siendo menos uno el valor que saque cuano el elemento no exista dentro del array i un numero entre el 0 i la longitud maxima del array la posicion del elemento cuando exista
     * @param <E> elemento generico 
     * @param elem elemento a buscar
     * @param elems array de elementos ordenado
     * @param c comparator que se usa para comparar los elmentos del array con el elemento a buscar
     * @return int que indica la posicion del elemento , si este es -1 significa que el elemento que se busca esta fuera del array
     */
    public static<E> int binarySearch (E elem, E[] elems, Comparator<E> c){
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
