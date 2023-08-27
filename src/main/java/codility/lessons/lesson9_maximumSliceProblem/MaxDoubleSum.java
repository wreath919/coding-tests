package codility.lessons.lesson9_maximumSliceProblem;

public class MaxDoubleSum {
    public int findSumOfDoubleSlices(int[] A){
        int[] slice1LocalMax = new int[A.length];
        int[] slice2LocalMax = new int[A.length];
        for(int i = 1; i < A.length - 1; i++){
            slice1LocalMax[i] = Math.max(slice1LocalMax[i - 1] + A[i], 0);
        }
        for(int i = A.length - 2; i > 0; i--){
            slice2LocalMax[i] = Math.max(slice2LocalMax[i + 1] + A[i], 0);
        }

        int maxDoubleSliceSum = 0;
        for(int i = 1; i < A.length - 1; i++){
            maxDoubleSliceSum = Math.max(maxDoubleSliceSum, slice1LocalMax[i - 1] + slice2LocalMax[i + 1]);
        }
        return maxDoubleSliceSum;
    }
}
