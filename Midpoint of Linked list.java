

import java.util.Scanner;

public class Runner {
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(Solution.printMiddel(input()) + "");
	}
	

	public static LinkedListNode<Integer> input() {
		int data = s.nextInt();
		
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		while (data!=-1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
}

class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}



public class Solution {
	public static int printMiddel(LinkedListNode<Integer> head) {
        
        LinkedListNode<Integer> temp=head;
        
        int x=0;
        int l=0;
        while(temp!=null){
            l++;
            temp=temp.next;
        }
        
        int slow=0;
        int fast=0;
        
        if(l%2!=0){
            while(head!=null){
                if(fast==l/2){
                    return x=head.data;
                }
                slow++;
                fast++;
                head=head.next;
            }
        }
        else{
            
            while(head!=null){
                if(fast==(l/2)-1){
                    return x=head.data;
                }
                slow++;
                fast++;
                head=head.next;
            }
        }
        
        return -1;
       
    }
}
