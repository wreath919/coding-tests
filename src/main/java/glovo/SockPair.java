package glovo;

import java.util.HashSet;
import java.util.Set;

public class SockPair {
    public int findSockPair(int[] A){
        int sockPair = 0;
        Set<Integer> set = new HashSet<>();
        for(int a : A){
            if(set.contains(a)){
                sockPair++;
                set.remove(a);
            } else {
                set.add(a);
            }
        }
        return sockPair;
    }
}
