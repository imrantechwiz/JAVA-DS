package StackQueues;

public class StackLLuse {

	public static void main(String[] args) throws StackEmptyException {
		StakUsingLL<Integer> stack=new StakUsingLL<>();
			
		for(int i=1;i<=5;i++) {
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}
