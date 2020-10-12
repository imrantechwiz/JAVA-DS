
package prac;
import java.util.*;
public class stringsprac4 {
	 public static void main(String[] args)
	 {
	  int t,i,j=0;
	  String a, b;
	  Scanner s=new Scanner(System.in);
	  t=Integer.parseInt(s.nextLine());
	  while(t != 0)
	  {
	    a = s.nextLine();
	    b=capitalizeFirstChar(a);
	    System.out.println(b);
	    t--;
	  }
	 }
	 static String capitalizeFirstChar(String str)
	 {
	   char a[]=str.toCharArray();
	   for(int i=0;i<a.length;i++){
	     int k=i;
	     while(i<a.length && a[i]!=' '){
	       i++;
	     }
	     a[k]=Character.toUpperCase(a[k]);
	   }
	   String s=new String(a);
	   return s;
	 }

}
