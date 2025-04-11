class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n-1;i>=0;i--){//since we need to manipulate last digite so start from last
            if(digits[i] < 9){//didgits agar 9 se kam hai to increment kardo
                digits[i]++;
                return digits;
            }
            digits[i]=0;//if digits is 9 then set 0
        }
        //if all digits 999 arr size ko increse kardo alredy code 9=0 so add 1 first 
        int result []= new int[n +1];
        result[0]=1; //1000
        return result;
    }
}