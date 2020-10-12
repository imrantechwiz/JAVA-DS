/*
{}()
({()})
{}(
[]

true
true
false
true
*/
import java.util.*;
class Solution{
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            System.out.println(check(input));
        }
    }
    static boolean check(String x){
        Stack<Character> stack=new Stack();
        char a[]=x.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]=='[' || a[i]=='{' || a[i]=='('){
                stack.push(a[i]);
            }else if(stack.isEmpty()){ //if parentheses is opposite then check if stack is empty if yes then false // eg }])
                return false;
            }
            else{
                char top=stack.pop(); //else check if any of these })] is mathable with previous one
                 if(top=='(' && a[i]!=')' || top=='[' && a[i]!=']' || top=='{' && a[i]!='}'){
            return false;
        }
            }
        }
        return stack.isEmpty();
    }
}
                
