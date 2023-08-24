package codility.lessons.lesson7_stacksAndQueues;

import java.util.*;

public class Brackets {
    public int isProperlyNested(String S){
        if(S.isEmpty()) return 1;
        if(S.length() == 1) return 0;

        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('(', ')');
        brackets.put('{', '}');
        brackets.put('[', ']');

        Stack<Character> stack = new Stack<>();
        for(char c : S.toCharArray()){
            if(!brackets.containsKey(c)){
                //this is an ending flag
                if(stack.isEmpty()) return 0;

                char leftBracket = stack.pop();
                if(brackets.get(leftBracket) != c) return 0;
            }
            else {
                stack.add(c);
            }
        }
        if(stack.isEmpty()) return 1;
        return 0;
    }
}
