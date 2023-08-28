package codility.lessons.lesson10_primeAndCompositeNumbers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CountFactorsTest {
    CountFactors countFactors;

    @BeforeAll
    void setup(){
        countFactors = new CountFactors();
    }
    @Test
    void countFactors_example_returnsEight(){
        int N = 24;
        int expected = 8;
        int actual = countFactors.countFactors(N);
        assertEquals(expected, actual);
    }
    @Test
    void countFactors_one_returnsOne(){
        int N = 1;
        int expected = 1;
        int actual = countFactors.countFactors(N);
        assertEquals(expected, actual);
    }
    @Test
    void countFactors_nine_returnsThree(){
        int N = 9;
        int expected = 3;
        int actual = countFactors.countFactors(N);
        assertEquals(expected, actual);
    }
    @Test
    void countFactors_primeNumber_returnsTwo(){
        int N = 11;
        int expected = 2;
        int actual = countFactors.countFactors(N);
        assertEquals(expected, actual);
    }
}