package trees;

import java.util.ArrayList;
import java.util.List;

public class KNode <T>{

    public T value;
    public List<KNode<T>> child = new ArrayList<>();

    public KNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public List<KNode<T>> getChild() {
        return child;
    }

    public void setChild(List<KNode<T>> child) {
        this.child = child;
    }
    public void addChild (KNode<T>child){
        this.child.add(child);
    }

    @Override
    public String toString() {
        return "KNode{" +
                "value=" + value +
                ", child=" + child +
                '}';
    }
}
