class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freaq = new int[26];
        //count freq of each task
        for(int task : tasks){
            freaq[task - 'A']++;
        }

        //count Maxfreq of each task
        int maxFreq = 0;
        for(int f : freaq){
            maxFreq= Math.max(maxFreq,f);
        }

        //count howment task have Maxfreq
        int maxCount = 0;
        for(int f : freaq){
            if(f == maxFreq){
                maxCount++;
            }
        }
        //formula

        // Apply formula
        int partCount = maxFreq - 1;
        int partLength = n - (maxCount - 1);
        int emptySlots = partCount * partLength;
        int availableTasks = tasks.length - maxFreq * maxCount;
        int idles = Math.max(0, emptySlots - availableTasks);

        return tasks.length + idles;
    }
}
