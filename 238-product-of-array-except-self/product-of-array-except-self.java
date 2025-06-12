class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] result = new int[n];

        //nums=[1,2,3,4]

        //result[1] = result[0] * nums[0] 
        //1*1=1,1*2=2,2*3=6
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        //result=[1,1,2,6]
        int right = 1;

        for(int i = n-1;i >= 0; i-- ){
            result[i] = result[i] * right;
            right = right * nums[i];
        }
        //n=3>0 
           //result[3]= 6 * 1 = 6, right = 1 * 4 = 4(right)
                // [2]=2 * 4 =8, right = 4 * 3 = 12
                // [1]=1 * 12 =12, right = 12 * 2 = 24
                // [0]=1 * 24 =24, right = 24 * 1 = 24

        return result;
    }
}  
