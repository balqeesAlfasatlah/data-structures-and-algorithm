# Stacks and Queues :

+ **Stack** : inear data structure that is used to store the collection of objects. It is based on Last-In-First-Out (LIFO)
  

+ most important operations that are :

    1- push

    2- pop

    3- peek
  


+ **Queue** : is a linear data structure or a collection in Java that stores elements in a FIFO (First In, First Out) order.

 + most important operations that are :

    1- enqueue 

    2- dequeue 

    3- peek

## Challenge

the challenge is about to Create a stack class and queue class also and each class should contain the methods that i listed above .

## Approach & Efficiency

+ space : O(1)
+ time : O(1);

## API

+ Stack methods :

1- push : add an item to the top of the stack , O(1).

2- pop : remove an item from the top of the stack , O(1).

3- peek : return the top item from the stack , O(1).

4- isEmpty : return true if the stack is empty and false if its not .


+ Queue methods :

1- enqueue : add an item to the queue in the last , O(1).

2- dequeue : remove an item from the queue from the begining which is the oldest one , O(1).

3- peek : return the front item from the queue , O(1).

4- isEmpty : return true if the queue is empty and false if its not .



### tests to prove the following functionality :

- [x] Can successfully push onto a stack
- [x] Can successfully push multiple values onto a stack
- [x] Can successfully pop off the stack
- [x] Can successfully empty a stack after multiple pops
- [x] Can successfully peek the next item on the stack
- [x] Can successfully instantiate an empty stack
- [x] Calling pop or peek on empty stack raises exception
- [x] Can successfully enqueue into a queue
- [x] Can successfully enqueue multiple values into a queue
- [x] Can successfully dequeue out of a queue the expected value
- [x] Can successfully peek into a queue, seeing the expected value
- [x] Can successfully empty a queue after multiple dequeues
- [x] Can successfully instantiate an empty queue
- [x] Calling dequeue or peek on empty queue raises exception


# Challenge stack-queue-pseudo

Create a new class called pseudo queue has two stacks and enqueue , dequeue methods

## Whiteboard Process


[![chal11.png](https://i.postimg.cc/J4gSSRW1/chal11.png)](https://postimg.cc/qzsm3VRY)

## Approach & Efficiency

+ enqueue : Inserts value into the PseudoQueue, using a first-in, first-out approach.

+ dequeue : Extracts a value from the PseudoQueue, using a first-in, first-out approach


## Testing :

[x] If its empty

[x] enqueue and dequeue methods