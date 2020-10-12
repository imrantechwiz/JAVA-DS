/*
aaabccddd
abd

aa
Empty

abba
Empty
*/



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
      Scanner sc=new Scanner(System.in);
      String x=sc.nextLine();
      char stack[]=new char[x.length()];
      int k=0;
      for(int i=0;i<x.length();i++){
            if(k>0 && stack[k-1]==x.charAt(i)){
                k--;
            }else{
                stack[k++]=x.charAt(i);
            }
      }
      String s=new String(stack,0,k);
      if(s.length()==0){
          System.out.println("Empty String");
      }else{
        System.out.println(s);
      }
      
    }
}
