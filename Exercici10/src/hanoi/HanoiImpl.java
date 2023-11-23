package hanoi;

import java.util.Stack;

public class HanoiImpl<E extends Comparable<E>> implements Hanoi<E> {

    @Override
    public void recursiuHanoi(int h, Stack<E> a, Stack<E> b, Stack<E> c) {
        //h==1 és el cas base, moure l'element d'A a C
        if (h == 1) {
            moverDisco(a, c);
        } else {
            //el conjunt de dades es redueix linealment amb "h"
            //La precondició es compleix, sent sempre tres piles ordenades de major a menor
            recursiuHanoi(h - 1, a, c, b);
            moverDisco(a, c);
            recursiuHanoi(h - 1, b, a, c);
            //Sempre es retorna les tres piles amb els elements ordenats de major a menor
            //Avançant cap a la solució final
        }
    }

    @Override
    public void iteratiuHanoi(int h, Stack<E> a, Stack<E> b, Stack<E> c) {
        
    }

    private void moverDisco(Stack<E> origen, Stack<E> destino) {
        E disco = origen.pop();
        destino.push(disco);
        System.out.println("Mover disco " + disco + " desde " + origen + " hasta " + destino);
    }
}
