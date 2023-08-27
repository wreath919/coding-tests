package codility.lessons.lesson9_maximumSliceProblem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MaxSliceSumTest {
    MaxSliceSum maxSliceSum;

    @BeforeAll
    void setup(){
        maxSliceSum = new MaxSliceSum();
    }
    @Test
    void findMaxSumOfSlice_example_returnFive(){
        int[] A = {3, 2, -6, 4, 0};
        int expected = 5;
        int actual = maxSliceSum.findMaxSumOfSlice(A);
        assertEquals(expected, actual);
    }
    @Test
    void findMaxSumOfSlice_oneElement_returnThree(){
        int[] A = {3};
        int expected = 3;
        int actual = maxSliceSum.findMaxSumOfSlice(A);
        assertEquals(expected, actual);
    }
    @Test
    void findMaxSumOfSlice_oneNegativeElement_returnMinusTen(){
        int[] A = {-10};
        int expected = -10;
        int actual = maxSliceSum.findMaxSumOfSlice(A);
        assertEquals(expected, actual);
    }
    @Test
    void findMaxSumOfSlice_bigValues_returnThree(){
        int[] A = {2147483645, 2, -3};
        int expected = 2147483647;
        int actual = maxSliceSum.findMaxSumOfSlice(A);
        assertEquals(expected, actual);
    }
}