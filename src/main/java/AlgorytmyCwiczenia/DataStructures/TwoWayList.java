package AlgorytmyCwiczenia.DataStructures;

import java.util.Objects;

public class TwoWayList {

    private Element head;
    private Element tail;
    private int size;

    public TwoWayList() {
        size = 0;
    }

    public void add(Object value){
        Element e = new Element(value, tail,null);
        if (size == 0){
            head = e;
            tail = e;
        } else {

        }

        if (head!=null) head.next = e;
        head = e;
        if (tail==null) tail = e;
        size++;
    }

    public void delete(Object value){

        if(size==0) return;
        Element checking = head;
        while (checking != null){
            if (checking.value.equals(value)){

            }
        }
        size--;
    }

    public boolean contains(Object value){
        Element checking = head;
        while (checking != null){
            if (checking.value.equals(value)){
                return true;
            }
            checking = checking.next;
        }
        return false;
    }

    public void clear(){
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmty(){
        return size == 0;
    }

    class Element{

        private Object value;
        private Element previous;
        private Element next;

        public Element(Object value, Element previous, Element next) {
            this.value = value;
            this.previous = previous;
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Element)) return false;
            Element element = (Element) o;
            return value == element.value &&
                    previous == element.previous &&
                    next == element.next;
        }
        @Override
        public int hashCode() {
            return Objects.hash(value, previous, next);
        }
    }

}
