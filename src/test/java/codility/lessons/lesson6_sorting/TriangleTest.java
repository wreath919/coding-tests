package codility.lessons.lesson6_sorting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TriangleTest {
    Triangle triangle;
    @BeforeAll
    void setup(){
        triangle = new Triangle();
    }

    @Test
    void findTTriangle_example_returnOne(){
        int[] A = {10, 2, 5, 1, 8, 20};
        int expected = 1;
        int actual = triangle.findTTriangle(A);
        assertEquals(expected, actual);
    }
    @Test
    void findTTriangle_example_returnZero(){
        int[] A = {10, 50, 5, 1};
        int expected = 0;
        int actual = triangle.findTTriangle(A);
        assertEquals(expected, actual);
    }
    @Test
    void findTTriangle_arithOverflow_returnOne(){
        int[] A = {2147483647, 2147483647, 2147483647};
        int expected = 1;
        int actual = triangle.findTTriangle(A);
        assertEquals(expected, actual);
    }
}