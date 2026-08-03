// Last updated: 8/3/2026, 11:35:05 AM
1class Solution {
2    public int fib(int n) {
3        if(n <= 1) return n;
4        
5        int curr = 0;
6        int prev = 1;
7        int prev2 = 0;
8
9        int i = 2;
10
11        while( i <= n){
12            curr = prev + prev2;
13            prev2 = prev;
14            prev = curr;
15            i++;
16        }
17
18        return curr;
19    }
20}