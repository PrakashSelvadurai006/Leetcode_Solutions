import java.util.*;

class Solution {
    int LOG;
    int[] tin, tout, dep, bit, pref;
    int[][] up;
    int timer;
    List<Integer>[] g;

    public List<Boolean> palindromePath(int n, int[][] edges, String s, String[] queries) {
        g = new ArrayList[n];
        for (int i = 0; i < n; i++) g[i] = new ArrayList<>();
        for (int[] e : edges) {
            g[e[0]].add(e[1]);
            g[e[1]].add(e[0]);
        }

        LOG = 1;
        while ((1 << LOG) <= n) LOG++;

        tin = new int[n];
        tout = new int[n];
        dep = new int[n];
        pref = new int[n];
        up = new int[LOG][n];
        bit = new int[n];

        char[] c = s.toCharArray();
        int[] st = new int[n], idx = new int[n];
        int top = 0;
        st[0] = 0;
        up[0][0] = 0;
        pref[0] = 1 << (c[0] - 'a');
        tin[0] = timer++;

        while (top >= 0) {
            int u = st[top];

            if (idx[top] < g[u].size()) {
                int v = g[u].get(idx[top]++);
                if (v == up[0][u] && u != 0) continue;
                if (u == 0 && v == 0) continue;

                up[0][v] = u;
                dep[v] = dep[u] + 1;
                pref[v] = pref[u] ^ (1 << (c[v] - 'a'));
                tin[v] = timer++;
                st[++top] = v;
                idx[top] = 0;
            } else {
                tout[u] = timer - 1;
                top--;
            }
        }

        for (int k = 1; k < LOG; k++)
            for (int i = 0; i < n; i++)
                up[k][i] = up[k - 1][up[k - 1][i]];

        List<Boolean> ans = new ArrayList<>();

        for (String q : queries) {
            String[] a = q.split(" ");
            int u = Integer.parseInt(a[1]);

            if (a[0].equals("update")) {
                int delta = (1 << (c[u] - 'a')) ^ (1 << (a[2].charAt(0) - 'a'));
                c[u] = a[2].charAt(0);
                rangeXor(tin[u], tout[u], delta);
            } else {
                int v = Integer.parseInt(a[2]);
                int l = lca(u, v);
                int m = (pref[u] ^ get(tin[u])) ^
                        (pref[v] ^ get(tin[v])) ^
                        (1 << (c[l] - 'a'));

                ans.add((m & (m - 1)) == 0);
            }
        }

        return ans;
    }

    int[] fen = new int[50005];

    void add(int i, int val) {
        for (i++; i < fen.length; i += i & -i)
            fen[i] ^= val;
    }

    void rangeXor(int l, int r, int val) {
        add(l, val);
        add(r + 1, val);
    }

    int get(int i) {
        int res = 0;
        for (i++; i > 0; i -= i & -i)
            res ^= fen[i];
        return res;
    }

    int lca(int u, int v) {
        if (dep[u] < dep[v]) {
            int t = u; u = v; v = t;
        }

        int d = dep[u] - dep[v];
        for (int k = 0; k < LOG; k++)
            if ((d & (1 << k)) != 0) u = up[k][u];

        if (u == v) return u;

        for (int k = LOG - 1; k >= 0; k--) {
            if (up[k][u] != up[k][v]) {
                u = up[k][u];
                v = up[k][v];
            }
        }

        return up[0][u];
    }
}