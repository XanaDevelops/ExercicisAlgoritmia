/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package matriu;

/**
 * 
 * Interfície que respresenta una matriu que pot emmagatzemar elements 
 * comparables
 * @author antoni
 * @param <E> element que emmagatzema la matriu
 */
public interface Matriu <E extends Comparable<E>>{
    
    /**
     * Set d'un element a la matriu
     * @param e element a insertar
     * @param row fila
     * @param col columna
     */
    public void set(E e, int row,int col);
    
    /**
     * Retorna element d'una posició
     * @param row fila
     * @param col columna
     * @return element de la fila i columna
     */
    public E get(int row, int col);
    
    /**
     * @post (∀ij mij==mji=>simetric=true)∨(∃ij mij!=mj1=>simetric=false)
     * Indica si la matriu és simètrica. Algorisme recursiu
     * el orden de complejidad es n**2 ja que se hacer un recorrido de todas las filas i columnas de la matriz
     * Indica si la matriu és simètrica. Algorisme recursiu
     * @return vertader si és simètrica, false en cas contrari
     */
    public boolean isSymmetricalRecursiu(int diago);
    
    /**
     *@pre (m.cols==m.rows)
     * @post (∀ij mij==mji=>simetric=true)∨(∃ij mij!=mj1=>simetric=false)
     * el orden de complejidad es n**2 ja que se hacer un recorrido de todas las filas i columnas de la matriz
     * Indica si la matriu és simètrica. Algorisme recursiu
     * @return vertader si és simètrica, false en cas contrari
     */
    public boolean isSymmetricalIteratiu();
}
