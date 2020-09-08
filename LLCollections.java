package LinkedLast;
import java.util.*;
public class LLCollections {

	public static void main(String[] args) {
		LinkedList<Integer> linklist=new LinkedList<>();
		
		linklist.add(10);
		linklist.add(20);
		linklist.add(30);
		linklist.addFirst(0);
		linklist.set(0, 40);
		
		for(int x: linklist) {
			System.out.print(x+" ");
		}
	}

}
