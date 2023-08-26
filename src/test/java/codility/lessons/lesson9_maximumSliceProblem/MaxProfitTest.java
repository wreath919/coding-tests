package codility.lessons.lesson9_maximumSliceProblem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MaxProfitTest {
    MaxProfit maxProfit;

    @BeforeAll
    void setup(){
        maxProfit = new MaxProfit();
    }

    @Test
    void findMaxProfit_example_returns356(){
        int[] A = {23171, 21011, 21123, 21366, 21013, 21367};
        int expected = 356;
        int actual = maxProfit.findMaxProfit(A);
        assertEquals(expected, actual);
    }
    @Test
    void findMaxProfit_example_returns320(){
        int[] A = {100, 300, 10, 30, 330};
        int expected = 320;
        int actual = maxProfit.findMaxProfit(A);
        assertEquals(expected, actual);
    }
    @Test
    void findMaxProfit_example_returns400(){
        int[] A = {200, 300, 50, 150, 450};
        int expected = 400;
        int actual = maxProfit.findMaxProfit(A);
        assertEquals(expected, actual);
    }
    @Test
    void findMaxProfit_emptyArray_returnsZero(){
        int[] A = {};
        int expected = 0;
        int actual = maxProfit.findMaxProfit(A);
        assertEquals(expected, actual);
    }
    @Test
    void findMaxProfit_oneElementArray_returnsZero(){
        int[] A = {300};
        int expected = 0;
        int actual = maxProfit.findMaxProfit(A);
        assertEquals(expected, actual);
    }
}