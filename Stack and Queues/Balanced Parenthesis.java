import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
        String expression = br.readLine().trim();
        System.out.println(Solution.isBalanced(expression));
    }
}


import java.util.*;

public class Solution {

	public static boolean isBalanced(String exp) {
        Stack<Character> stack=new Stack<>();
        
        for(int i=0;i<exp.length();i++){
            if(exp.charAt(i)=='(' || exp.charAt(i)=='{' || exp.charAt(i)=='[' ){
                stack.push(exp.charAt(i));
            }
            
            else if(exp.charAt(i)==')' || exp.charAt(i)=='}' || exp.charAt(i)==']'){
                if(stack.isEmpty()){
                    return false;
                }
                char temp=stack.pop();
                
                if((temp=='(' && exp.charAt(i)!=')') || (temp=='(' && exp.charAt(i)!=')') || (temp=='(' && exp.charAt(i)!=')')){
                    return false;
                }
               
            }
        }
        
        return stack.isEmpty();
	  }
	}
