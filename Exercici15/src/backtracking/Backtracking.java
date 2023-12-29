/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package backtracking;

/**
 * Interfície per al mètodes de Backtracking que implementarem durant les
 * sessions pràctiques
 * @author antoni
 */
public interface Backtracking {
    
    /**
     * @pre (∀i,j:(Map[i][j]=1-->Teritorio i adyacente Teritorio j)∧(Map[i][j]=0-->Teritorio i  no adyacente Teritorio j))∧(nColors>0)
     * @post (∀i,j  (Territorio adyacente i !=Territorio adyacente j)-->return false )
     * 
     * @ord En el pitjor cas, l'algorisme pot explorar totes les combinacions possibles 
     * de colors per a cada territori, que és una operació exponencial amb el nombre 
     * de territoris. L'ordre de complexitat seria O(C^T), on C és el nombre de colors i T és el nombre de territoris.
     * 
     *<br> <br>Cas base:  El cas base és quan s'han colorejat tots els territoris. En aquest punt, es retorna 
     * Cert indicant que s'ha trobat una solució vàlida.<br><br>
     * Cas General:  La recursió comença seleccionant un territori no colorat, explorant les 
     * possibles assignacions de color i verificant si compleixen les restriccions. Si l'assignació és vàlida, 
     * es continua amb la següent etapa recursiva; en cas contrari, es retrocedeix (backtrack) i es prova amb una altra assignació.<br>
     * @param map mapa, on per cada regió es llisten les regions veïnades
     * @param nColors número màxim de colors a utilitzar
     * @return indica si es pot colorejar amb el nColors o no
     */
    public boolean mapColor(int map[][], int nColors);
}
