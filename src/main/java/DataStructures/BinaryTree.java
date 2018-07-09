package DataStructures;

public class BinaryTree {

    private BinaryTree rightChild;
    private BinaryTree leftChild;
    private int number;

    public BinaryTree(BinaryTree rightChild, BinaryTree leftChild, int number) {
        this.rightChild = rightChild;
        this.leftChild = leftChild;
        this.number = number;
    }

    public boolean isRoot(){
        return leftChild == null && rightChild == null;
    }
}
