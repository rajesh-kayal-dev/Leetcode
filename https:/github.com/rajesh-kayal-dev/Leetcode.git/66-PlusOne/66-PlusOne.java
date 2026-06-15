// Last updated: 6/15/2026, 10:02:49 AM
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n -1; i>=0;i--){
            if(digits[i] != 9){ //9 nehi hai to increment karo 
                digits[i]++;
                break;
            }else{//9 hai to 0 kardo
                digits[i] =0;
            }
        }

        if(digits[0] == 0){
            int[] res = new int[n+1];
            res[0] =1;
            return res;
        }
        return digits;
    }
}