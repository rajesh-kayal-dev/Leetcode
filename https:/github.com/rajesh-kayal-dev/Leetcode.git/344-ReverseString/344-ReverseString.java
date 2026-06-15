// Last updated: 6/15/2026, 10:00:40 AM
class Solution {
    public void reverseString(char[] s) {
        // int n =s.length -1;
        // for(int i =0;i<=n;i++){
        //     char temp = s[i];
        //     s[i]=s[n];
        //     s[n]=temp;
        //     n--;
        // }



        int start =0;
        int end = s.length -1;
        while( start <= end){
            char temp = s[start];
            s[start]=s[end];
            s[end]=temp;
            start ++;
            end --;
        }
    }
}