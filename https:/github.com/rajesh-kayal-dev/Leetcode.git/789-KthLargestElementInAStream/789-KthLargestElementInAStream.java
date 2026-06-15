// Last updated: 6/15/2026, 9:59:56 AM
class KthLargest {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;

        for(int i = 0; i < nums.length; i++){
            add(nums[i]);
        }
        
    }
    
    public int add(int val) {
        minHeap.add(val);

        //if minHeap is > k then remove smallest element
        if(minHeap.size() > k){
            minHeap.poll();
        }

        return minHeap.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */