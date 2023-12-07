/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package backtracking;

import java.util.ArrayList;

/**
 * Interfície per al mètodes de Backtracking que implementarem durant les
 * sessions pràctiques
 * @author antoni
 */
public interface Backtracking {
    /**
     *@pre ∀i ((arr[i]>0)∧(arr=null))
     * @post ∀i ((ArrL.lenght>i=>0)∧(Ai[0]+Ai[1]....+Ai[Ai.lenght-1]=M))
     * 
     * L'ordre de complexitat d'aquest algorisme és aproximadament O(2^n), on n és la 
     * longitud de l'array d'entrada. Això es deu al fet que per a cada element de l'array, hi ha
     * dues opcions: incloure'l o excloure'l en cada subconjunt. Podeu visualitzar 
     * aquesta complexitat com un arbre binari, on cada node té dues branques, representant 
     * la decisió d'incloure o excloure un element.
     * 
     * Donat un conjunt numèric, trobar tots els subconjunts que sumen M
     * @param a conjunt númeric. Tots els elements a són >0
     * @param M Resultat suma dels subconjunts. M>=0
     * @return conjunt dels subconjunts que sumen M
     */
    public ArrayList<ArrayList<Integer>> sumM(int a[], int M);
}
