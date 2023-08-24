package interviewbit;

import java.util.HashSet;
import java.util.Set;

public class SocksPair {
    public int findSocksPair(int[] A){
        int pair = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < A.length; i++){
            if(set.contains(A[i])){
                pair++;
                set.remove(A[i]);
            } else {
                set.add(A[i]);
            }
        }
        return pair;
    }
}
