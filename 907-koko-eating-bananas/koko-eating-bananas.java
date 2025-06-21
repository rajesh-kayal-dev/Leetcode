class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //find max
        int max = 0;
        for(int pile : piles){
            max = Math.max(max, pile);
        }

        //apply binary search
        int low = 1;
        int high = max;
        int result = high;
        while(low <= high){
            int mid = low + (high - low) /2;
            //calculate total hours

            int TotalHour = totalHours(piles, mid);

            if(TotalHour <= h){
                result = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return result;
    }

    private int totalHours(int piles[], int k){
        int hours = 0;
        for(int pile : piles){
            hours += Math.ceil((double)pile / k);
        }
        return hours;
    }
}