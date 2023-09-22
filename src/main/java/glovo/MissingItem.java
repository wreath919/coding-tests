package glovo;

import java.util.*;

public class MissingItem {
    public int[] findMissingItems(int[] A, int[] B){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int b : B){
            if(map.containsKey(b)) {
                int count = map.get(b);
                count++;
                map.put(b, count);
            } else {
                map.put(b, 1);
            }
        }
        List<Integer> missing = new ArrayList<>();
        for(int a : A){
            if(!map.containsKey(a) && !missing.contains(a)) {
                missing.add(a);
            }else if(map.containsKey(a)){
                int count = map.get(a);
                count--;
                if(count > 0) map.put(a, count);
                else {
                    map.remove(a);
                }
            }
        }
        Collections.sort(missing);
        return missing.stream().mapToInt(Integer::intValue).toArray();
    }
}
