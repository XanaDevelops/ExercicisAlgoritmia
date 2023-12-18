/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package backtracking;

/**
 * Interfície per al mètodes de Backtracking que implementarem durant les
 * sessions pràctiques
 *
 * @author antoni
 */
public interface Backtracking {

    /**
     *
     * @pre pesos.length == valores.length ∧∀i (pesos.length>i=>0)∧pesos[i]≥0 ∧
     * valores[i]≥0 ∧capacidad≥0
     * @post
     * (mejorCombinacion.lenght==pesos.lenght)∧((∀i:mejorCombinacion.lenght>i=>0)∧(mejorCombinacion[i]∈[0,1]))∧(mejorcombinacio[0]*valores[0]+...+mejorcombinacio[i]*valores[i])
     * @ord El algoritmo es de complejidad O(2**n) esto se debe a que, en cada
     * nivel del árbol, binario, de recursión, hay dos ramas, una para tomar el
     * elemento y otra para no tomarlo.
     * @param W pes màxim de la motxilla, >0
     * @param w conjunt de pesos de cada element, cada w[i] > 0
     * @param p conjunt del profit de cada element, cada p[i] > 0
     * @return selecció més òptima
     */
    public int[] knapSack(int W, int w[], int p[]);
}
