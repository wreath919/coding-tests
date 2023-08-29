package codility.lessons.lesson10_primeAndCompositeNumbers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MinPerimeterRectangleTest {
    MinPerimeterRectangle minPerimeterRectangle;

    @BeforeAll
    void setup(){
        minPerimeterRectangle = new MinPerimeterRectangle();
    }
    @Test
    void findMinPerimeter_example_returns30(){
        int N = 30;
        int expected = 22;
        int actual = minPerimeterRectangle.findMinPerimeter(N);
        assertEquals(expected, actual);
    }
    @Test
    void findMinPerimeter_one_returnsFour(){
        int N = 1;
        int expected = 4;
        int actual = minPerimeterRectangle.findMinPerimeter(N);
        assertEquals(expected, actual);
    }
    @Test
    void findMinPerimeter_bigNumber(){
        int N = 982451653;
        int expected = 1964903308;
        int actual = minPerimeterRectangle.findMinPerimeter(N);
        assertEquals(expected, actual);
    }
}