package codility.lessons.lesson7_stacksAndQueues;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import static org.junit.jupiter.api.Assertions.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class NestingTest {
    Nesting nesting;

    @BeforeAll
    void setup(){
        nesting = new Nesting();
    }

    @Test
    void isProperlyNested_empty_returnOne(){
        String S = "";
        int expected = 1;
        int actual = nesting.isProperlyNested(S);
        assertEquals(expected, actual);
    }
    @Test
    void isProperlyNested_properlyNested_returnOne(){
        String S = "(()(())())";
        int expected = 1;
        int actual = nesting.isProperlyNested(S);
        assertEquals(expected, actual);
    }
    @Test
    void isProperlyNested_inProperlyNested_returnZero_1(){
        String S = "())";
        int expected = 0;
        int actual = nesting.isProperlyNested(S);
        assertEquals(expected, actual);
    }
    @Test
    void isProperlyNested_inProperlyNested_returnZero_2(){
        String S = "((()";
        int expected = 0;
        int actual = nesting.isProperlyNested(S);
        assertEquals(expected, actual);
    }

}