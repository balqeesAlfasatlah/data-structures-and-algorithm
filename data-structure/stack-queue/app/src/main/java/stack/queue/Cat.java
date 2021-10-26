package stack.queue;

public class Cat extends Animal{
    public Cat(String pref) {
        super(pref);
    }

    @Override
    public String toString() {
        return "Cat : " + getPref() ;
    }
}
