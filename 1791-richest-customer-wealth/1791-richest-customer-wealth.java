class Solution {
    public int maximumWealth(int[][] accounts) {
        int maximumWealth = 0;
        for(int[] account : accounts){
            int sum = 0;
            for(int amt : account){
                sum += amt;
            }
            if(maximumWealth < sum){
                maximumWealth=sum;
            }
        }
        return maximumWealth;
    }
}