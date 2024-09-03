package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 1 based index
public class dfsNew {
    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>();
        int n = 8;
        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<>());
        }

        adj.get(1).addAll(Arrays.asList(2, 3));
        adj.get(2).addAll(Arrays.asList(1, 5, 6));
        adj.get(3).addAll(Arrays.asList(1, 7, 4));
        adj.get(4).addAll(Arrays.asList(3, 8));
        adj.get(5).add(2);
        adj.get(6).add(2);
        adj.get(7).addAll(Arrays.asList(3, 8));
        adj.get(8).addAll(Arrays.asList(7, 4));
        System.out.println("dfs of graph is "+ dfs(adj,1,n));

    }
    static List<Integer> result = new ArrayList();
    static boolean[] visited = new boolean[9];
    private static List<Integer> dfs(List<List<Integer>> adj, int start, int n){

        result.add(start);
        visited[start] = true;
        for(int neighbor : adj.get(start)){
            if(!visited[neighbor]){
                dfs(adj,neighbor,n);
            }
        }
        return result;
    }
}
