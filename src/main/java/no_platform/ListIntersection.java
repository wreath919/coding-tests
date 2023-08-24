package no_platform;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListIntersection {
    public int[] findIntersection(int[] A, int[] B){
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < A.length; i++){
            set.add(A[i]);
        }
        for(int i = 0; i < B.length; i++){
            if(set.contains(B[i])) {
                list.add(B[i]);
                set.remove(B[i]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
