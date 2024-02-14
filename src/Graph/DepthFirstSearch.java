package Graph;

import java.util.ArrayList;

public class DepthFirstSearch {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);

        DepthFirstSearch sl = new DepthFirstSearch();
        ArrayList<Integer> ans = sl.dfsOfGraph(5, adj);
        int n = ans.size();
        for (int i = 0; i < n; i++) {
            System.out.print(ans.get(i) + " ");
        }

    }
    public  static ArrayList<Integer> dfsOfGraph ( int V, ArrayList<ArrayList<Integer>>adj){
        boolean visited[] = new boolean[V + 1];
        visited[0] = true;
        ArrayList<Integer> result = new ArrayList<>();
        dfs(0, visited, adj, result);
        return result;
    }


    public static void dfs( int node, boolean visited[], ArrayList<ArrayList<Integer>>adj, ArrayList <Integer> result){

        visited[node] = true;
        result.add(node);

        for (Integer it : adj.get(node)) {
            if (visited[it] == false) {
                dfs(it, visited, adj, result);
            }
        }
    }

}



