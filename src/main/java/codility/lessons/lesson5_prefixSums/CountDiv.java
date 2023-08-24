package codility.lessons.lesson5_prefixSums;

public class CountDiv {
    public int solution(int A, int B, int K) {
        if (A % K == 0)
            return (B / K) - (A / K) + 1;

        // A is not divisible by M
        return (B / K) - (A / K);
    }
}
