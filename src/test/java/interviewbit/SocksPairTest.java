package interviewbit;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SocksPairTest {

    SocksPair socksPair;
    @BeforeAll
    void setup(){
        socksPair = new SocksPair();
    }

    @Test
    void should_find_one_pair(){
        int[] A = {1, 2, 1};
        int expected = 1;
        int actual = socksPair.findSocksPair(A);
        assertEquals(expected, actual);
    }

    @Test
    void should_find_zero_pair(){
        int[] A = {1, 2, 3};
        int expected = 0;
        int actual = socksPair.findSocksPair(A);
        assertEquals(expected, actual);
    }

    @Test
    void should_find_two_pair(){
        int[] A = {1, 3, 3, 1};
        int expected = 2;
        int actual = socksPair.findSocksPair(A);
        assertEquals(expected, actual);
    }
}