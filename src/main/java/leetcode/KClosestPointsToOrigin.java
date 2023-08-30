package leetcode;

import java.util.*;

public class KClosestPointsToOrigin {
    public int[][] findClosestPoints(int[][] points, int k){
        // Solution 1.
        // 二次元配列のソート
        //Arrays.sort(points, Arrays::compare);
        //return Arrays.copyOfRange(points, 0, k);

        // Solution 2.
        Queue<int[]> pq = new PriorityQueue<>((a, b) -> compare(a, b));
        pq.addAll(Arrays.asList(points));
        int[][] result = new int[k][2];
        for(int i = 0; i < k; i++){
            result[i] = pq.poll();
        }
        return result;
    }
    private static int compare(int[] a, int[] b){
        return (a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1]);
    }
}
