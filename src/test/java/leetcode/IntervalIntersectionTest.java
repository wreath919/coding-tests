package leetcode;

import leetcode.IntervalIntersection;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class IntervalIntersectionTest {

    IntervalIntersection intervalIntersection;

    @BeforeAll
    void setup(){
        intervalIntersection = new IntervalIntersection();
    }

    @Test
    void should_find_six_intervals(){
        int[][] firstList = {{0, 2}, {5, 10}, {13, 23}, {24, 25}};
        int[][] secondList = {{1, 5}, {8, 12}, {15, 24}, {25, 26}};
        int[][] expected = {{1, 2}, {5, 5}, {8, 10}, {15, 23}, {24, 24}, {25, 25}};
        int[][] actual = intervalIntersection.findIntersection(firstList, secondList);
        for(int i = 0; i < expected.length; i++){
            assertArrayEquals(expected[i], actual[i]);
        }
    }

    @Test
    void should_find_zero_intervals(){
        int[][] firstList = {{1, 3}, {5, 9}};
        int[][] secondList = {};
        int[][] expected = {};
        int[][] actual = intervalIntersection.findIntersection(firstList, secondList);
        assertArrayEquals(expected, actual);
    }
}