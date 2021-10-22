package stack.queue;

public class Queue {
    Node front;
    Node rear;

    public void enqueue(String value){
        Node node = new Node(value);
        if(front == null){
            front = node;
        }else {
            rear.next = node;
        }
        rear = node;
    }

    public String dequeue(){
        if(isEmpty()){
            return null;
        }else {
            String value = front.getValue();
            front = front.getNext();
            return value;
        }
    }

    public String peek() {
        if (isEmpty()) {
            return null;
        } else {
            return front.getValue();
        }
    }

    public boolean isEmpty(){
        return front == null;
    }

    @Override
    public String toString() {
        if(front == null){
            return "null";
        }
        String result = "Queue : ";
        Node cur = front;
        while (cur != null){
            result += " Node{" +
                    "value : '" + cur.value + '\'' +
                    '}';
            cur = cur.next;
        }
        return result;
    }


}
