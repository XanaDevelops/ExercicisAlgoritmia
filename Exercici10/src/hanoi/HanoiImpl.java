package hanoi;

import java.util.Stack;

public class HanoiImpl<E extends Comparable<E>> implements Hanoi<E> {

    @Override
    public void recursiuHanoi(int h, Stack<E> a, Stack<E> b, Stack<E> c) {
        if (h == 1) {
            moverDisco(a, c);
        } else {
            recursiuHanoi(h - 1, a, c, b);
            moverDisco(a, c);
            recursiuHanoi(h - 1, b, a, c);
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
