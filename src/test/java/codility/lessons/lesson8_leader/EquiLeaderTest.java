package codility.lessons.lesson8_leader;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class EquiLeaderTest {
    EquiLeader equiLeader;
    @BeforeAll
    void setup(){
        equiLeader = new EquiLeader();
    }
    @Test
    void getNumOfEquiLeader_example_returnsTwo(){
        int[] A = {4, 3, 4, 4, 4, 2};
        int expected = 2;
        int actual = equiLeader.getNumOfEquiLeader(A);
        assertEquals(expected, actual);
    }
    @Test
    void getNumOfEquiLeader_example_returnsThree() {
        int[] A = {4, 4, 2, 5, 3, 4, 4, 4};
        int expected = 3;
        int actual = equiLeader.getNumOfEquiLeader(A);
        assertEquals(expected, actual);
    }
    @Test
    void getNumOfEquiLeader_negativeElement_returnsTwo(){
        int[] A = {-4, 3, -4, -4, -4, 2};
        int expected = 2;
        int actual = equiLeader.getNumOfEquiLeader(A);
        assertEquals(expected, actual);
    }
    @Test
    void getNumOfEquiLeader_twoElement_returnsZero(){
        int[] A = {-4, 2};
        int expected = 0;
        int actual = equiLeader.getNumOfEquiLeader(A);
        assertEquals(expected, actual);
    }
    @Test
    void getNumOfEquiLeader_threeElement_returnsZero(){
        int[] A = {4, 3, 4};
        int expected = 0;
        int actual = equiLeader.getNumOfEquiLeader(A);
        assertEquals(expected, actual);
    }
    @Test
    void getNumOfEquiLeader_threeSameElement_returnsZero(){
        int[] A = {4, 3, 4};
        int expected = 0;
        int actual = equiLeader.getNumOfEquiLeader(A);
        assertEquals(expected, actual);
    }
    @Test
    void getNumOfEquiLeader_bigElement_returnsZero(){
        int[] A = {1000000000, 1000000000, -1000000000};
        int expected = 0;
        int actual = equiLeader.getNumOfEquiLeader(A);
        assertEquals(expected, actual);
    }
    @Test
    void getNumOfEquiLeader_noLeader_returnsZero(){
        int[] A = {4, 3, 2};
        int expected = 0;
        int actual = equiLeader.getNumOfEquiLeader(A);
        assertEquals(expected, actual);
    }
}