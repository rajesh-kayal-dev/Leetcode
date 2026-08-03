// Last updated: 8/3/2026, 10:36:56 AM
1class Solution {
2    public int fib(int n) {
3        
4        if(n <= 1) return n;
5
6        return fib(n-1) + fib(n- 2);
7    }
8}