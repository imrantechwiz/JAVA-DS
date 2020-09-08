package LinkedList;
import java.util.*;
public class LinkedListUse {
	
	public static Node<Integer> takeInput(){
		Node<Integer> head=null;
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		// O (n^2)
		while(data!=-1) {
			Node<Integer> newNode=new Node<Integer>(data);
			
			if(head==null) {
				head=newNode;
			}
			else {
				Node<Integer> temp=head;
				
				while(temp.next!=null) {
					temp=temp.next;
				}
				
				temp.next=newNode;
			}
			
			data=sc.nextInt();
		}
		
   
    
		return head;
	}
	
	
	public static void main(String[] args) {
		Node<Integer> head=takeInput();

		print(head);
	}
	
	public static void print(Node<Integer> head){
		while(head!=null) {
			System.out.println(head.data+" ");
			head=head.next;
		}
	}

}
