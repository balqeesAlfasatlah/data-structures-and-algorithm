package graph2;

import java.util.Objects;

public class Node<T> {

    public T value;
    public Node next;
    public Node() {

    }

    public Node(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }

        Node<?> node = (Node<?>) obj;
        return Objects.equals(value, node.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
