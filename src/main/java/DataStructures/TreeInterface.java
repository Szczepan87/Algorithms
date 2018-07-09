package DataStructures;

public interface TreeInterface {

    void put(int number);

    int get();

    BinaryTree getParent();

    BinaryTree getChildren();

    int size();

    int height();

    boolean isRoot(BinaryTree binaryTree);
}
