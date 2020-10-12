/*
Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
*/

import java.util.*;
class Result
{
  static int longestUniqueSubstr(String str, int k)
  {
    HashSet<Character> h=new HashSet<Character>();
    int lp=0,rp=0,max=0;
    while(rp<str.length()){
      if(!h.contains(str.charAt(rp))){
        h.add(str.charAt(rp));
        max=Math.max(h.size(),max);
        rp++;
      }else{
        h.remove(str.charAt(lp));
        lp++;
      }
    }
    return max;
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int t;
    t = Integer.parseInt(scan.nextLine().trim());
    while(t>0)
    {
      t--;
      String a = scan.nextLine().trim();
      int i = Integer.parseInt(scan.nextLine().trim());
      System.out.println(Result.longestUniqueSubstr(a));
    }
    scan.close();
  }
}
