/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/**
 * Classe node per a l'arbre binari
 * @author danie
 * @param <E>
 */
public class TreeNode<E extends Comparable<E>> {
    private TreeNode<E> fillEsq,fillDret;
    private E elem;
    
    /**
     * Classe auxiliar per a l'arbre binari
     * @param elem Element a emmagatzemar
     */
    public TreeNode(E elem){
        this.elem = elem;
        fillEsq = null;
        fillDret = null;
    }
    
    /**
     * Classe auxiliar per a l'arbre binari
     * @param elem Element a emmagatzemar
     * @param fE Referencia {@link TreeNode} fill esquerre
     * @param fD Referencia {@link TreeNode} fill dret
     */
    public TreeNode(E elem, TreeNode<E> fE, TreeNode<E> fD){
        this.elem = elem;
        fillEsq = fE;
        fillDret = fD;
    }

    /**
     *
     * @return {@link TreeNode} fill esquerre
     */
    public TreeNode<E> getFillEsq() {
        return fillEsq;
    }
    
    /**
     * Funció auxiliar pero comparable
     * @param e element a comparar
     * @return
     */
    public int compareEsq(E e){
        return fillEsq.getElem().compareTo(e);
    }

    /**
     *
     * @param fillEsq Nou Fill esquerre
     */
    public void setFillEsq(TreeNode<E> fillEsq) {
        this.fillEsq = fillEsq;
    }

    /**
     *
     * @return {@link TreeNode} fill dret
     */
    public TreeNode<E> getFillDret() {
        return fillDret;
    }
    
    /**
     * Funció auxiliar pero comparable
     * @param e element a comparar
     * @return
     */
    public int compareDret(E e){
        return fillDret.getElem().compareTo(e);
    }

    /**
     *
     * @param fillDret Nou Fill dret
     */
    public void setFillDret(TreeNode<E> fillDret) {
        this.fillDret = fillDret;
    }

    /**
     *
     * @return Element
     */
    public E getElem() {
        return elem;
    }

    /**
     *
     * @param elem Element
     */
    public void setElem(E elem) {
        this.elem = elem;
    }

    /**
     *
     * @return String
     */
    @Override
    public String toString() {
        return "TreeNode{" + "elem=" + elem + '}';
    }
    
    
    
}
