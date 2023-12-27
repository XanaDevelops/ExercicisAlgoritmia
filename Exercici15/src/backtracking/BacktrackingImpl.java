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

    @Override
    public boolean mapColor(int[][] map, int nColors) {
        int ColorMap[] = new int[map.length];
        Arrays.fill(ColorMap, -1);
        int sol[] = new int[map.length];
        Arrays.fill(sol, -1);
        MapColor(map, nColors, ColorMap, sol, 0);

        if (sol[0] != -1) {

            System.out.println(Arrays.toString(sol));
            return true;

        } else {
            return false;
        }

    }

    private void MapColor(int[][] map, int nColors, int ColorMap[], int sol[], int k) {
        ColorMap[k] = -1;
        while (ColorMap[k] < nColors - 1 && sol[0] == -1) {
            ColorMap[k]++;
            if (possible(map, ColorMap, k) == true && k + 1 < ColorMap.length) {
                MapColor(map, nColors, ColorMap, sol, k + 1);
            } else if (k + 1 == ColorMap.length && possible(map, ColorMap, k) == true) {
                System.arraycopy(ColorMap, 0, sol, 0, ColorMap.length);
            }
        }

    }

    public boolean possible(int[][] map, int ColorMap[], int k) {

        for (int x = 0; x < map[k].length; x++) {

            if (ColorMap[k] == ColorMap[map[k][x]]) {
                return false;
            }

        }

        return true;

    }
}
