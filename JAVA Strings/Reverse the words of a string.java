/*
2
Code Quotient Loves Code
Hello Coders

edoC tneitouQ sevoL edoC
olleH sredoC
*/
import java.util.Scanner;
class Result {
  static void revWordsString(String str){
   char a[]=str.toCharArray();
   for(int i=0;i<a.length;i++){
     int pos=i;
     while(i<a.length && a[i]!=' '){
       i++;
     }                                                //increment i until space is not found
     int l=pos,k=i-1;
     while(l<k){                                       //then start from first and last index
       char temp=a[l];
       a[l]=a[k];
       a[k]=temp;
       l++;
       k--;
     }
   }
    for(char x: a){
      System.out.print(x);
    }
  }
}

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int t,i,j=0;
    t = Integer.parseInt(s.nextLine().trim());
    String str;
    while(t-- > 0)
    {
      str = s.nextLine();
      Result.revWordsString(str);
      System.out.println();
    }
  }
}
