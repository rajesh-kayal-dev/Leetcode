// Last updated: 7/25/2026, 10:15:07 AM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int count = 0;
4        int sum = 0;
5        Map<Integer, Integer> map = new HashMap<>();
6        map.put(0,1);
7        for(int i = 0; i < nums.length; i++){
8            sum += nums[i];
9            if(map.containsKey(sum - k)){
10                count += map.get(sum - k);
11            }
12            map.put(sum,map.getOrDefault(sum, 0) + 1);
13        }
14        return count;
15    }
16}