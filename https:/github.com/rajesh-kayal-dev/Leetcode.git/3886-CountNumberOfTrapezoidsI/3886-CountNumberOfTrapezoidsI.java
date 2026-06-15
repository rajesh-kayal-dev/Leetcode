// Last updated: 6/15/2026, 9:59:03 AM
class Solution {
    public int countTrapezoids(int[][] points) {
        int MOD = 1_000_000_007;

        Map<Integer, Integer> map = new HashMap<>();
        for (int[] p : points) {
            int y = p[1];
            map.put(y, map.getOrDefault(y, 0) + 1);
        }

        List<Long> combs = new ArrayList<>();
        for (int cnt : map.values()) {
            if (cnt >= 2) {
                long c = (long) cnt * (cnt - 1) / 2;
                combs.add(c);
            }
        }

        long total = 0;
        long suffixSum = 0;

        for (long c : combs) {
            suffixSum = (suffixSum + c) % MOD;
        }

        for (long c : combs) {
            suffixSum = (suffixSum - c + MOD) % MOD;
            total = (total + c * suffixSum % MOD) % MOD;
        }

        return (int) total;
    }
}
