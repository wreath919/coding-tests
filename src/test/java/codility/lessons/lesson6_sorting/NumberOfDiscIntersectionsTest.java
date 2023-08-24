package codility.lessons.lesson6_sorting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class NumberOfDiscIntersectionsTest {
    NumberOfDiscIntersections numberOfDiscIntersections;

    @BeforeAll
    void setup(){
        numberOfDiscIntersections = new NumberOfDiscIntersections();
    }

    @Test
    void findDiscIntersection_example_returnEleven(){
        int[] A = {1, 5, 2, 1, 4, 0};
        int expected = 11;
        int actual = numberOfDiscIntersections.findDiscIntersection(A);
        assertEquals(expected, actual);
    }

    @Test
    void findDiscIntersection_intOverflow_returnThree(){
        int[] A = {2147483647, 2147483647, 2147483647};
        int expected = 3;
        int actual = numberOfDiscIntersections.findDiscIntersection(A);
        assertEquals(expected, actual);
    }
}