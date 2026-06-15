// Last updated: 6/15/2026, 10:00:24 AM
class Solution {
    public void swap(int i , int j , int nums[]){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int n = arr.length;
        int i =0;
        while(i<n){
            int ele = arr[i];
            if(ele<=0 || ele ==i+1 || ele==arr[ele-1]) i++;
            else swap(i,ele-1,arr);
        }

         List<Integer> missingNumbers = new ArrayList<>();
        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                missingNumbers.add(i + 1);
            }
        }

        return missingNumbers;
    }
}