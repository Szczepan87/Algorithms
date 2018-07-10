package DataStructures;

public class BinaryTree implements TreeInterface{

    private BinaryTree rightChild;
    private BinaryTree leftChild;
    private int number;

    public BinaryTree(BinaryTree rightChild, BinaryTree leftChild, int number) {
        this.rightChild = rightChild;
        this.leftChild = leftChild;
        this.number = number;
    }

    @Override
    public void put(int number) {

    }

    @Override
    public int get() {
        return 0;
    }

    @Override
    public BinaryTree getParent() {
        return null;
    }

    @Override
    public BinaryTree[] getChildren() {
        return new BinaryTree[]{rightChild, leftChild};
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int height() {
        return 0;
    }

    @Override
    public boolean isRoot(BinaryTree binaryTree) {
        return leftChild == null && rightChild == null;
    }
}
