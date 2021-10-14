package challenge;

public class LinkedList<T> {
    Node<T> head;

    public LinkedList(){
        this.head = null;
    }

    public void inset(T val){
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    boolean includes(T value){
        Node cur = head;
        while (cur.next != null){
            if(cur.val.equals(value)){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    @Override
    public String toString(){
        Node cur = head;
        String result = "";
        while (cur != null){
            result += "{ " + cur.val + " } -> ";
            cur = cur.next;
        }
        result += "NULL";
        return  result;
    }
}


