// Last updated: 7/29/2026, 10:12:44 AM
1import java.util.*;
2
3class Solution {
4    public int orangesRotting(int[][] g) {
5        Queue<int[]> q = new LinkedList<>();
6        int fresh = 0, time = 0;
7        int[][] d = {{1,0},{-1,0},{0,1},{0,-1}};
8
9        for (int i = 0; i < g.length; i++)
10            for (int j = 0; j < g[0].length; j++) {
11                if (g[i][j] == 2) q.offer(new int[]{i,j});
12                else if (g[i][j] == 1) fresh++;
13            }
14
15        while (!q.isEmpty() && fresh > 0) {
16            for (int k = q.size(); k > 0; k--) {
17                int[] c = q.poll();
18                for (int[] x : d) {
19                    int r = c[0] + x[0], col = c[1] + x[1];
20                    if (r >= 0 && r < g.length && col >= 0 && col < g[0].length && g[r][col] == 1) {
21                        g[r][col] = 2;
22                        fresh--;
23                        q.offer(new int[]{r, col});
24                    }
25                }
26            }
27            time++;
28        }
29        return fresh == 0 ? time : -1;
30    }
31}