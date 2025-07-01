class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());//Max Heap

        //add stone int heap
        for(int stone : stones){
            maxHeap.add(stone);
        }

        //process until 1 or 0 stone left
        while(maxHeap.size() > 1){
           int stone1 = maxHeap.poll(); //heviest
           int stone2 = maxHeap.poll(); //second heviest

           if(stone1 != stone2){
            maxHeap.add( stone1 - stone2);
           }
           //if equal destory both stone -> do nothing
        }
        // Return last stone or 0 if empty
        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}
