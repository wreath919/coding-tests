package glovo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SockPairTest {
    SockPair sockPair;

    @BeforeAll
    void setup(){
        sockPair = new SockPair();
    }

    @Test
    void findSockPair_example1_returnsZero(){
        int[] A = {2,1,3};
        int expected = 0;
        int actual = sockPair.findSockPair(A);
        assertEquals(expected,actual);
    }
    @Test
    void findSockPair_example2_returnsTwo(){
        int[] A = {4, 7, 3, 7, 4, 1, 8};
        int expected = 2;
        int actual = sockPair.findSockPair(A);
        assertEquals(expected,actual);
    }
    @Test
    void findSockPair_example3_returnsThree(){
        int[] A = {4, 7, 3, 7, 4, 1, 8, 7, 7};
        int expected = 3;
        int actual = sockPair.findSockPair(A);
        assertEquals(expected,actual);
    }
    @Test
    void findSockPair_emptyArray_returnsZero(){
        int[] A = {};
        int expected = 0;
        int actual = sockPair.findSockPair(A);
        assertEquals(expected,actual);
    }
    @Test
    void findSockPair_example4_returnsOne(){
        int[] A = {1,1,1};
        int expected = 1;
        int actual = sockPair.findSockPair(A);
        assertEquals(expected,actual);
    }
}