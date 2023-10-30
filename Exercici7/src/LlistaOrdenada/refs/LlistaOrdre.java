/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LlistaOrdenada.refs;

import LlistaOrdenada.LlistaOrdenada;
import LlistaOrdenada.Node;

/**
 *
 * @author danie
 * @param <E>
 */
public class LlistaOrdre<E extends Comparable<E>> implements LlistaOrdenada<E> {
    private Node<E> first;
    
    public LlistaOrdre(){
        first = null;
    }
    
    @Override
    public void add(E e) {
        Node<E> node = new Node<>(e);
        if(first==null){
            first=node;
            node.setNext(null);
            node.setPrev(null);
            return;
        }
        Node<E> comp = first;
        while(comp.getNext()!=null && node.compareTo(comp)>=0){
            comp = comp.getNext();
        }
        
        if(node.compareTo(comp)>=0){
            comp.setNext(node);
            node.setPrev(comp);
            node.setNext(null);
        }else{
            if(comp.getPrev()!=null){
                node.setPrev(comp.getPrev());
                comp.getPrev().setNext(node);
                
            }else{
                first=node;
            }
            node.setNext(comp);
            comp.setPrev(node);
        }
        
    }

    @Override
    public void clear() {
        first = null;
    }

    @Override
    public boolean contains(E e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isEmpty() {
        return first==null;
    }

    @Override
    public void remove(E e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public String toString(){
        String s = "";
        Node<E> n = first;
        while(n!=null){
            s+=n.getElem()+"\n";
            n=n.getNext();
        }
        return s;
        
    }
    
}
