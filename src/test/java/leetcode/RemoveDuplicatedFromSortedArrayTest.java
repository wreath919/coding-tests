package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RemoveDuplicatedFromSortedArrayTest {
    RemoveDuplicatedFromSortedArray removeDuplicatedFromSortedArray;

    @BeforeAll
    void setup(){
        removeDuplicatedFromSortedArray = new RemoveDuplicatedFromSortedArray();
    }
    @Test
    void removeDuplicated_example_returnsTwo(){
        int[] nums = {1, 1, 2};
        int[] expectedNums = {1, 2, 1};
        int expected = 2;
        int actual = removeDuplicatedFromSortedArray.removeDuplicated(nums);
        assertEquals(expected, actual);
        for(int i = 0; i < actual; i++){
            assertEquals(expectedNums[i], nums[i]);
        }
    }
    @Test
    void removeDuplicated_example2_returnsFive(){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] expectedNums = {0,1,2,3,4};
        int expected = 5;
        int actual = removeDuplicatedFromSortedArray.removeDuplicated(nums);
        assertEquals(expected, actual);
        for(int i = 0; i < actual; i++){
            assertEquals(expectedNums[i], nums[i]);
        }
    }
    @Test
    void removeDuplicated_negativeNumber_returnsFive(){
        int[] nums = {-100,-100,0,0,1,1,1,2,100,100};
        int[] expectedNums = {-100,0,1,2,100};
        int expected = 5;
        int actual = removeDuplicatedFromSortedArray.removeDuplicated(nums);
        assertEquals(expected, actual);
        for(int i = 0; i < actual; i++){
            assertEquals(expectedNums[i], nums[i]);
        }
    }
}