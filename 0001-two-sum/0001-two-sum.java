class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i < nums.length;i++){
            int compliments = target - nums[i];
            if(map.containsKey(compliments)){

                return new int[]{map.get(compliments), i};
            }

        map.put(nums[i],i);
        }
        return new int[]{};
    }
}