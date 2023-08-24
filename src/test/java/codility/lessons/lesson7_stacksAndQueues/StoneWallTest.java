package codility.lessons.lesson7_stacksAndQueues;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class StoneWallTest {
    StoneWall stoneWall;

    @BeforeAll
    void setup(){
        stoneWall = new StoneWall();
    }
    @Test
    void findNumOfBlocks_example_returnSeven(){
        int[] H = {8, 8 , 5, 7, 9, 8, 7, 4, 8};
        int expected = 7;
        int actual = stoneWall.findNumOfBlocks(H);
        assertEquals(expected, actual);
    }
}