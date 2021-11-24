package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class HashTable<K,V> {

    private ArrayList<HashNode<K, V>> arr;
    private int num;
    private int size;

    public HashTable() {
        arr = new ArrayList<>();
        num = 10;
        size = 0;

        for (int index = 0; index < num; index++) {
            arr.add(null);
        }
    }


    private int hashCode(K key) {
        return Objects.hashCode(key);
    }


    private int getIndex(K key){
        int hashCode = hashCode(key);
        int index = hashCode % num;
        index = index < 0 ? index * -1 : index;
        return index;
    }

    public  int getSize(){
        return size;
    }
    public  boolean isEmpty(){
        return  getSize() == 0;
    }

    public  void add(K key , V value){
        int bucketIndex = getIndex(key);
        int hashCode = hashCode(key);
        HashNode<K,V> head = arr.get(bucketIndex);

        while (head != null){
            if(head.key.equals(key) && head.hashCode == hashCode){
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = arr.get(bucketIndex);
        HashNode<K,V> node = new HashNode<>(key,value,hashCode);
        node.next = head;
        arr.set(bucketIndex,node);

        if ((1.0 * size / num >= 0.7)) {

            ArrayList<HashNode<K,V>> temp = arr;
            arr = new ArrayList<>();
            num = 2 * num;
            size = 0;

            for (int i = 0; i < num; i++){
                arr.add(null);
            }
            for (HashNode<K,V> hashNode : temp){
                while (head != null){
                    add(hashNode.key,head.value);
                    head = head.next;
                }
            }
        }
    }

    public V remove(K key){
        int bucketIndex = getIndex(key);
        int hashCode = hashCode(key);
        HashNode<K,V> head = arr.get(bucketIndex);
        HashNode<K,V> prev = null;
        while (head != null){
            if(head.key.equals(key) && hashCode == head.hashCode)
                break;
            prev = head;
            head = head.next;
        }
        if(head == null)
            return null;
            size --;

        if(prev != null)
            prev.next = head.next;
        else
            arr.set(bucketIndex,head.next);
        return  head.value;
    }

    public V get(K key){
        int bucketIndex = getIndex(key);
        int hashCode = hashCode(key);
        HashNode<K,V> head = arr.get(bucketIndex);

        while (head != null){
            if(head.key.equals(key) && head.hashCode == hashCode){
                return head.value;
            }
            head = head.next;
        }
        return null;
    }
    public boolean contains(K key){
        int bucketIndex = getIndex(key);
        int hashCode = hashCode(key);
        HashNode<K,V> head = arr.get(bucketIndex);

        while (head != null){
            if(head.key.equals(key) && head.hashCode == hashCode){
                return true;
            }
            head = head.next;
        }
        return false;


    }


    public static List<String> leftJoin(HashMap<String, String> hOne, HashMap<String, String> hTwo) {

        if (hOne.keySet().isEmpty()) {
            return null;
        }

        List<String> myList = new ArrayList<>();
        for (String key : hOne.keySet()) {

            myList.add("[ " + key + ", " + hOne.get(key) + ", " + hTwo.get(key) + " ]");
        }

        return myList;
    }
}
