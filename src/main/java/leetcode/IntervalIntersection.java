package leetcode;

import java.util.ArrayList;
import java.util.List;

public class IntervalIntersection {
    public int[][] findIntersection(int[][] firstList, int[][] secondList) {
        int m = firstList.length;
        int n = secondList.length;
        if(m == 0 || n == 0) return new int[0][0];
        int start = 0, end = 0;
        int i = 0, j = 0;
        List<int[]> interval = new ArrayList<>();
        while(i < m && j < n){
            start = Math.max(firstList[i][0], secondList[j][0]);
            end = Math.min(firstList[i][1], secondList[j][1]);
            if(start <= end) interval.add(new int[]{start, end});
            if(firstList[i][1] == end) i++;
            if(secondList[j][1] == end) j++;
        }
        return interval.toArray(new int[interval.size()][2]);
    }
}
