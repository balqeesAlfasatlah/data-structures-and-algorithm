package graph;

import java.util.*;

public class Graph<T> {

    public Map<Node<T> , List<Node<T>>> list= new HashMap<>();

    public Graph() {}

    public Node<T> addNode(T val) {
        Node<T> node = new Node<T>(val);
        list.put(node, new ArrayList<>());
        return node;
    }

    public void addEdge(T val1, T val2) {
        Node<T> n1 = new Node<T>(val1);
        if (val1.equals(val2)){
            list.get(n1).add(n1);
        } else {
            Node<T> n2 = new Node<T>(val2);
            list.get(n1).add(n2);
            list.get(n2).add(n1);
        }
    }

    public Set<Node<T>> getNodes() {
        return list.keySet();
    }

    public List<Node<T>> getNeighbors(T value) {
        return list.get(new Node<T>(value));
    }

    public int size() {
        return list.size();
    }

    @Override
    public String toString() {
        if (list.isEmpty()) return null;
        return "" + list;
    }
}
