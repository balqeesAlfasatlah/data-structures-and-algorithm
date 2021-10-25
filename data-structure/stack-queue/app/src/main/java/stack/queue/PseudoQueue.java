package stack.queue;

public class PseudoQueue {
    Stack stackOne = new Stack();
    Stack stackTwo = new Stack();

    public String enqueue(String value){
     while (!stackTwo.isEmpty()){
         stackOne.push(stackTwo.pop());
     }
     stackTwo.push(value);
        while (!stackOne.isEmpty()){
            stackTwo.push(stackOne.pop());
        }
        return value;
    }

    public String dequeue(){
        if(stackTwo == null){
            System.out.println("its empty");
        }
        String value = stackTwo.peek();
        stackTwo.pop();
        return value;
    }


}
