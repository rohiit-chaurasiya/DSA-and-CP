import java.util.*;

public class amp {
    public static void main(String[] args) {
        int n = 5;
        int[][] graph = new int[n][n];

        addEdge(graph, 1, 2);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 4);
        addEdge(graph, 3, 2);
        addEdge(graph, 3, 4);
        int K = 3;
        int uprightNodes = countUprightNodes(graph, K);
        System.out.println("Number of upright nodes: " + uprightNodes);
    }

    public static void addEdge(int[][] graph, int u, int v) {
        graph[u][v] = 1;
        graph[v][u] = 1;
    }

    public static int countUprightNodes(int[][] graph, int K) {
        int V = graph.length;
        int uprightNodes = 0;
        for (int i = 0; i < V; i++) {
            int edges = 0;
            for (int j = 0; j < V; j++) {
                if (graph[i][j] == 1) {
                    edges++;
                }
            }
            if (edges >= K) {
                uprightNodes++;
            }
        }
        return uprightNodes;
    }
}
