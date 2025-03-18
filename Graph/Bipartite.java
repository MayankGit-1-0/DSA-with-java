import java.util.*;
public class Bipartite {
    

    public static boolean isBipartite(int[][] graph) {
        int n = graph.length;  // Number of nodes
        int[] isV = new int[n];  // Array to store colors of nodes
        Arrays.fill(isV, -1);  // Initialize all nodes with color -1 (uncolored)
        
        for (int i = 0; i < n; i++) {
            if (isV[i] == -1) {
                // Start BFS from node i if it's not colored
                boolean res = bfs(graph, isV, i);
                if (!res) return false;  // If the graph is not bipartite, return false
            }
        }
        return true;  // The graph is bipartite
    }

    public static boolean bfs(int[][] graph, int[] isV, int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        isV[start] = 0;  // Start coloring the first node with color 0
        
        while (!q.isEmpty()) {
            int node = q.poll();
            for (int neighbor : graph[node]) {
                // If the neighbor is not colored, color it with the opposite color
                if (isV[neighbor] == -1) {
                    isV[neighbor] = 1 - isV[node];  // Alternate color
                    q.add(neighbor);
                }
                // If the neighbor has the same color as the current node, the graph is not bipartite
                else if (isV[neighbor] == isV[node]) {
                    return false;
                }
            }
        }
        return true;  // The graph is bipartite from this start node
    }


    public static void main(String[] args) {
        int[][] graph1={{1,2,3},{0,2},{0,1,3},{0,2} };
        int[][] graph2={{1,3},{0,2},{1,3},{0,2} };
        boolean res1=isBipartite(graph2);
        boolean res2=isBipartite(graph1);
        System.out.println(res1);
        System.out.println(res2);
    }
}
