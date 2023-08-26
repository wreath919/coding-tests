package codility.lessons.lesson9_maximumSliceProblem;

public class MaxProfit {
    public int findMaxProfit(int[] A){
        if(A.length < 2) return 0;

        int[] deltA = new int[A.length + 1];
        deltA[0] = 0;
        for(int i = 1; i < A.length; i++){
            deltA[i] = A[i] - A[i - 1];
        }

        // localSUm: takes bigger value: sum of all elements so far or starting summing up from i
        //         : usually second option is chosen when there was a drop. localMax value is kept until it exceeds absolMax.
        int localMax = 0;
        int absolMax = 0;
        for(int i = 1; i < A.length; i++){
            int nextSum = localMax + deltA[i];
            localMax = Math.max(nextSum, deltA[i]);
            absolMax = Math.max(localMax, absolMax);
        }
        return Math.max(absolMax, 0);
    }
}
