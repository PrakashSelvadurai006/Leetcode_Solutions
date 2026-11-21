class Solution {
    int[] ans;
    ArrayList<Integer>[] adj;

    public int[] findSubtreeSizes(int[] parent, String s) {
        int n = parent.length;
        ans = new int[n];
        adj = new ArrayList[n];

        for(int i = 0; i < n; i++)
            adj[i] = new ArrayList<>();

        for(int i = 1; i < n; i++)
            adj[parent[i]].add(i);

        int[] last = new int[26];
        Arrays.fill(last, -1);

        int[] newParent = new int[n];

        dfs(0, parent, s, last, newParent);

        for(int i = 1; i < n; i++) {
            adj[parent[i]].remove(Integer.valueOf(i));
            adj[newParent[i]].add(i);
        }

        size(0);
        return ans;
    }

    void dfs(int node, int[] parent, String s,
             int[] last, int[] newParent) {

        int c = s.charAt(node) - 'a';
        int old = last[c];

        newParent[node] = old == -1 ? parent[node] : old;
        last[c] = node;

        for(int child : new ArrayList<>(adj[node]))
            dfs(child, parent, s, last, newParent);

        last[c] = old;
    }

    int size(int node) {
        int count = 1;

        for(int child : adj[node])
            count += size(child);

        return ans[node] = count;
    }
}