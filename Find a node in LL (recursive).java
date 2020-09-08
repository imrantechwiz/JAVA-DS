/*
Given a linked list and an integer n you need to find and return index where n is present in the LL. Do this recursively.
Return -1 if n is not present in the LL.


Input 1

3 4 5 2 6 1 9 -1
5

output 1

2

*/
import java.util.Scanner;

class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode(T data) {
		this.data = data;
	}
}

public class Runner {
	
	static Scanner s = new Scanner(System.in);
	
	public static LinkedListNode<Integer> takeInput() {
		LinkedListNode<Integer> head = null, tail = null;
		int data = s.nextInt();
		while(data != -1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	

	
	public static void main(String[] args) {
		LinkedListNode<Integer> head = takeInput();
		int n = s.nextInt();
		System.out.println(Solution.indexOfNRec(head, n));
	}
}



public class Solution {
      public static int i=0;
	public static int indexOfNRec(LinkedListNode<Integer> head, int n) {
        if(head==null){
            return -1;
        }
        
        if(head.data==n){
            return i;
        }
        i++;
        
        return indexOfNRec(head.next,n);
        
        
	}
}
