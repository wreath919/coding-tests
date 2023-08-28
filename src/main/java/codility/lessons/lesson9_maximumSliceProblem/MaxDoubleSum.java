package codility.lessons.lesson9_maximumSliceProblem;

// X, Yで挟まれる空間を左側領域、Y, Zで挟まれる空間を右側領域と呼ぶ。
// それぞれの領域でprefix sumを作る。
// 左側領域の左端は最大でインデックス１、右端はA - 3のため、1 <= i < A - 2
// 右側領域の左端は最大でインデックス2、右端はA - 2のため、2 <= i <= A - 2
// Yの座標をiとし、その場合の左側領域の最大和をslice1LocalMax[i - 1],右側領域の最大和をslice2LocalMax[i + 1]に格納する。
public class MaxDoubleSum {
    public int findSumOfDoubleSlices(int[] A){
        int[] slice1LocalMax = new int[A.length];
        int[] slice2LocalMax = new int[A.length];
        for(int i = 1; i < A.length - 2; i++){
            slice1LocalMax[i] = Math.max(slice1LocalMax[i - 1] + A[i], 0);
        }
        for(int i = A.length - 2; i > 1; i--){
            slice2LocalMax[i] = Math.max(slice2LocalMax[i + 1] + A[i], 0);
        }

        int maxDoubleSliceSum = 0;
        for(int i = 1; i < A.length - 1; i++){
            maxDoubleSliceSum = Math.max(maxDoubleSliceSum, slice1LocalMax[i - 1] + slice2LocalMax[i + 1]);
        }
        return maxDoubleSliceSum;
    }
}
