package codility.lessons.lesson5_prefixSums;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MinAvgTwoSliceTest {
    MinAvgTwoSlice minAvgTwoSlice;
    @BeforeAll
    void setup(){
        minAvgTwoSlice = new MinAvgTwoSlice();
    }

    @Test
    void should_return_one(){
        int[] A = {4, 2, 2, 5, 1, 5, 8};
        int expected = 1;
        int actual = minAvgTwoSlice.solution(A);
        assertEquals(expected, actual);
    }

    @Test
    void should_return_two(){
        int[] A = {5, 4, 3, 2};
        int expected = 2;
        int actual = minAvgTwoSlice.solution(A);
        assertEquals(expected, actual);
    }

    @Test
    void should_return_zero(){
        int[] A = {2, 3, 4};
        int expected = 0;
        int actual = minAvgTwoSlice.solution(A);
        assertEquals(expected, actual);
    }
}
