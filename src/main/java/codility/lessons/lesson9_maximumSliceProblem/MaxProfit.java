package codility.lessons.lesson9_maximumSliceProblem;

public class MaxProfit {
    public int findMaxProfit(int[] A){
        if(A.length < 2) return 0;
        int buyVal = A[0];
        int maxProfit = 0;
        for(int a : A){
            if(a < buyVal) buyVal = a;
            else {
                int profit = a - buyVal;
                if(profit > maxProfit) maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
