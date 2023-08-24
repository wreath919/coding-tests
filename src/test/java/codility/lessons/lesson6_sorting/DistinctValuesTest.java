package codility.lessons.lesson6_sorting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DistinctValuesTest {
    DistinctValues distinctValues;

    @BeforeAll
    void setup(){
        distinctValues = new DistinctValues();
    }

    @Test
    void findDistinctValues_emptyArray_returnZero(){
        int[] A = {};
        int expected = 0;
        int actual = distinctValues.findDistinctValues(A);
        assertEquals(expected, actual);
    }

    @Test
    void findDistinctValues_arrayWithOneElement_returnOne(){
        int[] A = {3};
        int expected = 1;
        int actual = distinctValues.findDistinctValues(A);
        assertEquals(expected, actual);
    }

    @Test
    void findDistinctValues_arrayWithTwoDuplicateElements_returnOne(){
        int[] A = {3, 3};
        int expected = 1;
        int actual = distinctValues.findDistinctValues(A);
        assertEquals(expected, actual);
    }

    @Test
    void findDistinctValues_arrayWithThreeDuplicateElements_returnTwo(){
        int[] A = {3, 5, 3};
        int expected = 2;
        int actual = distinctValues.findDistinctValues(A);
        assertEquals(expected, actual);
    }

    @Test
    void findDistinctValues_arrayWithNegativeNumber_returnTwo(){
        int[] A = {3, -3};
        int expected = 2;
        int actual = distinctValues.findDistinctValues(A);
        assertEquals(expected, actual);
    }

    @Test
    void findDistinctValues_arrayWithNegativeNumberAndZero_returnThree(){
        int[] A = {3, -5, 0};
        int expected = 3;
        int actual = distinctValues.findDistinctValues(A);
        assertEquals(expected, actual);
    }
}