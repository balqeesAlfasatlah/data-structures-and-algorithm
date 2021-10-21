/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list.insertions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test void linkedlistinsert(){
        LinkedList linkedList = new LinkedList();
        assertEquals(null,linkedList.head ,"test the initial value of the head in the linked list without insert value");

        linkedList.insert(4);
        assertEquals(4,linkedList.head.val ,"test the initial value of the head in the linked list after insert value");

    }

    @Test void linkedlistincludes() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.insert(1);
        linkedList.insert(4);
        linkedList.insert(10);
        linkedList.insert(3);
        linkedList.insert(2);
        linkedList.insert(11);
        linkedList.insert(21);

        assertTrue(linkedList.includes(11));
        assertFalse(linkedList.includes(5));

    }

    @Test void linkedlistoString(){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.insert(1);
        linkedList.insert(4);
        linkedList.insert(10);
        linkedList.insert(3);
        linkedList.insert(2);
        linkedList.insert(11);
        linkedList.insert(21);


        assertEquals(21,linkedList.head.val);
        assertEquals("{ 21 } -> { 11 } -> { 2 } -> { 3 } -> { 10 } -> { 4 } -> { 1 } -> NULL",linkedList.toString());


    }

    @Test void linkedlistAddToTheEnd() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.insert(1);
        linkedList.insert(4);
        linkedList.insert(10);
        linkedList.append(7);
        assertEquals("{ 10 } -> { 4 } -> { 1 } -> { 7 } -> NULL", linkedList.toString());

    }

    @Test void linkedlistAddBefore() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.insert(1);
        linkedList.insert(4);
        linkedList.insert(10);
        linkedList.insertBefore(4,5);
        assertEquals("{ 10 } -> { 5 } -> { 4 } -> { 1 } -> NULL", linkedList.toString());

    }

    @Test void linkedlistAddAfter() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.insert(8);
        linkedList.insert(1);
        linkedList.insert(4);
        linkedList.insert(10);
        linkedList.insertAfter(1,9);
        assertEquals("{ 10 } -> { 4 } -> { 1 } -> { 9 } -> { 8 } -> NULL", linkedList.toString());

   }


    @Test void linkedlistKh() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.append(1);
        linkedList.append(6);
        linkedList.append(3);
        linkedList.append(10);
        linkedList.append(5);
        assertEquals("tha index from the end is : 10",linkedList.linkedListKth(1));

    }

    @Test void KthLength() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.append(1);
        linkedList.append(6);
        linkedList.append(3);
        linkedList.append(10);
        linkedList.append(5);
        assertEquals("enter correct number",linkedList.linkedListKth(6));
    }
        @Test void KthNotPositive() {
            LinkedList<Integer> linkedList = new LinkedList<Integer>();
            linkedList.append(1);
            linkedList.append(6);
            linkedList.append(3);
            linkedList.append(10);
            linkedList.append(5);
            assertEquals("enter correct number",linkedList.linkedListKth(-4));
         }

       @Test void KthOneNode() {
            LinkedList<Integer> linkedList = new LinkedList<Integer>();
            linkedList.append(1);
            assertEquals("enter correct number",linkedList.linkedListKth(3));
        }

        @Test void HappyBath() {
            LinkedList<Integer> linkedList = new LinkedList<Integer>();
            linkedList.append(1);
            linkedList.append(6);
            linkedList.append(3);
            linkedList.append(10);
            linkedList.append(5);
            assertEquals("tha index from the end is : 3",linkedList.linkedListKth(2));
        }

    @Test void zipDifferentSize() {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.append(1);
        linkedList1.append(6);
        linkedList1.append(3);
        LinkedList linkedList2 = new LinkedList();
        linkedList2.append(10);


        LinkedList list = new LinkedList();
        list = linkedList1.zip(linkedList1,linkedList2);
        assertEquals("{ 1 } -> { 10 } -> { 6 } -> { 3 } -> NULL",list.toString());
    }

    @Test void zipEmptyList() {
        LinkedList linkedList1 = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        linkedList2.append(4);
        linkedList2.append(10);
        linkedList2.append(5);

        LinkedList list = new LinkedList();
        list = linkedList1.zip(linkedList1,linkedList2);
        assertEquals("{ 4 } -> { 10 } -> { 5 } -> NULL",list.toString());
    }

    @Test void zipHappyPath() {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.append(1);
        linkedList1.append(6);
        linkedList1.append(3);
        LinkedList linkedList2 = new LinkedList();
        linkedList2.append(4);
        linkedList2.append(10);
        linkedList2.append(5);

        LinkedList list = new LinkedList();
        list = linkedList1.zip(linkedList1,linkedList2);
        assertEquals("{ 1 } -> { 4 } -> { 6 } -> { 10 } -> { 3 } -> { 5 } -> NULL",list.toString());
    }


    }
