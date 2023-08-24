package codility.lessons.lesson6_sorting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MaxProductOfThreeTest {
    MaxProductOfThree maxProductOfThree;
    @BeforeAll
    void setup(){
        maxProductOfThree = new MaxProductOfThree();
    }

    @Test
    void findMaxProductOfThree_topThree_returns60(){
        int[] A = {-3, 1, 2, -2, 5, 6};
        int expected = 60;
        int actual = maxProductOfThree.findMaxProductOfThree(A);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxProductOfThree_bottomTwoAndTop_returnsZero(){
        int[] A = {-1000, -100, -1, 0};
        int expected = 0;
        int actual = maxProductOfThree.findMaxProductOfThree(A);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxProductOfThree_bottomTwoAndTop_returns300000(){
        int[] A = {-1000, -100, -1, 1, 2, 3};
        int expected = 300000;
        int actual = maxProductOfThree.findMaxProductOfThree(A);
        assertEquals(expected, actual);
    }
}