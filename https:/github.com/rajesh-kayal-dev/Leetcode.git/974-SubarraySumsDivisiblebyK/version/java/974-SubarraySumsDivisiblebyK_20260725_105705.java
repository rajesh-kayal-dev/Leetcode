// Last updated: 7/25/2026, 10:57:05 AM
1class Solution {
2    public int subarraysDivByK(int[] nums, int k) {
3        int count = 0;
4        int sum = 0;
5        Map<Integer, Integer> map = new HashMap<>();
6
7        map.put(0, 1);
8        for(int i = 0; i < nums.length; i++){
9            sum += nums[i];
10            int rem = sum % k;
11            if(rem < 0){
12                rem += k;
13            }
14            if(map.containsKey(rem)){
15                count +=map.get(rem);
16            }
17            map.put(rem, map.getOrDefault(rem, 0)+1);
18        }
19    return count;
20    }
21}