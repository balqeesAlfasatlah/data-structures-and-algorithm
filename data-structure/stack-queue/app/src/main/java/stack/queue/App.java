/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.queue;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        //--------------------queue---------------------//

        Queue queue = new Queue();
        queue.enqueue("b");
        queue.enqueue("a");
        queue.enqueue("l");
        queue.enqueue("q");
        queue.enqueue("e");
        queue.enqueue("e");
        queue.enqueue("s");

        System.out.println(queue);
        System.out.println(" remove " + queue.dequeue());
        System.out.println("the front is : " + queue.peek());
        System.out.println("is it empty ? " + queue.isEmpty());
        System.out.println("the new queue values : " + queue);

        //--------------------stack---------------------//

        Stack<Number> stack = new Stack<Number>();

        stack.push("2");
        stack.push("7");
        stack.push("4");
        stack.push("8");
        stack.push("1");

        System.out.println("the stack values : " + stack);
        System.out.println(" remove " + stack.pop());
        System.out.println("the top is : " + stack.peek());
        System.out.println("is it empty ? " + stack.isEmpty());
        System.out.println("the new stack values : " + stack);

        PseudoQueue pseudoQueue = new PseudoQueue();
        pseudoQueue.enqueue("B");
        pseudoQueue.enqueue("A");
        pseudoQueue.enqueue("L");
        pseudoQueue.enqueue("Q");
        pseudoQueue.enqueue("E");
        pseudoQueue.enqueue("S");
        pseudoQueue.dequeue();
        pseudoQueue.dequeue();
        System.out.println(pseudoQueue.stackTwo.toString());

        AnimalShelter animalShelter = new AnimalShelter();
        Animal cat1 = new Cat("Ketty");
        Animal cat2 = new Cat("Bella");
        Animal cat3 = new Cat("Luna");
        Animal dog1 = new Dog("Milo");
        Animal dog2 = new Dog("Oscar");
        Animal dog3 = new Dog("Toby");

        animalShelter.enqueue(cat1);
        animalShelter.enqueue(dog2);
        animalShelter.enqueue(dog3);
        animalShelter.enqueue(dog1);
        animalShelter.enqueue(cat3);
        animalShelter.enqueue(cat2);

        System.out.println(animalShelter);

        animalShelter.dequeue("cat");
        System.out.println(animalShelter);


        animalShelter.dequeue("dog");
        System.out.println(animalShelter);


        StackQueueBrackets stackQueueBrackets = new StackQueueBrackets();
        System.out.println(stackQueueBrackets.validateBrackets("()")); //T
        System.out.println(stackQueueBrackets.validateBrackets("({}])")); //F
        System.out.println(stackQueueBrackets.validateBrackets("[()]")); //T
        System.out.println(stackQueueBrackets.validateBrackets("{}[()]")); //T
        System.out.println(stackQueueBrackets.validateBrackets("{")); //F






    }

}
