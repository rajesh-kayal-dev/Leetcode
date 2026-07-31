// Last updated: 7/31/2026, 11:04:47 AM
1class Solution {
2    private static int binarySearch(int[] nums, int target, boolean flag){
3        int start = 0, end = nums.length -1;
4        int res = -1;
5        while(start <= end){
6            int mid = start + (end - start) /2;
7            if(nums[mid] == target){
8                res = mid;
9
10                if(!flag) {
11                    start = mid + 1;
12                }else{
13                    end = mid -1;
14                }
15
16            }else if(nums[mid] < target){
17                start = mid +1;
18            }else{
19                end = mid - 1;
20            }
21        }
22        return res;
23    }
24    public int[] searchRange(int[] nums, int target) {
25        int[] res = new int[2];
26        res[0] = binarySearch(nums, target, true);
27        res[1] = binarySearch(nums, target, false);
28        return res;
29    }
30
31}