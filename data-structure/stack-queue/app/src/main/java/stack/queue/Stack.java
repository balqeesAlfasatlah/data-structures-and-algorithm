package stack.queue;

public class Stack <I extends Number> {
    private Node top;

    public void push(String value) {
        if (isEmpty()) {
            top = new Node(value);
        } else {
            Node node = new Node(value);
            node.setNext(top);
            top = node;
        }
    }

    public String pop(){
        if(isEmpty()){
            return "empty stack";
        }else {
            String value = top.getValue();
            top = top.getNext();
            return value;
        }
    }

    public String peek(){
        if(isEmpty()){
            return "empty stack";
        }else {
            return top.getValue();

        }
    }

    public boolean isEmpty(){
        if(top == null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public  String toString(){
        String result ="top is : ";
        if(top == null){
            return "null";
        }
        Node cur = top;
        while (cur != null){
            result += cur.value + " : ";
            cur = cur.next;
        }
        return result;

    }



}
