package DataStructures;

public interface TreeInterface {

    void put(int number);

    int get();

    BinaryTree getParrent();

    BinaryTree getChildren();

    int size();

    int hight();

    boolean isRoot(BinaryTree binaryTree);
}
