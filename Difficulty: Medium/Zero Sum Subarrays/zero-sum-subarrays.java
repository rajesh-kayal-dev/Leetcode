class Solution {
    public int findSubarray(int[] arr) {
        int prefixSum = 0;
        int total = 0;
        Map <Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        for(int i = 0; i < arr.length; i++){
            prefixSum += arr[i];
            
            if(map.containsKey(prefixSum)){
               total += map.get(prefixSum);
               
              map.put(prefixSum, map.get(prefixSum) + 1);
            }else{
                map.put(prefixSum, 1);
            }
        }
        return total;
        
    }
}
