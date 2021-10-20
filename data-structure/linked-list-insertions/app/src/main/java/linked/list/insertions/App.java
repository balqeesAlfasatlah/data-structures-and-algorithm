/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list.insertions;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.insert(1);
        linkedList.insert(4);
        linkedList.insert(10);
        linkedList.insert(3);
        linkedList.insert(2);
        linkedList.insert(11);
        linkedList.insert(21);

       linkedList.append(7);
       linkedList.insertBefore(2,5);
       linkedList.insertAfter(4,9);


        System.out.println( linkedList.toString());
        System.out.println( linkedList.includes(10));
        System.out.println( linkedList.includes(6));
       // System.out.println( linkedList.linkedListKth(7));

        LinkedList list1 = new LinkedList();
        list1.append(1);
        list1.append(2);
        list1.append(3);

        LinkedList list2 = new LinkedList();
        list1.append(5);
        list1.append(9);
        list1.append(4);

        LinkedList linkedList2 = new LinkedList();
        linkedList2 = linkedList2.zip(list1,list2);
        System.out.println(linkedList2);





    }
}
