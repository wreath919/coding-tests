package no_platform;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ListIntersectionTest {
    ListIntersection listIntersection;

    @BeforeAll
    void setup(){
        listIntersection = new ListIntersection();
    }

    @Test
    void should_return_two_elements(){
        int[] A = {1, 3, 5, 9};
        int[] B = {2, 3, 7, 9};
        int[] expected = {3, 9};
        int[] actual= listIntersection.findIntersection(A, B);
        assertArrayEquals(expected, actual);
    }

    @Test
    void should_return_zero_element_1(){
        int[] A = {1, 3, 5, 9};
        int[] B = {2, 4, 7, 10};
        int[] expected = {};
        int[] actual= listIntersection.findIntersection(A, B);
        assertArrayEquals(expected, actual);
    }

    @Test
    void should_return_zero_element_2(){
        int[] A = {1, 3, 5, 9};
        int[] B = {};
        int[] expected = {};
        int[] actual= listIntersection.findIntersection(A, B);
        assertArrayEquals(expected, actual);
    }

    @Test
    void should_return_two_element_2(){
        int[] A = {3, 1, 5, 9};
        int[] B = {2, 3, 9, 7};
        int[] expected = {3, 9};
        int[] actual= listIntersection.findIntersection(A, B);
        assertArrayEquals(expected, actual);
    }

    @Test
    void should_count_duplicates(){
        int[] A = {3, 5, 9};
        int[] B = {2, 3, 3, 9};
        int[] expected = {3, 9};
        int[] actual= listIntersection.findIntersection(A, B);
        assertArrayEquals(expected, actual);
    }
}