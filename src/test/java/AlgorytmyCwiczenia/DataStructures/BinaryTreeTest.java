package AlgorytmyCwiczenia.DataStructures;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    private BinaryTree testBinaryTree(){
        BinaryTree binaryTree = new BinaryTree();
        Arrays.asList(3,6,9,25,8,1,4,17).forEach(integer -> binaryTree.add(integer));
        return binaryTree;
    }

    @Test
    public void findInTreeTest() {
        assertTrue(testBinaryTree().containsNode(25));
        assertTrue(testBinaryTree().containsNode(1));
        assertTrue(testBinaryTree().containsNode(17));
        assertFalse(testBinaryTree().containsNode(177));
    }

    @Test
    public void deleteFromTreeTest() {
        testBinaryTree().delete(6);
        assertFalse(testBinaryTree().containsNode(6));
    }
}