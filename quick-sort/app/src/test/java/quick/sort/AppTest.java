/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quick.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test void  quickSortEmpty(){
        int[] arr = {};
        int n = arr.length;
        assertEquals(arr, App.quickSort(arr, 0, n - 1));
    }

    @Test void  quickSort(){
        int[] arr = {3,8,1,9,5};
        int n = arr.length;
        assertEquals("[1, 3, 5, 8, 9]", Arrays.toString(App.quickSort(arr, 0, n - 1)));
    }
//
    @Test void  reverseSorted(){
        int[] arr = {20,18,12,8,5,-2};
        int n = arr.length;
        assertEquals("[-2, 5, 8, 12, 18, 20]", Arrays.toString(App.quickSort(arr, 0, n - 1)));
    }

    @Test void  fewUniques(){
        int[] arr = {5,12,7,5,5,7};
        int n = arr.length;
        assertEquals("[5, 5, 5, 7, 7, 12]", Arrays.toString(App.quickSort(arr, 0, n - 1)));
    }
    @Test void  nearlySorted(){
        int[] arr = {2,3,5,7,13,11};
        int n = arr.length;
        assertEquals("[2, 3, 5, 7, 11, 13]", Arrays.toString(App.quickSort(arr, 0, n - 1)));
    }

}
