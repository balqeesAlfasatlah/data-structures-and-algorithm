/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashtable;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        HashTable<String,Integer> table = new HashTable<>();
        table.add("khaled",1);
        table.add("Aseel",2);
        table.add("Ali",3);
        table.add("Mariam",4);
        table.add("Mohammad",5);

        System.out.println("size : " + table.getSize());
        System.out.println(table.get("Aseel"));
        System.out.println(table.contains("Ali"));
        System.out.println(table.remove("Mohammad"));








    }
}
