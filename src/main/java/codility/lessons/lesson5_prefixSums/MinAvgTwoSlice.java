package codility.lessons.lesson5_prefixSums;

public class MinAvgTwoSlice {
    public int solution(int[] A) {
        // make prefix sum
        int[] prefixSum = new int[A.length + 1];
        for(int i = 0; i < A.length; i++){
            prefixSum[i + 1] = prefixSum[i] + A[i];
        }

        //find start point of slice with min avg
        double minAvg = 1000;
        int startIdx = 0;
        for(int i = 0; i < A.length; i++){
            double currentAvg2 = (double)(prefixSum[i + 2] - prefixSum[i]) / 2;
            if(currentAvg2 < minAvg) {
                minAvg = currentAvg2;
                startIdx = i;
            }

            if(i == A.length - 2) break;

            double currentAvg3 = (double)(prefixSum[i + 3] - prefixSum[i]) / 3;
            if(currentAvg3 < minAvg) {
                minAvg = currentAvg3;
                startIdx = i;
            }
        }
        return startIdx;
    }
}
