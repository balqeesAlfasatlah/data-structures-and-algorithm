/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    //stack

    @Test void stackPush(){
        Stack<Number> stack = new Stack<Number>();
        stack.push("2");

        assertEquals("top is : 2 : " ,stack.toString());
    }

    @Test void stackPushMultiple(){
        Stack stack = new Stack();
        stack.push("2");
        stack.push("7");
        stack.push("4");
        stack.push("8");
        stack.push("1");

        assertEquals("top is : 1 : 8 : 4 : 7 : 2 : " ,stack.toString());
    }


    @Test void stackPop(){
        Stack stack = new Stack();
        stack.push("2");
        stack.push("7");
        stack.push("4");
        stack.push("8");
        stack.push("1");

        assertEquals("1" ,stack.pop());
    }

    @Test void stackEmpty(){
        Stack stack = new Stack();
        stack.push("2");
        stack.push("7");
        stack.push("4");
        stack.pop();
        stack.pop();
        stack.pop();

        assertEquals("null" ,stack.toString());
    }

    @Test void peekNextItem(){
        Stack stack = new Stack();
        stack.push("2");
        stack.push("7");
        stack.push("4");
        stack.push("8");
        stack.push("1");
        stack.pop();

        assertEquals("8" ,stack.peek());
    }

    @Test void instantiateEmptyStack(){
        Stack stack = new Stack();

        assertEquals("null" ,stack.toString());
    }

    @Test void popPeekEmptyStack(){
        Stack stack = new Stack();
        assertEquals("empty stack",stack.pop());
        assertEquals("empty stack",stack.peek());
    }

    // queue

    @Test void enqueue() {
        Queue queue = new Queue();
        queue.enqueue("b");
        assertEquals("Queue :  Node{value : 'b'}",queue.toString());
    }

    @Test void enqueueMultiple() {

        Queue queue = new Queue();
        queue.enqueue("b");
        queue.enqueue("a");
        queue.enqueue("l");
        queue.enqueue("q");
        queue.enqueue("e");
        queue.enqueue("e");
        queue.enqueue("s");
        assertEquals("Queue :  Node{value : 'b'} Node{value : 'a'} Node{value : 'l'} Node{value : 'q'} Node{value : 'e'} Node{value : 'e'} Node{value : 's'}",queue.toString());
    }
    @Test void  dequeueQueue(){
        Queue queue = new Queue();
        queue.enqueue("b");
        queue.enqueue("a");
        queue.enqueue("l");

        assertEquals("b",queue.dequeue());

    }


    @Test void  peekQueue(){
        Queue queue = new Queue();
        queue.enqueue("b");
        queue.enqueue("a");
        queue.enqueue("l");

        assertEquals("b",queue.peek());

    }

    @Test void  emptyQueue(){
        Queue queue = new Queue();
        queue.enqueue("b");
        queue.enqueue("a");
        queue.enqueue("l");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        assertEquals("null",queue.toString());
    }

    @Test void  instantiateEmptyQueue(){
        Queue queue = new Queue();
        assertEquals("null",queue.toString());
    }

    @Test void deqPeekEmptyQueue(){
        Queue queue = new Queue();
        assertNull(queue.dequeue());
       assertEquals(null,queue.peek());
    }


    @Test void PseudoQueueEmpty(){
        PseudoQueue pseudoQueue = new PseudoQueue();
        assertEquals("empty stack",pseudoQueue.dequeue());
    }

    @Test void PseudoQueue(){
        PseudoQueue pseudoQueue = new PseudoQueue();
        pseudoQueue.enqueue("B");
        pseudoQueue.enqueue("A");
        pseudoQueue.enqueue("L");
        pseudoQueue.enqueue("Q");
        assertEquals("B",pseudoQueue.dequeue());
        pseudoQueue.dequeue();
        assertEquals("L",pseudoQueue.dequeue());
    }


}
