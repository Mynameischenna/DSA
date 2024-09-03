package Graphs;

import java.util.*;

public class DijkstrasDemo {
    public static void main(String[] args) {
        int n = 5;// 5 nodes

        // Graph represented as an adjacency list
        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        // Add edges (node, weight)
        graph[0].add(new int[]{1, 4});
        graph[0].add(new int[]{2, 2});
        graph[1].add(new int[]{2, 5});
        graph[1].add(new int[]{3, 10});
        graph[2].add(new int[]{4, 3});
        graph[4].add(new int[]{3, 4});

        int start = 0;
        // find the shortest distance to all nodes fromm source 0
        int[] distances = dijkstra(n, graph, start);

        // Print the shortest distances from the start node
        for (int i = 0; i < n; i++) {
            System.out.println("Shortest distance from node " + start + " to node " + i + " is " + distances[i]);
        }
    }

    private static int[] dijkstra(int n, List<int[]>[] graph, int start) {
        // distance array
        int[] distances = new int[n];
        Arrays.fill(distances,Integer.MAX_VALUE);
        distances[start] = 0;

        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparing(a -> a[1]));
        queue.offer(new int[]{start, 0});

        while(!queue.isEmpty()){
            int[] node = queue.poll(); // always polls next node whose distance is smaller
            int cNode = node[0];
            int cWeight = node[1];

            if(cWeight > distances[cNode]) continue;

            // explore
            for(int[] neighbor : graph[cNode]){
                int neNode = neighbor[0];
                int neWeight = neighbor[1];
                int newWeight = distances[cNode] + neWeight;

                if(newWeight < distances[neNode]){
                    distances[neNode] = newWeight;
                    queue.offer(new int[]{neNode, distances[neNode]});
                }
            }
        }
        return distances;

    }
}
