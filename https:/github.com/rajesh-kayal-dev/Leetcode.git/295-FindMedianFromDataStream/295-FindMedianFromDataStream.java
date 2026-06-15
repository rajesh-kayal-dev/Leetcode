// Last updated: 6/15/2026, 10:00:50 AM
class MedianFinder {
        PriorityQueue<Integer> maxHeap; //left half(smallest element)
        PriorityQueue<Integer> minHeap; //right half(largest element)
    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        maxHeap.add(num);

        //Ensure every num of maxHeap <= every num of minHeap
        minHeap.offer(maxHeap.poll());

        //balenced the size of maxHeap and minPeap

        if(maxHeap.size() < minHeap.size()){
            maxHeap.offer(minHeap.poll());
        }
        
    }
    
    public double findMedian() {
        if(maxHeap.size() == minHeap.size()){
            return (maxHeap.peek() + minHeap.peek())/2.0;
        }else{
            return maxHeap.peek();
        }
        
    }
}


/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */