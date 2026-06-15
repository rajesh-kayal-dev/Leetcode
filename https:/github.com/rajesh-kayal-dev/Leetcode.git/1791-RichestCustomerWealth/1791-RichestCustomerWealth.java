// Last updated: 6/15/2026, 9:59:17 AM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maximumWealth = 0;
        for(int i =0;i<accounts.length;i++){
            int sum = 0;
            for(int j=0;j<accounts[i].length;j++){
                sum += accounts[i][j];
            }
            if(maximumWealth < sum){
                maximumWealth=sum;
            }
        }
        return maximumWealth;
    }
}