// Last updated: 6/15/2026, 9:59:22 AM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int ans = numBottles;

        while(numBottles >= numExchange){

            int newBottles = numBottles / numExchange;
            int remBottles = numBottles % numExchange;

            ans= ans + newBottles;

            numBottles = newBottles + remBottles;
        }

        return ans;
    }
}