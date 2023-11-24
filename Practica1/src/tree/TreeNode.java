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

    public TreeNode<E> getFillEsq() {
        return fillEsq;
    }
    
    public int compareEsq(E e){
        return fillEsq.getElem().compareTo(e);
    }

    public void setFillEsq(TreeNode<E> fillEsq) {
        this.fillEsq = fillEsq;
    }

    public TreeNode<E> getFillDret() {
        return fillDret;
    }
    
    public int compareDret(E e){
        return fillDret.getElem().compareTo(e);
    }

    public void setFillDret(TreeNode<E> fillDret) {
        this.fillDret = fillDret;
    }

    public E getElem() {
        return elem;
    }

    public void setElem(E elem) {
        this.elem = elem;
    }

    @Override
    public String toString() {
        return "TreeNode{" + "elem=" + elem + '}';
    }
    
    
    
}
