/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package insertion.sort;

import java.util.Arrays;

public class App {

    public static int[] sort(int[] arr){
        for (int i =1; i< arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while (j >= 0 && current < arr[j]){
                arr[j+1]= arr[j];
                j = j-1;
            }
            arr[j+1] = current;
        }
        return arr;
    }
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        int[] arr = {3,2,9,5,4,1};
        System.out.println(Arrays.toString(sort(arr)));
    }


}
