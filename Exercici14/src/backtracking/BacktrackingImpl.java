/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtracking;

import java.util.Random;

/**
 *
 * @author Pere, Daniel
 * @author antoni
 */
public class BacktrackingImpl implements Backtracking {

    @Override
    public int[] knapSack(int W, int w[], int p[]) {
        int n = w.length;
        int[] mejorCombinacion = new int[n];

        //boolean forceMode = false; 
        Random r = new Random(); //testea aleatoriamente rec y iter

        if (r.nextBoolean()) {  //la interfaz no diferencia
            System.out.println("Rec");
            mochilaUtil(W, w, p, n, 0, 0, new int[n], mejorCombinacion);
        } else {
            System.out.println("Iter");
            mochilaUtilIter(W, w, p, mejorCombinacion);
        }
        // Devolvemos la combinación óptima en binario
        return mejorCombinacion;
    }

    private void mochilaUtil(int capacidad, int[] pesos, int[] valores, int n, int indice,
            int pesoActual, int[] combinacionActual, int[] mejorCombinacion) {
        // Caso base: si hemos explorado todos los elementos
        if (indice == n) {
            // Verificamos si la combinación actual es mejor que la mejor conocida
            if (calcularValor(combinacionActual, valores) > calcularValor(mejorCombinacion, valores)) {
                System.arraycopy(combinacionActual, 0, mejorCombinacion, 0, n);
            }
            return;
        }

        // Tomar el elemento actual si cabe en la mochila
        if (pesoActual + pesos[indice] <= capacidad) {
            combinacionActual[indice] = 1;
            //antes y después de la llamada recursiva se cumplen precondición y postcondición
            //además, el conjunto se reduce al avanzar por el árbol binario
            mochilaUtil(capacidad, pesos, valores, n, indice + 1,
                    pesoActual + pesos[indice], combinacionActual, mejorCombinacion);
        }

        // No tomar el elemento actual
        combinacionActual[indice] = 0;
        mochilaUtil(capacidad, pesos, valores, n, indice + 1,
                pesoActual, combinacionActual, mejorCombinacion);
    }

    private void mochilaUtilIter(int pesMax, int[] pes, int[] val, int[] sol) {
        int[] t = new int[pes.length]; //posible sol
        for (int i = 0; i < t.length; i++) {
            t[i] = -1;
        }
        int maxVal = Integer.MIN_VALUE;
        int k = 0;
        int cPes = 0, cVal = 0;
        while (k >= 0) {
            if (t[k] < 1) {
                t[k]++;
                cPes += pes[k]*t[k];
                cVal += val[k]*t[k];
                if (cPes <= pesMax && (k == t.length - 1)) {
                    if (cVal > maxVal) {
                        maxVal = cVal;
                        System.arraycopy(t, 0, sol, 0, t.length);
                    }
                } else if (cPes <= pesMax && (k < t.length - 1)) {
                    k++;
                }
            } else {
                cPes -= pes[k]*t[k];
                cVal -= val[k]*t[k];
                t[k] = -1;
                
                k--;
            }
        }
    }

    private int calcularValor(int[] combinacion, int[] valores) {
        int valorTotal = 0;
        for (int i = 0; i < combinacion.length; i++) {
            valorTotal += combinacion[i] * valores[i];
        }
        return valorTotal;
    }

    private int calcularPeso(int[] combinacion, int[] pesos) {
        int pesoTotal = 0;
        for (int i = 0; i < combinacion.length; i++) {
            pesoTotal += combinacion[i] * pesos[i];
        }
        return pesoTotal;
    }
}
