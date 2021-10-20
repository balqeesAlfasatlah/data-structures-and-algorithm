package linked.list.insertions;

public class Node<T> {

    public Node next;
    public T val ;

    public Node(T val){
        this.val = val;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }
}
