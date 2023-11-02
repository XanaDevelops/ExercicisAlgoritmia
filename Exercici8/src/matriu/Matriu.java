/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matriu;

import java.lang.reflect.Array;
import java.math.BigDecimal;

import matriu.excepciones.NoMultiplicable;

/**
 *
 * @author daniel
 * @param <T>
 */
public class Matriu<T extends Number> {

    private final int w;
    private final int h;
    private final T[] matriu;

    public Matriu(int w, int h, Class<T> type) {
        this.w = w;
        this.h = h;
        matriu = (T[]) Array.newInstance(type, w * h);
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }

    public void set(T value, int x, int y) {
        if (x < 0 || y < 0 || x >= w || y >= h) {
            throw new IllegalArgumentException();
        }
        matriu[w * y + x] = value;
    }

    public T get(int x, int y) {
        if (x < 0 || y < 0 || x >= w || y >= h) {
            throw new IllegalArgumentException();
        }
        T a = (T)BigDecimal.valueOf(matriu[0].doubleValue()).add(BigDecimal.valueOf(matriu[1].doubleValue()));
        System.out.println(a);
        return matriu[w * y + x];
    }

    public Matriu<T> mult(Matriu<T> m) throws NoMultiplicable {
        if (w != m.getH()) {
            throw new NoMultiplicable();

        }

        return null;
    }
    
    @Override
    public String toString(){
        String r="";
        for(int i = 0;i<h;i++){
            for(int j =0;j<w;j++){
                r+=matriu[w*i+j]+", ";
            }
            r+="\n";
        }
        return r;
    }
    
}
