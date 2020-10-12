import java.util.Scanner;
class Result
{
  static String removeAllDups(String str1)
  {
    int k=0;
    char a[]=str1.toCharArray();
    char b[]=new char[a.length]; // create a another array;
    for(int i=0;i<a.length;i++){ // go through each element 
		int z=check(a[i],b,k); //check if the char is present in new array or not 
      if(z==1){
        b[k++]=a[i];
      }
    }
    String s=new String(b);
    return s.trim();
  }
  static int check(char x,char b[],int k){
    for(int i=0;i<k;i++){
      if(x==b[i]){
        return 0;
      }
    }
    return 1;   //if not present return 1 then add into it
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
      System.out.println(Result.removeAllDups(a));
    }
    scan.close();
  }
}
