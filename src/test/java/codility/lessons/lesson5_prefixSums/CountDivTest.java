package codility.lessons.lesson5_prefixSums;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CountDivTest {
    @Test
    void should_return_three(){
        int A = 6;
        int B = 11;
        int K = 2;
        int expected = 3;
        int actual = (new CountDiv()).solution(A, B, K);
        assertEquals(expected, actual);
    }
    @Test
    void should_return_zero(){
        int A = 6;
        int B = 11;
        int K = 100;
        int expected = 0;
        int actual = (new CountDiv()).solution(A, B, K);
        assertEquals(expected, actual);
    }
    @Test
    void should_return_one(){
        int A = 6;
        int B = 6;
        int K = 6;
        int expected = 1;
        int actual = (new CountDiv()).solution(A, B, K);
        assertEquals(expected, actual);
    }
}
