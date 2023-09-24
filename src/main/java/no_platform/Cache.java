package no_platform;

import java.util.LinkedList;
public class Cache {

    private LinkedList<Integer> linkedList = new LinkedList<>();

    public boolean isInCache(int n){
        boolean isInCache = false;

        int cacheSize = 3;
        if(linkedList.contains(n)){
            linkedList.remove((Integer) n);
            isInCache = true;
        } else if(linkedList.size() >= cacheSize){
            linkedList.remove();
        }

        linkedList.add(n);
        return isInCache;
    }

    public LinkedList<Integer> getLinkedList(){
        return this.linkedList;
    }

    @Override
    public String toString(){
        return "Cache : " + this.linkedList;
    }
}
