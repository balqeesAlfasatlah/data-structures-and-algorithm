/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashtable;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test public void leftJoinEmptyHashMap(){

        HashMap hOne = new HashMap();
        HashMap hTwo = new HashMap();

        assertNull(HashTable.leftJoin(hOne, hTwo));
    }



    @Test public void leftJoinAllJoins(){

        HashMap hOne = new HashMap();
        hOne.put("fond", "enamored");
        hOne.put("wrath", "anger");
        hOne.put("flow", "jam");
        HashMap hTwo = new HashMap();
        hTwo.put("fond", "averse");
        hTwo.put("wrath", "delight");
        hTwo.put("flow", "test");

        assertEquals("[[ wrath, anger, delight ], [ flow, jam, test ], [ fond, enamored, averse ]]", HashTable.leftJoin(hOne, hTwo).toString());
    }

    @Test public void leftJoinSomeJoins(){

        HashMap hOne = new HashMap();
        hOne.put("fond", "enamored");
        hOne.put("wrath", "anger");
        hOne.put("diligent", "employed");
        hOne.put("outfit", "garb");
        hOne.put("guide", "usher");
        HashMap hTwo = new HashMap();
        hTwo.put("fond", "averse");
        hTwo.put("wrath", "delight");
        hTwo.put("flow", "jam");


        assertEquals("[[ diligent, employed, null ], [ outfit, garb, null ], [ wrath, anger, delight ], [ guide, usher, null ], [ fond, enamored, averse ]]", HashTable.leftJoin(hOne, hTwo).toString());
    }
}
