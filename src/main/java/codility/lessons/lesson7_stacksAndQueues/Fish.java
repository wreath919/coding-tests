package codility.lessons.lesson7_stacksAndQueues;

import java.util.Stack;

public class Fish {
    public int findNumOfSurvivedFish(int[] A, int[] B){
        Stack<Integer> stack = new Stack<>();
        int reachedTop = 0;
        for(int i = 0; i < A.length; i++){
            if(B[i] == 1) { //down
                stack.push(A[i]);
            } else { //up
                while(true){
                    if(stack.empty()) {
                        reachedTop++;
                        break;
                    }
                    // met a bigger fish, going up fish is eaten by going down fish
                    if(stack.peek() > A[i]) break;
                    // we keep on eating going down fish...
                    stack.pop();
                }
            }
        }
        return reachedTop + stack.size();
    }
}
