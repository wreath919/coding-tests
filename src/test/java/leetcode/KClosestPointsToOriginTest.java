package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class KClosestPointsToOriginTest {
    KClosestPointsToOrigin kClosestPointsToOrigin;

    @BeforeAll
    void setup(){
        kClosestPointsToOrigin = new KClosestPointsToOrigin();
    }

    @Test
    public void findClosestPoints_example(){
        int[][] points = {{1, 3}, {-2, 2}};
        int k = 1;
        int[][] expected = {{-2, 2}};
        int[][] actual = kClosestPointsToOrigin.findClosestPoints(points, k);
        Arrays.sort(actual, Arrays::compare);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void findClosestPoints_example2(){
        int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;
        int[][] expected = {{-2, 4}, {3, 3}};
        int[][] actual = kClosestPointsToOrigin.findClosestPoints(points, k);
        Arrays.sort(actual, Arrays::compare);
        assertArrayEquals(expected, actual);
    }
}