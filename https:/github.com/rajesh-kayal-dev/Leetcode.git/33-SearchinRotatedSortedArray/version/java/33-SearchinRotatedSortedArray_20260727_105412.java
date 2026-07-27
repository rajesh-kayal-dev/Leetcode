// Last updated: 7/27/2026, 10:54:12 AM
1class Solution {
2    public int search(int[] nums, int target) {
3        int low = 0;
4        int high = nums.length - 1;
5
6        while(low <= high){
7            int mid = low + (high - low)/2;
8
9            if(nums[mid] == target){
10                return mid;
11            }else if(nums[low] <= nums[mid]){
12
13                if(nums[low] <= target && target < nums[mid]){
14                high = mid - 1;
15                }
16                else{
17                low = mid + 1;
18                }
19            }else{
20                if(nums[mid] <= target && target <= nums[high]){
21                low = mid + 1;
22                }
23                else{
24                high = mid - 1;
25                }
26            }
27        }
28        return -1;
29    }
30}