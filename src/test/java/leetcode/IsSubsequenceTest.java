package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class IsSubsequenceTest {
    IsSubsequence isSubsequence;

    @BeforeAll
    void setup(){
        isSubsequence = new IsSubsequence();
    }
    @Test
    void isSubsequence_example_returnsTrue(){
        String s = "abc";
        String t = "ahbgdc";
        boolean expected = true;
        boolean actual = isSubsequence.isSubsequence(s, t);
        assertEquals(expected, actual);
    }
    @Test
    void isSubsequence_example2_returnsFalse(){
        String s = "axc";
        String t = "ahbgdc";
        boolean expected = false;
        boolean actual = isSubsequence.isSubsequence(s, t);
        assertEquals(expected, actual);
    }
}