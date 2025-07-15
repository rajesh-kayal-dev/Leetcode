class Solution {
    public int climbStairs(int n) {
        // Base case: 1 step → 1 way, 2 steps → 2 ways
        if (n <= 2) return n;

        // f(1) = 1, f(2) = 2
        int oneStepBefore = 2;  // f(n-1)
        int twoStepBefore = 1;  // f(n-2)
        int totalSteps = 0;

        // Loop from step 3 to step n
        for (int i = 3; i <= n; i++) {
            totalSteps = oneStepBefore + twoStepBefore;
            twoStepBefore = oneStepBefore;  
            oneStepBefore = totalSteps;      
        }

        return totalSteps;
    }
}
