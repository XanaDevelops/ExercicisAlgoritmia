/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/**
 * Arbre Binari per Referencies
 * @see BinaryTree
 * @author Daniel
 * @author antoni
 * @param <E>
 */
public class BinaryTreeReference<E extends Comparable<E>> implements BinaryTree<E> {

    private TreeNode<E> root;

    /**
     * Constructor de l'arbre binari
     */
    public BinaryTreeReference() {
        root = null;
    }
    
    /**
     * {@inheritDoc}
     * @ord 0(1)
     */
    @Override
    public boolean isEmpty() {
        return root == null;
    }

    
    /**
     * {@inheritDoc}
     * @ord 0(log2(n)) sent log2(n) l'altura màxima de l'arbre
     */
    @Override
    public void insert(E e) {
        if (isEmpty()) {
            root = new TreeNode<E>(e);
            return;
        }
        insert(root, e);

    }

    private void insert(TreeNode<E> mother, E e) {
        if (e.compareTo(mother.getElem()) < 0) {
            if (mother.getFillEsq() != null) {
                insert(mother.getFillEsq(), e);
            } else {
                mother.setFillEsq(new TreeNode<E>(e));
                System.out.println("Madre: "+mother+" hijoE: "+e);
            }
        } else if (e.compareTo(mother.getElem()) > 0) {
            if (mother.getFillDret() != null) {
                insert(mother.getFillDret(), e);
            } else {
                mother.setFillDret(new TreeNode<E>(e));
                System.out.println("Madre: "+mother+" hijoD: "+e);
            }
        }
    }

    /**
     * {@inheritDoc}
     * @ord 0(log2(n)) sent log2(n) l'altura màxima de l'arbre
     */
    @Override
    public boolean contains(E e) {
        if (e.compareTo(root.getElem()) == 0) {
            return true;
        }
        return contains(root, e);
    }

    private boolean contains(TreeNode<E> mother, E e) {
        if (mother == null) {
            return false;
        }
        if (e.compareTo(mother.getElem()) == 0) {
            return true;
        }
        return contains(mother.getFillEsq(), e) ||
               contains(mother.getFillDret(), e);

    }

    /**
     * {@inheritDoc}
     * @ord 0(n) 
     */
    @Override
    public int longestBranch() {
        if(root==null){
            return 0;
        }
        return longestBranch(root, -1);
    }
    private int longestBranch(TreeNode<E> mother, int c){
        if(mother == null){
            return c;
        }
        c++;
        System.out.println(mother+" "+c);
        return Math.max(longestBranch(mother.getFillEsq(),c), 
                longestBranch(mother.getFillDret(),c));
    }

    /**
     * {@inheritDoc}
     * @ord 0(log2(n)) sent log2(n) l'altura màxima de l'arbre
     */
    @Override
    public E getMother(E e) { //Give us Mother3 Nintendo!
        if (e.compareTo(root.getElem()) == 0) { //root no te mare
            return null;
        }
        return getMother(root, e);
    }

    private E getMother(TreeNode<E> mother, E e) {
        if (mother.getFillEsq() != null) {
            if (mother.compareEsq(e) == 0) {
                return mother.getElem();
            }
            if (mother.compareEsq(e)>0){
                return getMother(mother.getFillEsq(),e );
            }
        }
        if (mother.getFillDret()!= null) {
            if (mother.compareDret(e) == 0) {
                return mother.getElem();
            }
            if (mother.compareDret(e)<0){
                return getMother(mother.getFillDret(),e );
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     * @ord 0(1)
     */
    @Override
    public E getRoot() {
        return root != null ? root.getElem() : null;
    }

}
