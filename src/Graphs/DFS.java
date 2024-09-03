package Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// finding dfs and no of connected components
public class DFS {
    public static void main(String[] args) {
        int V = 6; // Number of vertices
        List<List<Integer>> adj = new ArrayList<>(V);

        // Initialize adjacency lists
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges to the graph
//        0-1  3-4
//        |      |
//        2      5
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 3, 4);
        addEdge(adj, 4, 5);
//        System.out.println(adj);
        ConnComp(adj);
    }

    private static void addEdge(List<List<Integer>> adj, int i, int i1) {
        adj.get(i).add(i1);
        adj.get(i1).add(i);
    }
    private static void ConnComp(List<List<Integer>> adj){
        int n = adj.size();
        int count = 0;
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i ++){
            if(!visited[i]){// if it false call dfs
                dfs(adj,i,visited);
                count++;
            }
        }
        System.out.println("no of connected components are "+count);
    }
    // dfs with adjacency matrix
    private static void dfs(List<List<Integer>> adj, int node, boolean[] visited) {
        Stack<Integer> stack = new Stack<>();
        stack.push(node);
        visited[node] = true;

        while(!stack.isEmpty()){
            int curr = stack.pop();
            for(int i : adj.get(curr)){
                if(!visited[i]){
                    stack.push(i);
                    visited[i] = true;
                }
            }
        }

    }
    // Function to perform DFS and visit all nodes and dfs with adjacency matrix
    public void dfs(int[][] adjMatrix, boolean[] visited, int start) {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        visited[start] = true;

        while (!stack.isEmpty()) {
            int node = stack.pop();
            System.out.println("Visited: " + node);

            for (int i = 0; i < adjMatrix[node].length; i++) {
                if (adjMatrix[node][i] == 1 && !visited[i]) {
                    stack.push(i);
                    visited[i] = true;
                }
            }
        }
    }

}
