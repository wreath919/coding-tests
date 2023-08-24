package codility.lessons.lesson7_stacksAndQueues;

import java.util.Stack;

public class StoneWall {
    public int findNumOfBlocks(int[] H){
        Stack<Integer> stack = new Stack<>();
        int blockCount = 0;
        for(int h : H){
           while(!stack.isEmpty() && stack.peek() > h){
               stack.pop();
           }
           if(stack.isEmpty() || stack.peek() != h){
               stack.push(h);
               blockCount++;
           }
        }
        return blockCount;
    }
}
