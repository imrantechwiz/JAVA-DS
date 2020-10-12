/*
3
Helleo
bye
hellocoderredocobyepip

elle

ocoderredoco
*/

import java.util.Scanner;
class Result
{
 static String longestPalindrome(String str)
  {
    if(str==null || str.length()<1){
      return "";
    }
    int start=0,end=0;
    for(int i=0;i<str.length();i++){
      int len1=check(str,i,i); // for odd palindrome
      int len2=check(str,i,i+1); // for even
      int len=Math.max(len1,len2);
      if(len>end-start){
        start=i-(len-1)/2;
        end=i+len/2;
      }
    }
   String x= str.substring(start,end+1);
    if(x.length()>1){
      return x;
    }else{
      return "";
}
  }
 static int check(String s,int left ,int right){
    if(s==null || left>right){
      return 0;
    }
    while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
      left--;
      right++;
    }
    return (right-left-1);
  }
}
class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int t;
    t=Integer.parseInt(scan.nextLine().trim());
    while(t>0)
    {
      t--;
      String a = scan.nextLine().trim();
      System.out.println(Result.longestPalindrome(a));
    }
    scan.close();
  }
}
