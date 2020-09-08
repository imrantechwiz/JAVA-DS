package LinkedLast;

import java.util.Scanner;

public class InsertRecursively {
	
	public static Node<Integer> takeInput(){
		Node<Integer> head=null,tail=null;
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		
		while(data!=-1) {
			Node<Integer> newNode=new Node<Integer>(data);
			
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else {
				tail.next=newNode;  // 1 2 3 node of 3 should point to 4 so tail.next=newNode
				tail=newNode;       // now 4 is out last index so node must be 4
			}
			
			data=sc.nextInt();
		}
		
		return head;
	}
	
	public static void print(Node<Integer> head){
		while(head!=null) {
			System.out.println(head.data+" ");
			head=head.next;
		}
	}
	
	public static Node<Integer> insert(Node<Integer> head,int pos,int val){
		if(pos==0) {
			Node<Integer> newNode=new Node<Integer>(val);
			newNode.next=head;
			return newNode;
		}
		if(head.next==null) {
			return head;
		}
		head.next=insert(head.next,pos-1,val);
		
		return head;
	}

	public static void main(String[] args) {
		Node<Integer> head=takeInput();
		
		head=insert(head,5,10);
		print(head);
	}

}
