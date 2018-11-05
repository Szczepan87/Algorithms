package AlgorytmyCwiczenia.DataStructures;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Objects;

public class TwoWayList {

    private Element head;
    private Element tail;
    private int index;
    private int size;

    public TwoWayList() {
        size = 0;
        index = 0;
        head = null;
        tail = null;
    }

    public void addAtFront(int value){
        Element element = new Element(index,value);
        if (isEmpty()){
            tail = element;
        } else {
            head.previous = element;
        }
        element.next = head;
        head = element;

        index++;
        size++;
        throw new NotImplementedException();
    }

    public void add(int value){
        Element element = new Element(index,value);

        if (isEmpty()){
            head = element;
        }else {
            tail.next = element;
            element.previous = tail;
        }
        tail = element;
    }

    public void deleteAtIndex(int index){
        throw new NotImplementedException();
    }

    public void delete(int value){
        throw new NotImplementedException();
    }

    public boolean contains(Object value){
        throw new NotImplementedException();
    }

    public void clear(){
        throw new NotImplementedException();
    }

    public void show(){
        Element element = head;
        while (element!=null){
            System.out.println(element.toString());
            element = element.next;
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    class Element {

        private int index;
        private int value;
        Element previous;
        Element next;

        public Element(int index, int value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Element{" +
                    "index=" + index +
                    ", value=" + value +
                    ", previous=" + previous +
                    ", next=" + next +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Element)) return false;
            Element element = (Element) o;
            return index == element.index &&
                    Objects.equals(value, element.value) &&
                    Objects.equals(previous, element.previous) &&
                    Objects.equals(next, element.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(index, value, previous, next);
        }
    }
}
