/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtracking;

/**
 *
 * @author antoni
 */
public class BacktrackingImpl implements Backtracking {

   @Override
    public int[] knapSack(int W, int w[], int p[]) {
        int n = w.length;
        int[] mejorCombinacion = new int[n];

        mochilaUtil(W, w, p, n, 0, 0, new int[n], mejorCombinacion);

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
            mochilaUtil(capacidad, pesos, valores, n, indice + 1,
                    pesoActual + pesos[indice], combinacionActual, mejorCombinacion);
        }

        // No tomar el elemento actual
        combinacionActual[indice] = 0;
        mochilaUtil(capacidad, pesos, valores, n, indice + 1,
                pesoActual, combinacionActual, mejorCombinacion);
    }

    private int calcularValor(int[] combinacion, int[] valores) {
        int valorTotal = 0;
        for (int i = 0; i < combinacion.length; i++) {
            valorTotal += combinacion[i] * valores[i];
        }
        return valorTotal;
    }
}
