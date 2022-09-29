package stack;


import java.util.Stack;

//https://leetcode.com/problems/validate-stack-sequences/
public class ValidateStackSequences {

    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,5,3,1,2};
        System.out.println(validateStackSequences(pushed, popped));
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {

        Stack<Integer> stack = new Stack<>();
        int i=0 ,j=0;
        while(j < pushed.length || i < popped.length){
            if(!stack.isEmpty() && stack.peek() == popped[i]){
                stack.pop();
                i++;
            }else{
                if(j == pushed.length)
                    break;
                stack.push(pushed[j++]);
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
