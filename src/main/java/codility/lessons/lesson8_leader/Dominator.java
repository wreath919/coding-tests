package codility.lessons.lesson8_leader;

import java.util.HashMap;
import java.util.Map;

public class Dominator {
    public int findDominator(int[] A){
        Map<Integer, Integer> map = new HashMap<>();
        int N = A.length;
        for(int i = 0; i < N; i++){
            if(map.containsKey(A[i])){
                int count = map.get(A[i]);
                count++;
                map.put(A[i], count);
            } else {
                map.put(A[i], 1);
            }
        }
        int idx = -1;
        int leader = 0;
        boolean foundLeader = false;
        for(int key : map.keySet()){
            if(map.get(key) > N/ 2) {
                foundLeader = true;
                leader = key;
            }
        }
        if(foundLeader){
            for(int i = 0; i < N; i++){
                if(A[i] == leader) idx = i;
            }
        }
        return idx;
    }
}
