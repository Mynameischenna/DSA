package Graphs;

import java.util.ArrayList;
import java.util.Stack;

public class Cycle {
    public static void main(String[] args) {
        // just replace stack with queue it become bfs, remaining same.
    }
    boolean[] visited;
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        visited = new boolean[V];

        // Check each node in case the graph is disconnected
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(adj, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(ArrayList<ArrayList<Integer>> adj,int start) {
        Stack<int[]> stack = new Stack();
        stack.push(new int[]{start, -1});
        visited[start] = true;

        while (!stack.isEmpty()) {
            int[] curr = stack.pop();

            int node = curr[0];
            int parent = curr[1];

            for (int i : adj.get(node)) {
                if (!visited[i]) {
                    stack.push(new int[]{i, node});
                    visited[i] = true;
                } else if (parent != i) return true;
            }
        }
        return false;
    }

}
