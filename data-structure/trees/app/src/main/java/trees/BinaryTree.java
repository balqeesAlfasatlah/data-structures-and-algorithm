package trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree <T>{

    public List<T> preOrderList = new ArrayList<>();
    public List<T> inOrderList = new ArrayList<>();
    public List<T> postOrderList = new ArrayList<>();

    public List<T> preOrder(Node<T> root) {
        preOrderList.add(root.value);
        if (root.left != null) {
            preOrder(root.left);
        } else if (root.right != null) {
            preOrder(root.right);
        }
        return preOrderList;
    }

    public List<T> inOrder(Node<T> root) {
        if (root.left != null) {
            inOrder(root.left);
            inOrderList.add(root.value);
        } else if (root.right != null) {
            inOrder(root.right);
        }
        return inOrderList;
    }

    public List<T> postOrder(Node<T> root){
        if (root.left != null) {
            postOrder(root.left);
        } else if (root.right != null) {
          postOrderList.add(root.value);
        }
        return postOrderList;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +

                "preOrderList=" + preOrderList +
                ", inOrderList=" + inOrderList +
                ", postOrderList=" + postOrderList +
                '}';
    }
}







