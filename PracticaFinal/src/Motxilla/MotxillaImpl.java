/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Motxilla;

import java.util.Arrays;

/**
 *
 * @author trufi
 */
public class MotxillaImpl implements InterfaceMotxilla {

    @Override
    public int[] knapSack(int W, int[] w, int[] p) {
        int[] comprov = new int[3];
        int[] t = new int[p.length];
        int[] sol = new int[p.length];
        Arrays.fill(sol, 0);

        KnapSack(W, w, p, sol, t, comprov, 0);
        return sol;

    }

    @Override
    public int[] knapSackIter(int W, int[] w, int[] p) {
        int[] comprov = new int[3];
        int[] sol = new int[p.length];
        Arrays.fill(sol, 0);
        int t[] = new int[p.length];
        Arrays.fill(t, -1);
        int k = 0;
        while (k >= 0) {

            if (t[k] < 1) {
                t[k]++;
                sum(W, w, p, sol, t, comprov);
                if (comprov[0] < W && k < t.length) {
                    if (k < t.length - 1) {
                        k++;
                    }
                }
            } else {
                t[k] = -1;
                k--;
            }

        }
        return sol;
    }

    private void KnapSack(int W, int[] w, int[] p, int[] sol, int[] t, int[] comprov, int k) {

        t[k] = -1;

        while (t[k] < 1) {
            t[k]++;
            sum(W, w, p, sol, t, comprov);
            if (comprov[0] < W && k + 1 < w.length) {
                KnapSack(W, w, p, sol, t, comprov, k + 1);
            }
        }
        t[k] = 0;
    }

    private void sum(int W, int[] w, int[] p, int[] sol, int[] t, int[] comprov) {
        Arrays.fill(comprov, 0);

        for (int x = 0; x < p.length; x++) {

            comprov[0] += t[x] * w[x];
            comprov[1] += sol[x] * p[x];
            comprov[2] += t[x] * p[x];
        }
        if (comprov[2] > comprov[1] && comprov[0] <= W) {

            System.arraycopy(t, 0, sol, 0, t.length);

        }

    }

}
