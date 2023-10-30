/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LlistaOrdenada;

/**
 *
 * @author trufi
 * @param <E>
 */
public interface LlistaOrdenada <E extends Comparable<E>>{
    public void add(E e);
    public void clear();
    public boolean contains(E e);
    public boolean isEmpty();
    public void remove(E e);
}
