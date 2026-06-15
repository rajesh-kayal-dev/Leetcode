// Last updated: 6/15/2026, 10:00:39 AM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map =  new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
            //[1,1,2,3,1] → freqMap: {1=3, 2=1, 3=1}
        }
        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap = 
        new PriorityQueue<>((a,b)-> b.getValue() - a.getValue());

        //Max Heap (PriorityQueue)— based on frequency:
        //Highest frequency sabse pehle aaye
        //Custom comparator  b.getValue() - a.getValue() ke through.

        maxHeap.addAll(map.entrySet());
        //heap mein sab elements sorted hain by highest frequency

        int result[] = new int[k];
        // result array banaya gaya hai jisme hum top k elements store kareng

        for(int i =0; i < k; i++){
            result[i] = maxHeap.poll().getKey();//poll() → heap ka top element nikalta hai (highest freq)
        }
        return result;
    }
}
