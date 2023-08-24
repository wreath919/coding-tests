package codility.lessons.lesson8_leader;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import static org.junit.jupiter.api.Assertions.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DominatorTest {
    Dominator dominator;
    @BeforeAll
    void setup(){
        dominator = new Dominator();
    }
    @Test
    void findDominator_example(){
        int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
        int[] expected = {0, 2, 4, 6, 7};
        int actual = dominator.findDominator(A);
        boolean isInArray = false;
        for(int n : expected){
            if(n == actual) isInArray = true;
        }
        assertTrue(isInArray);

    }
    @Test
    void findDominator_noDominatorAndInputIsOdd_returnMinusOne(){
        int[] A = {1, 2, 3, 4, 5};
        int expected = -1;
        int actual = dominator.findDominator(A);
        assertEquals(expected, actual);
    }
    @Test
    void findDominator_emptyArray_returnMinusOne(){
        int[] A = {};
        int expected = -1;
        int actual = dominator.findDominator(A);
        assertEquals(expected, actual);
    }
}
