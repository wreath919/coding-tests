package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MajorityElementTest {
    MajorityElement majorityElement;
    @BeforeAll
    void setup(){
        majorityElement = new MajorityElement();
    }
    @Test
    void findMajorityElement_example_returnsThree(){
        int[] nums = {3,2,3};
        int expected = 3;
        int actual = majorityElement.findMajorityElement(nums);
        assertEquals(expected, actual);
    }
    @Test
    void findMajorityElement_example2_returnsTwo(){
        int[] nums = {2,2,1,1,1,2,2};
        int expected = 2;
        int actual = majorityElement.findMajorityElement(nums);
        assertEquals(expected, actual);
    }
    @Test
    void findMajorityElement_bigNums_returnsTwo(){
        int[] nums = {-1000000000,-1000000000,1,1,1,-1000000000,-1000000000};
        int expected = -1000000000;
        int actual = majorityElement.findMajorityElement(nums);
        assertEquals(expected, actual);
    }
}