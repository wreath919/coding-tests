package codility.lessons.lesson9_maximumSliceProblem;

import javax.swing.table.TableStringConverter;

public class MaxSliceSum {
    public int findMaxSumOfSlice(int[] A) {
        int localSum = 0;
        int absolSum = -2147483647;
        for(int a : A){
            int nextSum = localSum + a;
            localSum = Math.max(nextSum, a);
            absolSum = Math.max(localSum, absolSum);
        }
        return absolSum;
    }
}