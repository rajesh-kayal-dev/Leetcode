// Last updated: 6/15/2026, 10:00:36 AM
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map < Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int num1 : nums1){
            map.put(num1, map.getOrDefault(num1, 0) +1);
        }

        for(int num2 : nums2){
            if(map.containsKey(num2) && map.get(num2) > 0){
                list.add(num2);
                map.put(num2, map.get(num2) - 1);
            }
        }

        int[] result = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }

        return result;
    }
}