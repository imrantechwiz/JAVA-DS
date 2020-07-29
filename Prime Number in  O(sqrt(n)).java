package java1;
import java.util.*;
public class primenumber {
	public static void main(String args[]){
		// a*b=num;
		// a*a=num(a==b) || a*b=num(b>a); so run the loop sqrt(num) times for find the smallest factor;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(),flag=0;
		for(int i=2;i*i<=num;i++) {
			if(num%i==0){
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("No it is not a Prime");
		}else {
			System.out.println("Yes it is prime");
		}
	}
}
