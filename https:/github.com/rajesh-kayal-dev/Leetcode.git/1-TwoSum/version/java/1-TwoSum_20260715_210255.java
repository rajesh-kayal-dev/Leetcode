// Last updated: 7/15/2026, 9:02:55 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4
5        for(int i = 0; i < nums.length; i++){
6            int compliment = target - nums[i];
7            if(map.containsKey(compliment)){
8                return new int[]{map.get(compliment), i};
9            }
10            map.put(nums[i], i);
11        }
12        return new int[0];
13    }
14}