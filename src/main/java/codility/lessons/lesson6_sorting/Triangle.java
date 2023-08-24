package codility.lessons.lesson6_sorting;

import java.util.Arrays;

public class Triangle {
    public int findTTriangle(int[] A){
        int N = A.length;
        if(N < 3) return 0;

        Arrays.sort(A);
        for(int i = N - 3; i >= 0; i--){
            if(A[i]> 0 && isTriangle(A, i, i + 1, i + 2)) return 1;
        }
        return 0;
    }
    private boolean isTriangle(int[] A, int P, int Q, int R){
        return ((long)A[P] + A[Q]) > A[R] && ((long)A[Q] + A[R]) > A[P] && ((long)A[R] + A[P]) > A[Q];
    }
}
