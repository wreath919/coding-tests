package codility.lessons.lesson5_prefixSums;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PassingCarsTest {
    @Test
    void should_return_five(){
        int[] A = {0, 1, 0, 1, 1};
        int expected = 5;
        int actual = (new PassingCars()).solution(A);
        assertEquals(expected, actual);
    }
    @Test
    void should_return_zero(){
        int[] A = {1, 0};
        int expected = 0;
        int actual = (new PassingCars()).solution(A);
        assertEquals(expected, actual);
    }
    @Test
    void should_return_one(){
        int[] A = {0, 1};
        int expected = 1;
        int actual = (new PassingCars()).solution(A);
        assertEquals(expected, actual);
    }
    @Test
    void should_return_eight(){
        int[] A = {0, 0, 1, 0, 1, 1, 0};
        int expected = 8;
        int actual = (new PassingCars()).solution(A);
        assertEquals(expected, actual);
    }
}
