class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a,b) -> distance(b) - distance(a)
        );

        for(int[] point : points){
                maxHeap.add(point);


            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        
        int[][] result = new int[k][2];
        int i =0;
        
        for(int[] point : maxHeap){
            result[i++] = point;
        }

        return result;
    }

    private int distance(int[] points){
        return points[0] * points[0] + points[1] * points[1];
    }
}