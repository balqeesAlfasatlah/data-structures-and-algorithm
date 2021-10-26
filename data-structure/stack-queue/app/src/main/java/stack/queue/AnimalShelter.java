package stack.queue;

public class AnimalShelter {

    Queue cat = new Queue();
    Queue dog = new Queue();

    public void enqueue(Animal animal){
        if(animal instanceof Cat){
            cat.enqueue(animal.getPref());
        }else if(animal instanceof Dog){
            dog.enqueue(animal.getPref());
    }
}

    public String dequeue(String pref) {
        if (pref.equals("cat")) {
            return cat.dequeue();
        } else if (pref.equals("dog")) {
            return dog.dequeue();
        }else {
            return null;
        }
    }

    @Override
    public String toString() {
        return  "AnimalShelter{" +
                "cat=" + cat +
                ", dog=" + dog +
                '}';
    }
}
