import java.util.Scanner;

public class Runner {
	
	static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(Solution.firstIndex(input, x));
	}
}


public class Solution {

	
	public static int firstIndex(int input[], int x)
    
    {
        return firstIndex(input, x,0);
    }
     public static int firstIndex(int input[], int x, int sI){
           if(sI>= input.length-1)
    {
        return -1;
    }
    if(input[sI]==x)
    {
        return sI;
    }
     return firstIndex(input, x, sI +  1);
    
     }
}
