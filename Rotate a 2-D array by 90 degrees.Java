
import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int cases=sc.nextInt();
      int c=0,i,j,k;
    for(i=0;i<cases;i++){
	   int ca=sc.nextInt();
       int a[][]=new int[ca][ca];
      for(j=0;j<ca;j++){
     	   for(k=0;k<ca;k++){
             a[j][k]=sc.nextInt();
           }
      }
      //20 10 00 These are index of 90 degree
      //21 11 01
      //22 12 02
      while(c!=ca){ //number of rows
      for(j=ca-1;j>=0;j--){ // loop starting from 2 to 0 index
        
          System.out.print(a[j][c]+" ");
       }
        System.out.println();
        c++;
      }
      System.out.println();
     // System.out.println();
      c=0;
    }
  }
}
