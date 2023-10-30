/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici7;

import LlistaOrdenada.cursor.LListaCursor;
import LlistaOrdenada.refs.LlistaOrdre;

/**
 *
 * @author daniel
 */
public class Exercici7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                LListaCursor<Integer> llist = new LListaCursor(5, Integer.class);
        llist.add(2);
        llist.add(3);

        llist.add(7);

        llist.add(4);
        
        llist.remove(7);
        llist.add(5);
        llist.add(6);
        llist.imprimir();
        llist.add(8);
         
        testDaniel();
    }
    
    
    private static void testDaniel(){
        LlistaOrdre<Integer> l = new LlistaOrdre<>();
        l.add(2);
        l.add(4);
        l.add(6);
        System.out.println("\nL:\n"+l);
        l.add(3);
        System.out.println("\nL:\n"+l);
        l.add(1);
        System.out.println("\nL:\n"+l);
    }
    
}
