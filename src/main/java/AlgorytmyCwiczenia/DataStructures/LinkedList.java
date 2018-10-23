package AlgorytmyCwiczenia.DataStructures;

public class LinkedList {

    private Link first;

    public LinkedList() {
        first = null;
    }

    public void add(int value) {
        Link link = new Link(value);

        link.next = first;
        first = link;
    }

    public Link removeFirst() {
        Link link = first;

        if (isNotEmpty()) {
            first = link.next;
        } else System.out.println("Empty list!");
        return link;
    }

    public Link remove(int value) {
        Link link = first;
        Link previous = first;
        while (link.getValue() != value) {
            if (link.next == null) return null;
            else {
                previous = link;
                link = link.next;
            }
        }
        if (link == first) {
            first = first.next;
        } else {
            previous.next = link.next;
        }
        return link;
    }

    public String show() {
        StringBuilder s = new StringBuilder();
        Link link = first;
        while (link.next != null) {
            s.append(link.getValue()).append(", ");
            link = link.next;
        }

        return s.toString();
    }

    public boolean contains(int value) {
        Link link = first;

        if (isNotEmpty()) {
            while (link.getValue() != value) {

                if (link.next.getValue() == value) {
                    return true;
                } else {
                    link = link.next;
                }
            }
        } else {
            System.out.println("Empty list!");
        }
        return false;
    }

    boolean isNotEmpty() {
        return first != null;
    }
}

class Link {
    private int Value;
    Link next;

    Link(int value) {
        Value = value;
    }

    int getValue() {
        return Value;
    }
}
