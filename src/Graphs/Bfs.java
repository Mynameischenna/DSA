package Graphs;

import java.util.*;

public class Bfs {
    public static void main(String[] args) {
        // 1-based index graph
        int n = 5;
        List<List<Integer>> graph = new ArrayList<>(n + 1);

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(1).addAll(Arrays.asList(2, 3));
        graph.get(2).addAll(Arrays.asList(1, 4, 3));
        graph.get(3).addAll(Arrays.asList(1, 5, 2));
        graph.get(4).addAll(Arrays.asList(2, 5));
        graph.get(5).addAll(Arrays.asList(3, 4));

        System.out.println(bfs(graph, n, 1));  // Start BFS from node 1
    }

    private static List<Integer> bfs(List<List<Integer>> graph, int n, int startNode) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];

        queue.offer(startNode);
        visited[startNode] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            result.add(node);

            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
        return result;
    }
}
