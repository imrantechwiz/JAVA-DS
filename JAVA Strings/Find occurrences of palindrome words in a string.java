// split words of string then chek each word
import java.util.*;
class Main
{
static int countPalindrome(String str)
{
  		int c=0;
	String words[]=str.split("\\s");
	//System.out.print(words.length);
	for(int i=0;i<words.length;i++){
		int l=0,k=words[i].length()-1,flag=0;	
		String x=words[i];
		while(l<k){
			if(x.charAt(l)!=x.charAt(k)) { //start l from index 0 and k from last
				flag=1;
			}
			l++;
			k--;
		}
		if(flag==0) {
			c++;
		}
		flag=0;
	}
	 return c;
}
 public static void main(String[] args)
 {
  int t,i,j=0;
  String a;
  Scanner s=new Scanner(System.in);
  t=Integer.parseInt(s.nextLine().trim());
  while(t != 0)
  {
    a = s.nextLine().trim();
    j=countPalindrome(a);
    System.out.println(j);
    t--;
  }
 }
}
