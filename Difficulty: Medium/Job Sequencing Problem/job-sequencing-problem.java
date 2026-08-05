class Solution {

    int find(int[] parent, int x) {
        if (parent[x] != x) {
            parent[x] = find(parent, parent[x]);
        }
        return parent[x];
    }

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {

        int n = deadline.length;

        int[][] jobs = new int[n][2];
        int max = 0;

        for (int i = 0; i < n; i++) {
            jobs[i][0] = deadline[i];
            jobs[i][1] = profit[i];
            max = Math.max(max, deadline[i]);
        }

        Arrays.sort(jobs, (a, b) -> b[1] - a[1]);

        int[] parent = new int[max + 1];

        for (int i = 0; i <= max; i++) {
            parent[i] = i;
        }

        int count = 0;
        int total = 0;

        for (int i = 0; i < n; i++) {

            int slot = find(parent, jobs[i][0]);

            if (slot > 0) {
                count++;
                total += jobs[i][1];
                parent[slot] = find(parent, slot - 1);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(count);
        ans.add(total);

        return ans;
    }
}