package Graphs;

import java.util.*;

public class Dijkstra {
    public static void main(String[] args) {
        Dijkstra dj = new Dijkstra();
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

        // Starting node (A is node 0)
        int start = 0;

        int[] distances = dj.dijkstra(n, graph, start);

        // Print the shortest distances from the start node
        for (int i = 0; i < n; i++) {
            System.out.println("Shortest distance from node " + start + " to node " + i + " is " + distances[i]);
        }
    }

    private int[] dijkstra(int n, List<int[]>[] graph, int start) {
        int[] distance = new int[n];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[0] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1])); // Min-heap
        pq.offer(new int[]{start, 0}); // Add start node to the priority queue

        while(!pq.isEmpty()){
            int[] current = pq.poll();
            int node = current[0];
            int weight = current[1];

            if(weight > distance[node]) continue;

            for(int[] neighbor : graph[node]){
                int neNode = neighbor[0];
                int neWeight = neighbor[1];
                int newWeight = distance[node] + neWeight;
                if(newWeight < distance[neNode]){
                    distance[neNode] = newWeight;
                    pq.offer(new int[]{neNode,distance[neNode]});
                }
            }
        }
    return distance;
    }

}
