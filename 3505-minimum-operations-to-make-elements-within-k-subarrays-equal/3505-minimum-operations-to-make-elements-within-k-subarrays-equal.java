
import java.util.*;

class Solution {
    public long minOperations(int[] nums, int x, int k) {
        int n = nums.length;
        long[] cost = new long[n - x + 1];

        TreeMap<Integer, Integer> l = new TreeMap<>();
        TreeMap<Integer, Integer> r = new TreeMap<>();

        long ls = 0, rs = 0;
        int lc = 0, rc = x;

        for (int i = 0; i < x; i++) {
            r.put(nums[i], r.getOrDefault(nums[i], 0) + 1);
            rs += nums[i];
        }

        for (int i = 0; i < x / 2; i++) {
            int v = r.lastKey();
            r.put(v, r.get(v) - 1);
            if (r.get(v) == 0) r.remove(v);
            rs -= v;
            rc--;

            l.put(v, l.getOrDefault(v, 0) + 1);
            ls += v;
            lc++;
        }

        for (int i = 0; i <= n - x; i++) {
            int m = r.lastKey();
            cost[i] = (long)m * rc - rs + ls - (long)m * lc;

            if (i == n - x) break;

            int v = nums[i];

            if (l.containsKey(v)) {
                l.put(v, l.get(v) - 1);
                if (l.get(v) == 0) l.remove(v);
                ls -= v;
                lc--;
            } else {
                r.put(v, r.get(v) - 1);
                if (r.get(v) == 0) r.remove(v);
                rs -= v;
                rc--;
            }

            v = nums[i + x];
            r.put(v, r.getOrDefault(v, 0) + 1);
            rs += v;
            rc++;

            while (lc < x / 2) {
                v = r.lastKey();
                r.put(v, r.get(v) - 1);
                if (r.get(v) == 0) r.remove(v);
                rs -= v;
                rc--;

                l.put(v, l.getOrDefault(v, 0) + 1);
                ls += v;
                lc++;
            }

            while (lc > x / 2) {
                v = l.firstKey();
                l.put(v, l.get(v) - 1);
                if (l.get(v) == 0) l.remove(v);
                ls -= v;
                lc--;

                r.put(v, r.getOrDefault(v, 0) + 1);
                rs += v;
                rc++;
            }

            while (!l.isEmpty() && !r.isEmpty()
                    && l.firstKey() < r.lastKey()) {
                int a = l.firstKey();
                int b = r.lastKey();

                l.put(a, l.get(a) - 1);
                if (l.get(a) == 0) l.remove(a);

                r.put(b, r.get(b) - 1);
                if (r.get(b) == 0) r.remove(b);

                l.put(b, l.getOrDefault(b, 0) + 1);
                r.put(a, r.getOrDefault(a, 0) + 1);

                ls += (long)b - a;
                rs += (long)a - b;
            }
        }

        long inf = Long.MAX_VALUE / 4;
        long[][] dp = new long[k + 1][n + 1];

        for (long[] row : dp) Arrays.fill(row, inf);

        Arrays.fill(dp[0], 0);

        for (int j = 1; j <= k; j++) {
            for (int i = x; i <= n; i++) {
                dp[j][i] = Math.min(dp[j][i - 1],
                    dp[j - 1][i - x] + cost[i - x]);
            }
        }

        return dp[k][n];
    }
}
