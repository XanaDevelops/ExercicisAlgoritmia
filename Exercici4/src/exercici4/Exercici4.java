/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici4;

import PilaCua.CuaCursor;
import PilaCua.CuaPunters;
import PilaCua.Exceptions.CuaEmptyException;
import PilaCua.Exceptions.CuaFullException;
import PilaCua.Exceptions.PilaEmptyException;
import PilaCua.Exceptions.PilaFullException;
import PilaCua.PilaCursor;
import PilaCua.PilaPunters;
import java.util.Arrays;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daniel
 */
public class Exercici4 {

    /*
    L'exercici té dues parts

    1.-Heu d'implementar un dels algorismes d'ordenació que vareu treballar a primer curs del grau. Realment implementareu dos algorismes.
    Un que permeti ordenar tipus que tenguin implementada la interfície Comparable i un altre que permeti ordenar qualsevol tipus d'elements mitjançant un Comparator.
    Abans d'implementar els algorismes els heu d'especificar formalment.
    Heu de documentar el codi amb JavaDoc.

    2.-TAD Pila i Coa: heu d'implementar amb punters i amb cursos, i de forma genèrica, aquests TAD amb java. Per a la Pila i la Coa heu de definir una Interfície. 
    A partir de la interfície heu de fer la implementació per punters i la implementació per cursors. Si no sabeu quina especificació utilitzar podeu usar la de l'API de Java.
    Heu de documentar el codi amb JavaDoc.
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            new Exercici4();
        } catch (CuaEmptyException | PilaEmptyException | CuaFullException | PilaFullException ex) {
            Logger.getLogger(Exercici4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Exercici4() throws CuaEmptyException, PilaEmptyException, CuaFullException, PilaFullException {
        testCua();
    }

    private void testCua() throws CuaEmptyException, PilaEmptyException, CuaFullException, PilaFullException {
        CuaPunters<Elem> cp = new CuaPunters<>();
        for (int i = 0; i < 10; i++) {
            cp.queue(new Elem(i));
            System.out.println(cp.first());
            System.out.println(cp.last() + "\n");
        }

        for (int i = 0; i < 10; i++) {
            cp.dequeue();
            if (!cp.isEmpty()) {
                System.out.println(cp.first());
                System.out.println(cp.last() + "\n");
            }
        }
        
        PilaPunters<Elem> pp = new PilaPunters<>();
        for (int i = 0; i < 10; i++) {
            pp.push(new Elem(i));
            System.out.println(pp.top()+"\n");
        }

        for (int i = 0; i < 10; i++) {
            pp.pop();
            if (!pp.isEmpty()) {
                System.out.println(pp.top() + "\n");
            }
        }
        
        System.out.println("CURSORS:");
        
        CuaCursor<Elem> cc = new CuaCursor<>(10, Elem.class);
        for (int i = 0; i < 10; i++) {
            cc.queue(new Elem(i));
            System.out.println(cc.first());
            System.out.println(cc.last() + "\n");
        }

        for (int i = 0; i < 10; i++) {
            cc.dequeue();
            if (!cc.isEmpty()) {
                System.out.println(cc.first());
                System.out.println(cc.last() + "\n");
            }
        }
        
        PilaCursor<Elem> pc = new PilaCursor<>(10, Elem.class);
        for (int i = 0; i < 10; i++) {
            pc.push(new Elem(i));
            System.out.println(pc.top()+"\n");
        }

        for (int i = 0; i < 10; i++) {
            pc.pop();
            if (!pc.isEmpty()) {
                System.out.println(pc.top() + "\n");
            }
        }
    }

    private void ordenacions() {
        Elem[] elems = new Elem[5];
        this.ordenarComparable(elems);
        this.ordenarComparator(elems, (Comparator<Elem>) (Elem o1, Elem o2) -> {
            return o1.getValor() - o2.getValor();
        });
    }

    private void ordenarComparable(Comparable[] elems) {
        //<T extends Comparable<? super T>>

    }

    private <T> void ordenarComparator(T[] elems, Comparator<T> comp) {

    }

}
