package codility.lessons.lesson6_sorting;

import java.util.Arrays;

public class MaxProductOfThree {
    public int findMaxProductOfThree(int[] A){
        Arrays.sort(A);
        int N = A.length;
        int topThree = A[N - 1] * A[N - 2] * A[N - 3];
        int bottomTwoAndPositiveNum = A[0] * A[1] * A[N - 1];
        return Math.max(topThree, bottomTwoAndPositiveNum);
    }
}
