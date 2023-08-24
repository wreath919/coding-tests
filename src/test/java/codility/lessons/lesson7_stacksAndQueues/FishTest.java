package codility.lessons.lesson7_stacksAndQueues;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import static org.junit.jupiter.api.Assertions.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FishTest {
    Fish fish;

    @BeforeAll
    void setup(){
        fish = new Fish();
    }

    @Test
    void findNumOfSurvivedFish_example_returnsTwo(){
        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 0, 0};
        int expected = 2;
        int actual = fish.findNumOfSurvivedFish(A, B);
        assertEquals(expected, actual);
    }

    @Test
    void findNumOfSurvivedFish_singleElement_returnsOne(){
        int[] A = {4};
        int[] B = {0};
        int expected = 1;
        int actual = fish.findNumOfSurvivedFish(A, B);
        assertEquals(expected, actual);
    }
    @Test
    void findNumOfSurvivedFish_alternateDirection_returnsThree(){
        int[] A = {2, 6, 3, 1, 5};
        int[] B = {1, 0, 1, 0, 1};
        int expected = 3;
        int actual = fish.findNumOfSurvivedFish(A, B);
        assertEquals(expected, actual);
    }
    @Test
    void findNumOfSurvivedFish_minMaxNumberInA_returnsTwo(){
        int[] A = {2, 0, 3, 1000000000, 5};
        int[] B = {1, 0, 1, 0, 1};
        int expected = 2;
        int actual = fish.findNumOfSurvivedFish(A, B);
        assertEquals(expected, actual);
    }
}