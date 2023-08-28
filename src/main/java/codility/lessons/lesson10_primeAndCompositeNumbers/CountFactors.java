package codility.lessons.lesson10_primeAndCompositeNumbers;

public class CountFactors {
    public int countFactors(int N){
        if(N == 1) return 1;

        int count = 2;
        long i = 2;
        while(i * i < N){
            if(N % i == 0) count += 2;
            i++;
        }
        if(N == i * i) count++;
        return count;
    }
}
