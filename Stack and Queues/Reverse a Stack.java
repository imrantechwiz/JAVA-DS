/*
You have been given two stacks that can store integers as the data. Out of the two given stacks, one is populated and the other one is empty. You are required to write a function that reverses the populated stack using the one which is empty.

6
1 2 3 4 5 10


1 2 3 4 5 10
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static Stack<Integer> takeInput() throws NumberFormatException, IOException {
    	int size = Integer.parseInt(br.readLine().trim());
    	Stack<Integer> input = new Stack<>();

    	if (size == 0) {
    		return input;
    	}
    	
    	String[] values = br.readLine().trim().split(" ");

    	for(int i = 0; i < size; i++) {
    		input.push(Integer.parseInt(values[i]));
    	}

    	return input;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
    	Stack<Integer> input = takeInput();
    	Stack<Integer> empty = new Stack<>();

    	Solution.reverseStack(input, empty);

    	while(!input.isEmpty()) {
    		System.out.print(input.pop() + " ");
    	}

    }
}



import java.util.Stack;

public class Solution {

	public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) {
        if(s1.size()<=1){
            return ;
        }
        
        int top=s1.pop(); 
       reverseStack(s1,s2); //using recurssion
        
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        
        s2.push(top);
        
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        
   }
}
