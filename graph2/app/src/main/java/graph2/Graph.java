package graph2;

import java.util.*;

public class Graph <T>{

    public Map<Node<T> , List<Node<T>>> list= new HashMap<>();
    public Map<String , Integer> list2 = new HashMap<>();


    public Graph() {}

    public Node<T> addNode(T val) {
        Node<T> node = new Node<T>(val);
        list.put(node, new ArrayList<>());
        return node;
    }

    public void addEdge(T val1, T val2 , int weight) {
        Node<T> n1 = new Node<T>(val1);
        if (val1.equals(val2)){
            list.get(n1).add(n1);
            list2.put(val1 + "->" + val1 ,0);

        } else {
            Node<T> n2 = new Node<T>(val2);
            list.get(n1).add(n2);
            list.get(n2).add(n1);
            list2.put(val1 + "->" + val2 ,weight);
            list2.put(val2 + "->" + val1 ,weight);

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


    public List<Node<T>> breadthFirst(T value) {
        Node<T> newNode = new Node(value);

        if (newNode.value == null) return null;

        List<Node<T>> allNodes = new ArrayList<>();
        Queue<T> queue = new Queue<T>();
        Set<Node<T>> visited = new HashSet<>();

        queue.enqueue(newNode);
        visited.add(newNode);

        while (!queue.isEmpty()) {
            Node<T> front = queue.dequeue();
            allNodes.add(front);
            
            for (Node<T> neighbor : getNeighbors(front.value)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.enqueue(neighbor);
                }
            }
        }
        return allNodes;
    }

    public String businessTrip(T value, T [] arr) {
        int cost = 0;
        for (int k = 0; k < arr.length -1; k++) {
            if (getNeighbors(arr[k]).contains(new Node<>(arr[k+1]))) {
                cost += list2.get(arr[k] + "->" + arr[k+1]);
            } else {
                return "false, $0";
            }
        }
        return true + " , $" + cost ;
    }

    @Override
    public String toString() {
        if (list.isEmpty()) return null;
        return "" + list;
    }
}
