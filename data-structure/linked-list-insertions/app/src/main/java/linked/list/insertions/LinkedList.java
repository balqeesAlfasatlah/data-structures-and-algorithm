package linked.list.insertions;

public class LinkedList<T> {
    Node<T> head;
    private int size;

    public int getSize() {
        return size;
    }

    public LinkedList() {
        this.head = null;
    }

    public void insert(T val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    boolean includes(T value) {
        Node cur = head;
        while (cur.next != null) {
            if (cur.val.equals(value)) {
                return true;
            }
            cur = cur.next;
        }
        return false;

    }

    public void append(T value) {

        Node node = new Node(value);
        Node cur = head;
        if (cur == null) {
            head = node;
            return;
        }
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }


    public void insertBefore(T value, T valBefore) {
        Node node = new Node(valBefore);
        if (head == null) {
            head = node;
        } else if (head.val.equals(value)) {
            node.next = head;
            head = node;
        } else {
            Node temp = head;
            Node curNode = head.next;
            while (!curNode.val.equals(value)) {
                temp = temp.next;
                curNode = curNode.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }


    public void insertAfter(T value, T valAfter) {
        Node cur = head;
        Node newNode = new Node(valAfter);

        if (cur == null) {
            head = newNode;
            return;

        }
        while (cur != null) {
            if (cur.val.equals(value)) {
                newNode.next = cur.next;
                cur.next = newNode;
            }
            cur = cur.next;
        }
    }


    @Override
    public String toString() {
        Node cur = head;
        String result = "";
        while (cur != null) {
            result += "{ " + cur.val + " } -> ";
            cur = cur.next;
        }
        result += "NULL";
        return result;
    }


    public String linkedListKth(int k) {
        if (head == null)
            return "empty list";
        Node cur = head;
        int counter = 0;
        while (cur.next != null) {
            cur = cur.next;
            counter++;
        }
        if (k > counter || k < 0) {
            return "enter correct number";
        } else {
            cur = head;
            for (int i = 0; i <= counter - k; i++) {
                if (i == counter - k) {
                    return "tha index from the end is : " + cur.val;
                }
                cur = cur.next;
            }

        }
        return "error";
    }


    public LinkedList zip(LinkedList list1, LinkedList list2) {
        LinkedList linkedList = new LinkedList();
        Node cur1 = list1.head;
        Node cur2 = list2.head;

        while (cur1 != null || cur2 != null) {
            if (cur1 != null && cur2 != null) {
                linkedList.append(cur1.getVal());
                linkedList.append(cur2.getVal());

                cur1 = cur1.next;
                cur2 = cur2.next;
            } else if (cur1 == null) {
                linkedList.append(cur2.getVal());
                cur2 = cur2.next;
            } else if (cur2 == null) {
                linkedList.append(cur1.getVal());
                cur1 = cur1.next;
            }
        }
            return linkedList;
        }

    }







