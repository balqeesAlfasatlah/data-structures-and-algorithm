package stack.queue;

public class Dog extends Animal{
    public Dog(String pref) {
        super(pref);
    }

    @Override
    public String toString() {
        return "Dog : " + getPref();
    }
}
