/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hanoi;

import java.util.Stack;

/**
 *
 * @author antoni
 * @param <E>
 */
public interface Hanoi<E extends Comparable<E>>{
   /**
     * Mètode recursiu que resol Hanoi
     *@pre ∀i (A.lenght> i=>0)∧ (A[i+1]>A[i])∧(B.lenght=0∧C.lenght=0)
     * @post ∀i (C.lenght> i=>0)∧ (C[i+1]>C[i])∧(A.lenght=0∧B.lenght=0)
     * @ord  O(2**n )
     * @param h Altura de les torres
     * @param a torre a pila inicila de hanoi
     * @param b torre b  pila intermitja de les torres  de Hanoi
     * @param c torre c  pila final de les torres de hanoi
     */
    public void recursiuHanoi(int h, Stack<E> a,
            Stack<E> b,
            Stack<E> c);
    
    /**
     * Mètode recursiu que resol Hanoi
     *@pre ∀i (A.lenght> i=>0)∧ (A[i+1]>A[i])∧(B.lenght=0∧C.lenght=0)
     * @post ∀i (C.lenght> i=>0)∧ (C[i+1]>C[i])∧(A.lenght=0∧B.lenght=0)
     * @ord  O(2**n )
     * @param h Altura de les torres
     * @param a torre a pila inicila de hanoi
     * @param b torre b  pila intermitja de les torres  de Hanoi
     * @param c torre c  pila final de les torres de hanoi
     */
    public void iteratiuHanoi(int h, Stack<E> a,
            Stack<E> b,
            Stack<E> c);
}
