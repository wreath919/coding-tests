package glovo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MissingItemTest {
    MissingItem missingItem;

    @BeforeAll
    void setup(){
        missingItem = new MissingItem();
    }

    @Test
    void findMissingItems_nothingMissing_returnsEmptyArray(){
        int[] A = {1,3,5};
        int[] B = {5,3,1};
        int [] expected = {};
        int[] actual = missingItem.findMissingItems(A, B);
        assertArrayEquals(expected,actual);
    }
    @Test
    void findMissingItems_twoMissing_returnsTwoElements(){
        int[] A = {11, 2, 4, 11, 11, 2, 3};
        int[] B = {2, 4, 2, 11};
        int [] expected = {3, 11};
        int[] actual = missingItem.findMissingItems(A, B);
        assertArrayEquals(expected,actual);
    }
}