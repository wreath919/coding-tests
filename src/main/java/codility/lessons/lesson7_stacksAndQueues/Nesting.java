package codility.lessons.lesson7_stacksAndQueues;

import java.util.Stack;

public class Nesting {
    public int isProperlyNested(String S){
        if(S.isEmpty()) return 1;

        Stack<Character> stack = new Stack<>();
        for(Character c : S.toCharArray()){
            if(c == '('){
                stack.push(c);
            } else {
                if(stack.isEmpty()) return 0;
                stack.pop();
            }
        }
        if(stack.isEmpty()) return 1;
        return 0;
    }
}
