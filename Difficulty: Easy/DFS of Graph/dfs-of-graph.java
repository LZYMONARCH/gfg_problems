class Solution {

    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[adj.size()];

        dfsHelper(0, adj, vis, ans);

        return ans;
    }

    void dfsHelper(int node,ArrayList<ArrayList<Integer>> adj,boolean[] vis,ArrayList<Integer> ans) {

        vis[node] = true;
        ans.add(node);

        for (int nbr : adj.get(node)) {
            if (!vis[nbr]) {
                dfsHelper(nbr, adj, vis, ans);
            }
        }
    }
}