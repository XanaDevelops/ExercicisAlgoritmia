/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtracking;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Classe implementació Backtracking
 *
 * @author antoni
 */
public class BacktrackingImpl implements Backtracking {

    @Override
    public ArrayList<ArrayList<Integer>> sumM(int[] a, int M) {
        int[] t = new int[a.length];
        ArrayList<ArrayList<Integer>> sols = new ArrayList<>();
        sols = sumM(a, M, t, 0, sols);
        /*if(sols.isEmpty()){
            sols.add(new ArrayList<>());
        }*/
        return sols;
    }

    private ArrayList<ArrayList<Integer>> sumM(int[] a, int M, int[] t, int k,
            ArrayList<ArrayList<Integer>> sols) {
        t[k] = -1;
        while (t[k] < 1) {
            t[k]++;
            int s = sum(a,t,k);
            if ((s == M) && (k == a.length - 1)) { //caso base 
                printSol(a, t, sols,k);
            } else if ((s <= M) && (k < a.length - 1)) {
                sumM(a, M, t, k + 1, sols);//k augmenta en uno reduciendo el tamaño de elementos a analizar

            }

        }

        t[k] = -1;
        return sols;
    }

    private int sum(int[] a, int[] t, int k) {
        
        //System.out.println(Arrays.toString(a));
        //System.out.println(Arrays.toString(t));
        //System.out.println(k);
        int r = 0;
        for (int i = 0; i < a.length; i++) {
            if (t[i] > 0) {
                r += a[i];
            }
        }
        //System.out.println("SUM RES: " + r);
        System.out.println("%d: %s = %d".formatted(k,Arrays.toString(t),r));
        return r;
    }

    private void printSol(int[] a, int[] t, ArrayList<ArrayList<Integer>> sols, int k) {
        System.out.println("------ SOL ------ "+k);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(t));
        System.out.println("----------------- ");
        ArrayList<Integer> r = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (t[i] > 0) {
                r.add(a[i]);
            }
        }
        sols.add(r);

    }

    private void printSol(ArrayList<Integer> a) {
        System.out.println(a);
    }
}
