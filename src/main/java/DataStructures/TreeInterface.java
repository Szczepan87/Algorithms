package DataStructures;

public interface TreeInterface {

    BinaryTree put(int number);

    BinaryTree get(BinaryTree binaryTree);

    int size();

    int hight();

    boolean isRoot(BinaryTree binaryTree);
}
