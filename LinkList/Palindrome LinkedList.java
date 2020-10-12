/*

You have been given a head to a singly linked list of integers. Write a function check to whether the list given is a 'Palindrome' or not.

1
9 2 3 3 2 9 -1

true
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;
    
    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class Runner {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static LinkedListNode<Integer> takeInput() throws IOException {
        LinkedListNode<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while(i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
            i += 1;
        }

        return head;
    }
    
    public static void print(LinkedListNode<Integer> head){
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        
        System.out.println();
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {

            LinkedListNode<Integer> head = takeInput(); 

            boolean ans = Solution.isPalindrome(head);
            System.out.println(ans);

            t -= 1;

        }
        
    }
}



public class Solution {

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
        
        if(head==null || head.next==null){
            return true;
        }
        
        LinkedListNode<Integer> slow=head;
        LinkedListNode<Integer> fast=head;
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        
        slow=reverse(slow);
        fast=head;
        
        while(slow!=null){
            if(slow.data!=fast.data){
                return false;
            }
            slow=slow.next;
            fast=fast.next;
        }
        
        return true;
        
	}
    
    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
            LinkedListNode<Integer> curr=head;
        LinkedListNode<Integer> prev=null;
        LinkedListNode<Integer> temp;
        
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }

}
