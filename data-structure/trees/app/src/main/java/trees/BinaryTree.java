package trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree <T>{

    public List<T> preOrderList = new ArrayList<>();
    public List<T> inOrderList = new ArrayList<>();
    public List<T> postOrderList = new ArrayList<>();
    public Node<Integer> root;




    public List<T> preOrder(Node<T> root) {
        preOrderList.add(root.value);
        if (root.left != null) {
            preOrder(root.left);
        }if (root.right != null) {
            preOrder(root.right);
        }
        return preOrderList;
    }

    public List<T> inOrder(Node<T> root) {
        if (root.left != null) {
            inOrder(root.left);
            inOrderList.add(root.value);
        }if (root.right != null) {
            inOrder(root.right);
        }
        return inOrderList;
    }

    public List<T> postOrder(Node<T> root){
        if (root.left != null) {
            postOrder(root.left);
        }if (root.right != null) {
          postOrder(root.right);
          postOrderList.add(root.value);
        }
        return postOrderList;
    }

    public int maxValue(){
        if(root == null){
            return 0;
        }else if(root.left == null || root.right == null){
            return  root.value;
        }
        int max =0;
        List<Integer> list = (List<Integer>) postOrder((Node<T>) root);
        for (int i=0; i<list.size(); i++){
            if(list.get(i) >= max){
                max = list.get(i);
            }
        }
        return max;
    }


    public List<Integer> breadthFirst(BinaryTree binaryTree) {
        List<Integer> list = new ArrayList<>();
        List<Node> tempList = new ArrayList<>();

        tempList.add(binaryTree.root);

        while (!tempList.isEmpty()){
            list.add((Integer) tempList.get(0).value);
            if(tempList.get(0).left != null){
                tempList.add(tempList.get(0).left);
            }
            if(tempList.get(0).right != null){
                tempList.add(tempList.get(0).right);
            }
            tempList.remove(0);
        }
        return list;
    }

    @Override
    public String toString() {
        if(preOrderList.isEmpty() && inOrderList.isEmpty() && postOrderList.isEmpty()){
            return "the list empty";
        }
        return "BinaryTree{" +

                "preOrderList=" + preOrderList +
                ", inOrderList=" + inOrderList +
                ", postOrderList=" + postOrderList +
                '}';
    }
}







