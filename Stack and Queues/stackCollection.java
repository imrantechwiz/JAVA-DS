package StackQueues;
import java.util.*;
public class stackCollection {

	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<>();
		
		for(int i=1;i<=5;i++) {
			stack.push(i);
		}
		
		System.out.println(stack.peek());
		System.out.println();
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
			
		}
	}

}
