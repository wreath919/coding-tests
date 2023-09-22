package no_platform;

import java.util.LinkedList;
public class Cache {

    private LinkedList<Integer> linkedList = new LinkedList<>();

    public boolean getFromCache(int n){

        if(linkedList.contains(n)){
            linkedList.remove((Integer) n);
            linkedList.add(n);
            return true;
        } else {
            if(linkedList.size() >= 3){
                linkedList.remove(0);
            }
            linkedList.add(n);
            return false;
        }
    }

    public LinkedList<Integer> getLinkedList(){
        return this.linkedList;
    }

    @Override
    public String toString(){
        return "Cache : " + this.linkedList;
    }
}
