package codility.lessons.lesson7_stacksAndQueues;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BracketsTest {
    Brackets brackets;

    @BeforeAll
    void setup(){
        brackets = new Brackets();
    }
    @Test
    void isProperlyNested_properlyNested_1(){
        String S = "{[()()]}";
        int expected = 1;
        int actual = brackets.isProperlyNested(S);
        assertEquals(expected, actual);
    }
    @Test
    void isProperlyNested_properlyNested_2(){
        String S = "([{}])";
        int expected = 1;
        int actual = brackets.isProperlyNested(S);
        assertEquals(expected, actual);
    }
    @Test
    void isProperlyNested_properlyNested_3(){
        String S = "(){}";
        int expected = 1;
        int actual = brackets.isProperlyNested(S);
        assertEquals(expected, actual);
    }
    @Test
    void isProperlyNested_properlyNested_4(){
        String S = "";
        int expected = 1;
        int actual = brackets.isProperlyNested(S);
        assertEquals(expected, actual);
    }
    @Test
    void isProperlyNested_inProperlyNested_1(){
        String S = "([)()]";
        int expected = 0;
        int actual = brackets.isProperlyNested(S);
        assertEquals(expected, actual);
    }

    @Test
    void isProperlyNested_inProperlyNested_2(){
        String S = ")";
        int expected = 0;
        int actual = brackets.isProperlyNested(S);
        assertEquals(expected, actual);
    }

}