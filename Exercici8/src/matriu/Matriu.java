/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matriu;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import matriu.excepciones.DimensionNoAdecuada;

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
    private Class<T> tipo = null;
    private int numMult;

    /**
     * Constructor
     *
     * @param w amplada de la matriu
     * @param h altura de la matriu
     * @param type tipus de dada que guarada la matriu
     */
    public Matriu(int w, int h, Class<T> type) {
        tipo = type;
        this.w = w;
        this.h = h;
        matriu = (T[]) Array.newInstance(type, w * h);
    }

    /**
     * Aquesta funcio parmet introduir un array de les dimensions de la matriu
     * per canviar el seu valor
     *
     * @param act matriu que assignam
     * @throws DimensionNoAdecuada aquesta excepcio es llança si les dimensions
     * de la matriu no son adecuades
     */
    public void actualizarMat(T act[]) throws DimensionNoAdecuada {

        if (w * h != act.length) {
            throw new DimensionNoAdecuada();

        }
        for (int x = 0; x < w * h; x++) {
            matriu[x] = act[x];
        }

    }

    /**
     * aquesta funcio ens retorna la matriu
     *
     * @return
     */
    public T[] getMatriu() {
        return matriu;
    }

    /**
     * aquest valor retorna la amplada de la matriu
     *
     * @return
     */
    public int getW() {
        return w;
    }

    /**
     * aquest valor retorna la altura de la matriu
     *
     * @return
     */
    public int getH() {
        return h;
    }

    /**
     * aquest metode ens permet guardar un valor especific dins una cassela
     * concreta de la matriu
     *
     * @param value valor a assignar
     * @param x columna que volem accedir
     * @param y fila que volem accedir
     */
    public void set(T value, int x, int y) {
        if (x < 0 || y < 0 || x >= w || y >= h) {
            throw new IllegalArgumentException();
        }
        matriu[w * y + x] = value;
    }

    /**
     * aquest metode ens retorna el valor especific de una cassela
     *
     * @param x columna a la qual volem accedir
     * @param y fila a la qual volem accedir
     * @return valor de la cassela que ens retorna
     */
    public T get(int x, int y) {
        if (x < 0 || y < 0 || x >= w || y >= h) {
            throw new IllegalArgumentException();
        }
        return matriu[w * y + x];
    }

    /**
     * Aquest metode multiplica la matriu de la cla
     *
     * @param m Matriu b
     * @return  Matriu resultant
     * @throws NoMultiplicable
     */
    public Matriu<T> mult(Matriu<T> m) throws NoMultiplicable {
        numMult = w * w * m.getW() * h;//codi per obtenir el numero de multiplicacions
        Matriu<T> sol = new Matriu(m.getW(), h, m.matriu[0].getClass());

        if (w != m.getH()) {
            throw new NoMultiplicable();

        }
        for (int x = 0; x < h; x++) {
            for (int y = 0; y < m.getW(); y++) {
                sol.matriu[x * m.getW() + y] = casteador(BigDecimal.ZERO);
                for (int z = 0; z < w; z++) {
                    sol.matriu[x * m.getW() + y] = casteador(suma(sol.matriu[x * m.getW() + y], (T) casteador(mult(matriu[x * w + z], m.matriu[z * m.w + y]))));
                }

            }
        }
        return sol;
    }

    private BigDecimal suma(T a, T b) {
        return BigDecimal.valueOf(a.doubleValue()).add(BigDecimal.valueOf(b.doubleValue()));
    }

    private BigDecimal resta(T a, T b) {
        return BigDecimal.valueOf(a.doubleValue()).subtract(BigDecimal.valueOf(b.doubleValue()));
    }

    private BigDecimal mult(T a, T b) {
        return BigDecimal.valueOf(a.doubleValue()).multiply(BigDecimal.valueOf(b.doubleValue()));
    }

    private BigDecimal div(T a, T b) {
        return BigDecimal.valueOf(a.doubleValue()).divide(BigDecimal.valueOf(b.doubleValue()));
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String r = "";
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                r += matriu[w * i + j] + ", ";
            }
            r += "\n";
        }
        return r;
    }

    /**
     *
     * @param a
     * @return
     */
    public T casteador(BigDecimal a) {

        if (tipo == Integer.class) {
            return (T)Integer.valueOf(a.intValue());
        } else if (tipo == Long.class) {
            return (T)Long.valueOf(a.longValue());
        } else if (tipo == Double.class) {
            return (T)Double.valueOf(a.doubleValue());
        } else if (tipo == Float.class) {
            return (T)Float.valueOf(a.floatValue());
        }
        return null;
    }
}
