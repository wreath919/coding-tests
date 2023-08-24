package codility.lessons.lesson5_prefixSums;

public class PassingCars {
    public int solution(int[] A) {
        int countEast = 0;
        int pass = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] == 0) countEast++;
            else {
                pass+=countEast;
            }
        }
        return pass > 1000000000 || pass < -1000000000? -1 : pass;
    }
}
