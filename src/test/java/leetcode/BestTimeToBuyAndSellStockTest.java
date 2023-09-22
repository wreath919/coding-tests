package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BestTimeToBuyAndSellStockTest {
    BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock;

    @BeforeAll
    void setup(){
        bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
    }
    @Test
    void findMaxProfit_example_returnsFive(){
        int[] prices = {7,1,5,3,6,4};
        int expected = 5;
        int actual = bestTimeToBuyAndSellStock.findMaxProfit(prices);
        assertEquals(expected, actual);
    }
    @Test
    void findMaxProfit_example2_returnsZero(){
        int[] prices = {7,6,4,3,1};
        int expected = 0;
        int actual = bestTimeToBuyAndSellStock.findMaxProfit(prices);
        assertEquals(expected, actual);
    }
}