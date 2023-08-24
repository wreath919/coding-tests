package codility.lessons.lesson6_sorting;

import java.util.HashSet;
import java.util.Set;

public class DistinctValues {
    public int findDistinctValues(int[] A){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < A.length; i++){
            if(!set.contains(A[i])) set.add(A[i]);
        }
        return set.size();
    }
}
