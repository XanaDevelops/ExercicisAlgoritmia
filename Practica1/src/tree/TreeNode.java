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
     *
     * @param elem
     */
    public TreeNode(E elem){
        this.elem = elem;
        fillEsq = null;
        fillDret = null;
    }
    
    /**
     *
     * @param elem
     * @param fE
     * @param fD
     */
    public TreeNode(E elem, TreeNode<E> fE, TreeNode<E> fD){
        this.elem = elem;
        fillEsq = fE;
        fillDret = fD;
    }

    /**
     *
     * @return
     */
    public TreeNode<E> getFillEsq() {
        return fillEsq;
    }
    
    /**
     *
     * @param e
     * @return
     */
    public int compareEsq(E e){
        return fillEsq.getElem().compareTo(e);
    }

    /**
     *
     * @param fillEsq
     */
    public void setFillEsq(TreeNode<E> fillEsq) {
        this.fillEsq = fillEsq;
    }

    /**
     *
     * @return
     */
    public TreeNode<E> getFillDret() {
        return fillDret;
    }
    
    /**
     *
     * @param e
     * @return
     */
    public int compareDret(E e){
        return fillDret.getElem().compareTo(e);
    }

    /**
     *
     * @param fillDret
     */
    public void setFillDret(TreeNode<E> fillDret) {
        this.fillDret = fillDret;
    }

    /**
     *
     * @return
     */
    public E getElem() {
        return elem;
    }

    /**
     *
     * @param elem
     */
    public void setElem(E elem) {
        this.elem = elem;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "TreeNode{" + "elem=" + elem + '}';
    }
    
    
    
}
