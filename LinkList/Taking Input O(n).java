package LinkedList;
import java.util.*;
public class LinkedListUse {
	
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
	
	
	public static void main(String[] args) {
		Node<Integer> head=takeInput();
//		
//		Node<Integer> node1=new Node<Integer>(10);
//		Node<Integer> node2=new Node<Integer>(20);
//		Node<Integer> node3=new Node<Integer>(30);
//		
//		node1.next=node2;
//		node2.next=node3;
		
		//Node<Integer> head=node1;
		
		print(head);
	}
	
	public static void print(Node<Integer> head){
		while(head!=null) {
			System.out.println(head.data+" ");
			head=head.next;
		}
	}

}

//public class Node<T>{
//	T data;
//	Node<T> next;
//	
//	Node(T data){
//		this.data=data;
//		next=null;
//	}
//}
