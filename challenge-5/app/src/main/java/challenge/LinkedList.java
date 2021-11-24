package challenge;

public class LinkedList<T> {
    Node<T> head;

    public LinkedList(){
        this.head = null;
    }

    public void insert(T val){
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


    int addFirst(T value) {
        Node current = head;
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

        return 0;
    }

    int addLast(T value){
        Node current = head;
        Node newNode = new Node(value);
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;

        return 0;
    }


    int addBefore(T before , T value) {
        Node current = head;
        Node newNode = new Node(value);
        if (head.val.equals(before)) {
            newNode.next = head;
            head = newNode;
        } else {
            while (current.next != null) {
                if (current.next.val.equals(before)) {
                    newNode.next = current.next;
                    current.next = newNode;
                    break;

                }
                current = current.next;
            }


        }
        return 0;
    }

    int addAfter(T after, T value){
        Node current = head;
        Node newNode = new Node(value);
        while(current != null){
            if(current.val.equals(value)){
                newNode.next = current.next;
                current.next = newNode;

            }
            current = current.next;
        }

        return 0;
    }


    Node khFunctoon(int value){
        Node current = head;
        int length =0;
        if(head == null){
            System.out.println("empty list");
        }
        while(current != null) {
            current = current.next;
            length++;
        }
            if (value > length || value < 0) {
                System.out.println("enter correct num");
            } else {
                current = head;
                for(int i = 0; i< length - value;i++){
                    current = current.next;

                }
            }

        return (Node) current.val;
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


