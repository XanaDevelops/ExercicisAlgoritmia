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
import java.util.Random;
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
            Exercici4 ord = new Exercici4();
            Integer[] x = ord.puntsInicials(100);
            Integer[] y = Arrays.copyOf(x, x.length);
            
            System.out.println(Arrays.toString(x));
            ord.ordenarComparator(x, new ProvaCom());
            System.out.println(Arrays.toString(x));
            
            ord.ordenarComparable(y);
            System.out.println(Arrays.toString(y)+"\n");

            ord.testCua();
        } catch (CuaEmptyException | PilaEmptyException | CuaFullException | PilaFullException ex) {
            Logger.getLogger(Exercici4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /*
    P=∀i: 0<=i<x.lenght: x[i]!=null
    Q=∀i: 0<=i<x.length-1: x[i]<=x[i+1]
    */
    private void ordenarComparable(Comparable[] elems) {
        boolean canvis = true;
        Comparable temp;
        while (canvis == true) {
            canvis = false;
            for (int y = 0; y < elems.length; y++) {
                if ((y + 1 != elems.length)) {
                    if (1 == elems[y].compareTo(elems[y + 1])) {
                        temp = elems[y];
                        elems[y] = elems[y + 1];
                        elems[y + 1] = temp;
                        canvis = true;
                    }
                }
            }
        }
    }
    
    /*
    P=∀i: 0<=i<x.lenght: x[i]!=null
    Q=∀i: 0<=i<x.length-1: x[i]<=x[i+1]
    */
    private <T> void ordenarComparator(T[] elems, Comparator<T> comp) {
        boolean canvis = true;
        T temp;
        while (canvis == true) {
            canvis = false;
            for (int y = 0; y < elems.length; y++) {
                if ((y + 1 != elems.length)) {
                    if (-1 == comp.compare(elems[y], elems[y + 1])) {
                        temp = elems[y];
                        elems[y] = elems[y + 1];
                        elems[y + 1] = temp;
                        canvis = true;
                    }
                }
            }
        }
    }

    private void testCua() throws CuaEmptyException, PilaEmptyException, CuaFullException, PilaFullException {
        int n = 3;
        CuaPunters<Elem> cp = new CuaPunters<>();
        for (int i = 0; i < n; i++) {
            cp.queue(new Elem(i));
            System.out.println(cp.first());
            System.out.println(cp.last() + "\n");
        }

        for (int i = 0; i < n; i++) {
            cp.dequeue();
            if (!cp.isEmpty()) {
                System.out.println(cp.first());
                System.out.println(cp.last() + "\n");
            }
        }

        PilaPunters<Elem> pp = new PilaPunters<>();
        for (int i = 0; i < n; i++) {
            pp.push(new Elem(i));
            System.out.println(pp.top() + "\n");
        }

        for (int i = 0; i < n; i++) {
            pp.pop();
            if (!pp.isEmpty()) {
                System.out.println(pp.top() + "\n");
            }
        }

        System.out.println("CURSORS:");

        CuaCursor<Elem> cc = new CuaCursor<>(n, Elem.class);
        for (int i = 0; i < n; i++) {
            cc.queue(new Elem(i));
            System.out.println(cc.first());
            System.out.println(cc.last() + "\n");
        }
        
        try{
            cc.queue(new Elem(-1));
        }   catch(CuaFullException e){
            System.out.println("ok CuaFullEx");
        }

        for (int i = 0; i < n; i++) {
            cc.dequeue();
            if (!cc.isEmpty()) {
                System.out.println(cc.first());
                System.out.println(cc.last() + "\n");
            }
        }

        PilaCursor<Elem> pc = new PilaCursor<>(n, Elem.class);
        for (int i = 0; i < n; i++) {
            pc.push(new Elem(i));
            System.out.println(pc.top() + "\n");
        }

        try{
            pc.push(new Elem(-1));
        }   catch(PilaFullException e){
            System.out.println("ok PilaFullEx");
        }
         
        for (int i = 0; i < n; i++) {
            pc.pop();
            if (!pc.isEmpty()) {
                System.out.println(pc.top() + "\n");
            }
        }
    }
    
    public Integer[] puntsInicials(int numPunts) {//aquest metode crea un array de nombres desordenats
        int i = 0;
        boolean iguals = false;
        Integer[] inicials = new Integer[numPunts];
        Random ale = new Random();
        inicials[0] = ale.nextInt(numPunts);
        int num;
        for (i = 1; i < numPunts; i++) {
            int z = 0;

            num = ale.nextInt(numPunts);
            while (z < i && iguals == false) {
                if (inicials[z] == num) {
                    iguals = true;
                }
                z++;
            }
            if (iguals) {
                i--;
            } else {
                inicials[i] = num;
            }
            iguals = false;

        }

        return inicials;

    }

    
}
