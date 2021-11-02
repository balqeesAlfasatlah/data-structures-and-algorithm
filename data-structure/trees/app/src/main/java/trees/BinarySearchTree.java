package trees;

public class BinarySearchTree<T> extends BinaryTree{

    public Node<Integer> root;

    public void insert(Integer value) {
        if (root.value == null) {
            root = new Node<>(value);
        } else {
            Node<Integer> cur = root;
            Node<Integer> newNode = new Node<>(value);
            while (!value.equals(cur.value) && (cur.right != newNode || cur.left != newNode)) {
                if (value < cur.value) {
                    if (cur.left == null) {
                        cur.left = newNode;
                    } else {
                        cur = cur.left;
                    }
                } else {
                    if (cur.right == null) cur.right = newNode;
                    else cur = cur.right;
                }
            }
        }
    }


    public boolean contains(Integer value) {
        if (root == null) {
            return false;
        }
        if (value.equals(root.value)) {
            return true;
        }
        Node<Integer> cur = root;
        while (cur.left != null || cur.right != null) {
            if (value < cur.value && cur.left != null) {
                cur = cur.left;
            } else if (value > cur.value && cur.right != null) {
                cur = cur.right;
            } else {
                return false;
            }
            if (value.equals(cur.value)) {
                return true;
            }

        }
        return false;
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }
}





