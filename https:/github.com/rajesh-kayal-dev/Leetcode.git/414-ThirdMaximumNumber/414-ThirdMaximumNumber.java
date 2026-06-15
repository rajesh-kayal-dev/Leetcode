// Last updated: 6/15/2026, 10:00:30 AM
class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int[] res = new int[set.size()];
        int idx =0;

        for(int i : set){
            res[idx++] = i;
        }
        Arrays.sort(res);

        if(res.length < 3){
            return res[res.length -1];
        }

        return res[res.length-3];
    }
}