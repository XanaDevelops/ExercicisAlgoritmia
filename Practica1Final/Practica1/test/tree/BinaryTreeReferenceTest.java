/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package tree;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author antoni
 */
public class BinaryTreeReferenceTest {
    private BinaryTree<Integer> tree, tree2;

    @Before
    public void setUp() throws Exception {
        tree = new BinaryTreeReference();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(10);
        tree.insert(80);
        
        //arbre propi
        System.out.println("TREE2");
        tree2 = new BinaryTreeReference();
        tree2.insert(10);
        tree2.insert(13);
        tree2.insert(11);
        tree2.insert(14);
        tree2.insert(8);
        tree2.insert(9);
        tree2.insert(7);
    }

    /**
     * Test of isEmpty method, of class BinaryTreeReference.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        BinaryTree<Integer> instance = new BinaryTreeReference();
        assertEquals(true, instance.isEmpty());
        assertEquals(false, tree.isEmpty());
    }

    /**
     * Test of insert method, of class BinaryTreeReference.
     */
    @Test
    public void testInsertContains() {
        System.out.println("insertContains");
        assertEquals(false,tree.contains(25));
        tree.insert(25);
        assertEquals(true,tree.contains(25));
        
        //tree2
        assertEquals(false, tree2.contains(12));
        assertEquals(true, tree2.contains(11));
    }

    /**
     * Test of longestBranch and Insert method, of class BinaryTreeReference.
     */
    @Test
    public void testLongestBranchInsert() {
        System.out.println("longestBranchInsert");
        assertEquals(3, tree.longestBranch());
        tree.insert(25);
        assertEquals(3, tree.longestBranch());
        tree.insert(5);
        assertEquals(4, tree.longestBranch());
        tree.insert(81);
        tree.insert(82);
        tree.insert(83);
        assertEquals(5, tree.longestBranch());
        
        //tree2
        assertEquals(2, tree2.longestBranch());
    }

    /**
     * Test of getMother method, of class BinaryTreeReference.
     */
    @Test
    public void testGetMother() {
        System.out.println("getMother");
        assertEquals(null, tree.getMother(50));
        int i = tree.getMother(30);
        assertEquals(50, i);
        i = tree.getMother(70);
        assertEquals(50,i); 
        i = tree.getMother(10);
        assertEquals(20, i);
        assertEquals(null, tree.getMother(15));
        assertEquals(null, tree.getMother(tree.getRoot()));
        
        //tree2
        assertEquals(Integer.valueOf(8), tree2.getMother(7));
        assertEquals(Integer.valueOf(10), tree2.getMother(8));
        assertEquals(Integer.valueOf(13), tree2.getMother(14));
    }

    /**
     * Test of getRoot method, of class BinaryTreeReference.
     */
    @Test
    public void testGetRoot() {
        System.out.println("getRoot");
        int i = tree.getRoot();
        assertEquals(50, i);
    }
}
