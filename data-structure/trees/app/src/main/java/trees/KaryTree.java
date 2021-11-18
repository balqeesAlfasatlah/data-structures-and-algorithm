package trees;

import java.util.LinkedList;
import java.util.Queue;

public class KaryTree <T> {

    KNode<T> root = null;
    int node = 0;
    int k = 0;

    public KaryTree(int k) {
        if (k <= 1)
            k = 2;
        this.k = k;
    }

    public void insert(T value) {
        KNode<T> newNode = new KNode<T>(value);
        node++;
        if (isEmpty()) {
            root = newNode;
            return;
        }
        Queue<KNode<T>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {

            KNode<T> current = queue.remove();
            if (current.child.size() < k) {
                current.addChild(newNode);
                return;
            } else {
                queue.addAll(current.child);
            }
        }
    }

    public KaryTree<String> fizzBuzzTree(KaryTree<Integer> karyTree) {
        KaryTree<String> newTree = new KaryTree<>(karyTree.k);

        Queue<KNode<Integer>> queue = new LinkedList<>();
        if (!karyTree.isEmpty()) {
            queue.add(karyTree.root);

            while (!queue.isEmpty()) {

                KNode<Integer> current = queue.remove();

                String value;
                if (current.value % 3 == 0 && current.value % 5 == 0)
                    value = "FizzBuzz";
                else if ((int) current.value % 3 == 0)
                    value = "Fizz";
                else if ((int) current.value % 5 == 0)
                    value = "Buzz";
                else
                    value = current.value.toString();

                newTree.insert(value);

                if (!current.child.isEmpty())
                    queue.addAll(current.child);
            }
        }
        return newTree;
    }

    public boolean isEmpty() {

        return root == null;
    }

    @Override
    public String toString() {
        return '[' + "" + root + ']';
    }
}