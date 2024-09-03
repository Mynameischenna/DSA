package Graphs;

import java.util.*;
// used to find shortest distance where weight ranges between 1 to k
public class OneToKbfs {
    public static void main(String[] args) {
//        void oneToKBFS(Graph graph, int source, int k) {
//            int V = graph.numberOfVertices();
//            int[] dist = new int[V];
//            Arrays.fill(dist, Integer.MAX_VALUE);
//            dist[source] = 0;
//
//            // List of queues where each queue represents a distance mod k
//            List<Queue<Integer>> queues = new ArrayList<>(k + 1);
//            for (int i = 0; i <= k; i++) {
//                queues.add(new LinkedList<>());
//            }
//
//            queues.get(0).add(source);
//
//            for (int d = 0; d <= k; d++) {
//                while (!queues.get(d).isEmpty()) {
//                    int u = queues.get(d).poll();
//                    int current_distance = dist[u];
//
//                    for (Edge edge : graph.adjacentEdges(u)) {
//                        int v = edge.destination;
//                        int weight = edge.weight;
//                        int new_distance = current_distance + weight;
//
//                        if (new_distance < dist[v]) {
//                            dist[v] = new_distance;
//                            queues.get(new_distance % (k + 1)).add(v);
//                        }
//                    }
//                }
//            }
//        }

    }

}
