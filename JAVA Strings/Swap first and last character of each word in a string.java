import java.util.Scanner;
class Result
{
  static String swapFirstLastChar(String str)
  {
    char a[]=str.toCharArray();
    for(int i=0;i<a.length;i++){
      int k=i;
      while(i<a.length && a[i]!=' '){ // find space and increment i till space 
        i++;
      }
      char temp=a[i-1];
        a[i-1]=a[k];
        a[k]=temp;
    }
    String s=new String(a);
    return s;
  }
}
class Main
{
  public static void main(String[] args)
  {
    int t,i,j=0;
    String a, b;
    Scanner s=new Scanner(System.in);
    t=Integer.parseInt(s.nextLine());
    while(t != 0)
    {
      a = s.nextLine();
      b=Result.swapFirstLastChar(a);
      System.out.println(b);
      t--;
    }
  }
}
