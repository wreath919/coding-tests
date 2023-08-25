package codility.lessons.lesson8_leader;

public class EquiLeader {
    public int getNumOfEquiLeader(int[] A){
        int leader = findLeader(A);
        if(leader == -1) return 0;

        //create prefix sum for the number of leader
        int[] prefixSum = new int[A.length + 1];
        prefixSum[0] = 0;
        for(int i = 0; i < A.length; i++){
            int increment = 0;
            if(A[i] == leader) increment = 1;
            prefixSum[i + 1] = prefixSum[i] + increment;
        }

        //iterate all elements evaluating and counting if it's equiLeader
        return getCountEquiLeader(prefixSum);
    }

    private static int getCountEquiLeader(int[] prefixSum) {
        int M = prefixSum.length;
        int countEquiLeader = 0;
        for(int i = 1; i < prefixSum.length - 1; i++){
            int numOfleaderInLeft = prefixSum[i];
            int numOfleaderInRight = prefixSum[M - 1] - numOfleaderInLeft;
            boolean isLeaderInLeft = numOfleaderInLeft > (i/ 2);
            boolean isLeaderInRight = numOfleaderInRight > (M - 1 - i)/ 2;
            if(isLeaderInLeft && isLeaderInRight) countEquiLeader++;
        }
        return countEquiLeader;
    }

    private int findLeader(int[] A){
        int size = 0;
        int top = 0;
        int N = A.length;
        for(int i = 0; i < N; i++){
            if(size == 0) {
                size++;
                top = A[i];
            }
            else{
                if(A[i] != top){
                    size--;
                } else {
                    size++;
                }
            }
        }
        int candidate = 0;
        if(size > 0) candidate = top;

        int count = 0;
        int leader= -1;
        for(int i = 0; i < N; i++){
            if(A[i] == candidate) {
                count++;
            }
        }
        if(count > N/ 2) leader = candidate;
        return leader;
    }
}
