package linked.list.insertions;

public class LinkedList<T> {
    Node<T> head;

   public LinkedList()
   {
        this.head = null;
   }

   public void insert(T val)
   {
        Node node = new Node(val);
        node.next = head;
        head = node;
   }

   boolean includes(T value)
   {
        Node cur = head;
        while (cur.next != null){
          if(cur.val.equals(value)){
            return true;
        }
        cur = cur.next;
        }
        return false;

   }
     public void append(T value){

       Node node = new Node(value);
       Node cur = head;
       if(cur == null){
           head= node;
           return;
       }
           while (cur.next != null){
               cur = cur.next;
           }
          cur.next = node;
       }



     public void insertBefore(T value , T valBefore){
       Node node = new Node(valBefore);
       if(head == null){
           head = node;
       }else if(head.val.equals(value)){
           node.next = head;
           head = node;
         }else {
           Node temp = head;
           Node curNode = head.next;
           while (!curNode.val.equals(value)){
               temp = temp.next;
               curNode = curNode.next;
           }
           node.next = temp.next;
           temp.next = node;
         }
     }



     public void insertAfter(T value ,T valAfter){
       Node cur = head;
       Node newNode = new Node(valAfter);

       if(cur == null){
           head = newNode;
           return;

       }while (cur != null){
          if(cur.val.equals(value)){
              newNode.next = cur.next;
              cur.next = newNode;
          }
          cur =cur.next;
       }
     }



     @Override
      public String toString()
     {
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

