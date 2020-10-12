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

            int pos = Integer.parseInt(br.readLine().trim());
            head = Solution.deleteNode(head, pos);
            print(head);

            t -= 1;
        }
    }
}




public class Solution {

	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
        
        if(pos==0){
            head=head.next;
            return head;
        }
        
        LinkedListNode<Integer> temp=head;
         //First finding len of LL incase if pos is > len then return head;
        LinkedListNode<Integer> temp1=head;
        int len=0;
        while(temp1!=null){
            len++;
            temp1=temp1.next;
        }
        
        
        
        if(pos>len){
            return head;
        }
        
        int i=0;
        
        while(i<pos-1){
            temp=temp.next;
            i++;
        }
        if(temp.next!=null){
            temp.next=temp.next.next;
        }else{
            temp.next=null;
        }
        
        return head;
        
        
	}
}
