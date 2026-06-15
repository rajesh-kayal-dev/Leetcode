// Last updated: 6/15/2026, 10:00:13 AM
class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int[] parent = new int[n + 1];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        for(int[] e : edges ){
            int u = e[0];
            int v = e[1];

            int pu = find(parent, u);//root u 
            int pv = find(parent, v); //root v

            if(pu == pv){
                return e;
            }

            parent[pu] = pv;
        }
        return new int[0];
    }

    private int find(int[] parent, int x){
        if(parent[x] != x){
            parent[x] = find(parent, parent[x]);
        }
        return parent[x];
    }
}