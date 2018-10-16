package AlgorytmyCwiczenia.DataStructures;

//https://www.baeldung.com/java-binary-tree
public class BinaryTree {

    Node root;

    private Node addRecursive(Node current, int value) {

        if (current == null) {
            return new Node(value); // jeśli null to znaczy, że znajdujemy się w liściu i należy stworzyć nowy node
        } else if (value < current.value) {
            current.left = addRecursive(current.left, value); // mniejsze wartości na lewo
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value); // większe wartości na prawo
        }// jeśli wartość już istnieje zwracamy current

        return current;
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        // w zależności czy wartość szukana jest mniejsza lub większa sprawdza lewy lub prawy liść
        return value < current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }
    // zwraca mniejszą wartość, która jest zawsze z lewej
    private int findSmallestValue(Node root){
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    private Node deleteRecursive(Node current, int value){
        if(current == null) return null;

        if (value == current.value){
            // jeśli nie ma dzieci
            if (current.left == null && current.right == null){
                return null;
            }
            // jeśli jest jedno dziecko
            if (current.right == null){
                return current.left;
            }
            if (current.left == null){
                return current.right;
            }
            // jeśli dwoje dzieci
            //TODO
            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }

        if (value< current.value){
            current.left = deleteRecursive(current.left,value);
            return current;
        }

        current.right = deleteRecursive(current.right, value);
        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value); // start z root
    }

    public boolean containsNode(int value){
        return containsNodeRecursive(root, value); // start z root
    }

    public void delete(int value){
        root = deleteRecursive(root, value);
    }
}


class Node {

    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
