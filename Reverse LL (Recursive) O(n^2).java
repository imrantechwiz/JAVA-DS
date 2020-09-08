import java.util.Scanner;


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
public class Runner {
	
	private static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		print(Solution.reverse_R(input()));
	}
	public static void print(LinkedListNode<Integer> head) {
		while (head != null) {
			System.out.print(head.getData() + " ");
			head = head.next;
		}
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



v

public class Solution {
	
	public static LinkedListNode<Integer> reverse_R(LinkedListNode<Integer> head) {
        if(head==null || head.next==null){
            return head;
        }
        
        LinkedListNode<Integer> rev=reverse_R(head.next);
        
        LinkedListNode<Integer> temp=rev;
        while(temp.next!=null){
            temp=temp.next;
        }
        
        temp.next=head;
        head.next=null;
        return rev;
	}
}
