/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backtracking;

import java.util.Arrays;

/**
 *
 * @author antoni
 */
public class MotxillaImpl implements Motxilla {

    @Override
    public ElementMotxilla[] recursiu(ElementMotxilla[] a, double W1, double W2) {
        int[] sol = new int[a.length];
        double[] comprov = new double[4];
        int t[] = new int[a.length];
        Arrays.fill(sol, 0);
        Arrays.fill(t, 0);
        recursiu(a, comprov, sol, t, W1, W2, 0);

        return CrearSol(sol, a);

    }

    private void recursiu(ElementMotxilla a[], double comprov[], int sol[], int t[], double W1, double W2, int k) {
        t[k] = -1;
        while (t[k] < 1) {
            t[k]++;

            sum(a, comprov, t, sol, W1, W2);
            if (comprov[0] < W1 && comprov[1] < W2 && k < t.length) {
                if (k < t.length - 1) {
                    recursiu(a, comprov, sol, t, W1, W2, k + 1);
                }
            }
        }
        t[k] = 0;
    }

    @Override
    public ElementMotxilla[] iteratiu(ElementMotxilla a[], double W1, double W2) {
        int[] sol = new int[a.length];
        Arrays.fill(sol, 0);
        iteratiu(a, sol, W1, W2);
        System.out.println(Arrays.toString(sol));
        return CrearSol(sol, a);
    }

    private void iteratiu(ElementMotxilla[] a, int[] sol, double W1, double W2) {
        double[] comprov = new double[4];
        int t[] = new int[a.length];
        Arrays.fill(t, 0);

        int k = 0;
        t[k] = -1;
        while (k >= 0) {
            if (t[k] < 1) {
                t[k]++;

                sum(a, comprov, t, sol, W1, W2);
                if (comprov[0] < W1 && comprov[1] < W2 && k < t.length) {
                    if (k < t.length - 1) {
                        k++;
                        t[k] = -1;
                    }
                }
            } else {
                t[k] = 0;
                k--;
            }
        }
    }

    private void sum(ElementMotxilla[] a, double comprov[], int[] t, int sol[], double W1, double W2) {
        Arrays.fill(comprov, 0);

        for (int x = 0; x < a.length; x++) {
            comprov[0] += t[x] * a[x].getWeigth1();
            comprov[1] += t[x] * a[x].getWeigth2();
            comprov[2] += sol[x] * a[x].getProfit();
            comprov[3] += t[x] * a[x].getProfit();
        }
        if (comprov[3] > comprov[2] && comprov[0] <= W1 && comprov[1] <= W2) {
            System.arraycopy(t, 0, sol, 0, t.length);
        }

    }

    private ElementMotxilla[] CrearSol(int[] aux, ElementMotxilla a[]) {
        int lenght = 0;
        int pos = 0;
        for (int x = 0; x < aux.length; x++) {
            lenght = lenght + aux[x] * aux[x];
        }
        ElementMotxilla[] sol = new ElementMotxilla[lenght];
        for (int x = 0; x < aux.length; x++) {

            if (aux[x] == 1) {
                sol[pos] = a[x];
                pos++;
            }

        }

        return sol;
    }

}
