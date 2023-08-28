package codility.lessons.lesson9_maximumSliceProblem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MaxDoubleSumTest {
    MaxDoubleSum maxDoubleSum;

    @BeforeAll
    void setup(){
        maxDoubleSum = new MaxDoubleSum();
    }
    @Test
    void findSumOfDoubleSlices_example_returns17(){
        int[] A = {3, 2, 6, -1, 4, 5, -1, 2};
        int expected = 17;
        int actual = maxDoubleSum.findSumOfDoubleSlices(A);
        assertEquals(expected, actual);
    }
    @Test
    void findSumOfDoubleSlices_allNegativeElements_returnsZero(){
        int[] A = {-3, -2, -6, -1, -4, -5, -1, -2};
        int expected = 0;
        int actual = maxDoubleSum.findSumOfDoubleSlices(A);
        assertEquals(expected, actual);
    }
    @Test
    void findSumOfDoubleSlices_threeElements_returnsZero(){
        int[] A = {-1, 4, 5};
        int expected = 0;
        int actual = maxDoubleSum.findSumOfDoubleSlices(A);
        assertEquals(expected, actual);
    }

}