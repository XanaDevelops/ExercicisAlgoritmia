/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercici4;

/**
 *
 * @author daniel
 */
public class Elem implements Comparable<Elem>{

    private int valor;
    
    public Elem(int valor){
        this.valor = valor;
    }
    
    @Override
    public int compareTo(Elem o) {
        return this.getValor()-o.getValor();
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Elem{" + "valor=" + valor + '}';
    }
    
    
    
}
