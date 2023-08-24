package codility.lessons.lesson5_prefixSums;

//O(N + M) time, O(N) space
public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
        int N = S.length();
        int M = P.length;
        int[] result = new int[M];
        int[] A = new int[N + 1];
        int[] C = new int[N + 1];
        int[] G = new int[N + 1];
        for(int i = 0; i < N; i++){
            //create prefix sum
            int a = 0;
            int c = 0;
            int g = 0;
            switch(S.charAt(i)){
                case 'A':
                    a = 1;
                    break;
                case 'C':
                    c = 1;
                    break;
                case 'G':
                    g = 1;
                    break;
                default:
                    break;
            }
            A[i + 1] = A[i] + a;
            C[i + 1] = C[i] + c;
            G[i + 1] = G[i] + g;
        }
        for(int i = 0; i < M; i++){
            if(countNum(A, P[i], Q[i]) > 0) result[i] = 1;
            else if(countNum(C, P[i], Q[i]) > 0) result[i] = 2;
            else if(countNum(G, P[i], Q[i]) > 0) result[i] = 3;
            else result[i] = 4;
        }
        return result;
    }
    public int countNum(int[] array, int start, int end){
        return array[end + 1] - array[start];
    }
}
