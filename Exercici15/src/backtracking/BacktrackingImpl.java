/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtracking;

import java.util.Arrays;

/**
 *
 * @author antoni
 */
public class BacktrackingImpl implements Backtracking {

    //controla si recursiu o iteratiu
    private final boolean ITERMODE = true;

    @Override
    public boolean mapColor(int[][] map, int nColors) {
        int sol[] = new int[map.length];

        if (ITERMODE) {
            return mapColorIter(map, nColors, sol);
        } else {
            int ColorMap[] = new int[map.length];
            Arrays.fill(ColorMap, -1);

            Arrays.fill(sol, -1);
            MapColor(map, nColors, ColorMap, sol, 0);

            if (sol[0] != -1) {

                System.out.println(Arrays.toString(sol));
                return true;

            } else {
                return false;
            }
        }

    }

    private void MapColor(int[][] map, int nColors, int ColorMap[], int sol[], int k) {
        ColorMap[k] = -1;
        while (ColorMap[k] < nColors - 1 && sol[0] == -1) {
            ColorMap[k]++; //avança dins un arbre n-ari
            if (possible(map, ColorMap, k) == true && k + 1 < ColorMap.length) {
                MapColor(map, nColors, ColorMap, sol, k + 1); //augmentar k redueix el nombre d'elements a comprobar
            } else if (k + 1 == ColorMap.length && possible(map, ColorMap, k) == true) {
                System.arraycopy(ColorMap, 0, sol, 0, ColorMap.length);
            }
        }

    }

    private boolean mapColorIter(int[][] map, int nColors, int sol[]) {
        int t[] = new int[map.length];
        Arrays.fill(t, -1);
        int k = 0;
        while (k >= 0) {
            System.out.println("D: " + Arrays.toString(t) + k);
            if (t[k] < nColors-1) {
                t[k]++;
                if (possible(map, t, k)) {
                    if (k == t.length - 1) {
                        System.out.println(Arrays.toString(t));
                        return true;
                    } else if(k<t.length-1){
                        k++;
                    }
                }
            } else {
                t[k] = -1;
                k--;
            }

        }
        return false;
    }

    public boolean possible(int[][] map, int ColorMap[], int k) {
        //System.out.println("P: " + Arrays.toString(ColorMap) + k);
        for (int x = 0; x < map[k].length; x++) {
            if (ColorMap[k] == ColorMap[map[k][x]]) {
                return false;
            }
        }
        return true;
    }

}
