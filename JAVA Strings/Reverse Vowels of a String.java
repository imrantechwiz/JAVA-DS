/*
Problem URL https://leetcode.com/problems/reverse-vowels-of-a-string/
*/

class Solution {
    public String reverseVowels(String s) {
        int l=0;
        int r=s.length()-1;
        char a[]=s.toCharArray();
        while(l<r){
            if(checkvowel(a[l]) && checkvowel(a[r])){
                char x=a[l];
                a[l]=a[r];
                a[r]=x;
                l++;
                r--;
            }
            if(!checkvowel(a[l])){
                l++;
            }
            if(!checkvowel(a[r])){
                r--;
            }
        }
        return new String(a);
    }
    boolean checkvowel(char x){
        if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u' || x=='A' || x=='E'|| x=='I'|| x=='O' ||  x=='U'){
            return true;
        }else{
            return false;
        }
    }
}
