package codility.lessons.lesson5_prefixSums;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GenomicRangeQueryTest {
    GenomicRangeQuery genomicRangeQuery;

    @BeforeAll
    void setup(){
        genomicRangeQuery = new GenomicRangeQuery();
    }

    @Test
    void should_return_array_of_three_elements_1(){
        String S = "CAGCCTA";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        int[] expected = {2, 4, 1};
        int[] actual = (genomicRangeQuery.solution(S, P, Q));
        assertArrayEquals(expected, actual);
    }
    @Test
    void should_return_one_given_A(){
        String S = "A";
        int[] P = {0};
        int[] Q = {0};
        int[] expected = {1};
        int[] actual = (genomicRangeQuery.solution(S, P, Q));
        assertArrayEquals(expected, actual);
    }
    @Test
    void should_return_two_given_C(){
        String S = "C";
        int[] P = {0};
        int[] Q = {0};
        int[] expected = {2};
        int[] actual = (genomicRangeQuery.solution(S, P, Q));
        assertArrayEquals(expected, actual);
    }
    @Test
    void should_return_array_of_three_elements_2(){
        String S = "AGTCT";
        int[] P = {1, 1, 2};
        int[] Q = {3, 3, 4};
        int[] expected = {2, 2, 2};
        int[] actual = (genomicRangeQuery.solution(S, P, Q));
        assertArrayEquals(expected, actual);
    }
}