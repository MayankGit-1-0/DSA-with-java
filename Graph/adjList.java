import java.util.ArrayList;
import java.util.List;

public class adjList {
    public static List<List<Integer>> adjlist(int[][] edges,int m){
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=m;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        return adj;
    }
    public static void main(String[] args) { // you are given an edge matrix use that to make adj list
        int[][] edges={{0,1},
                       {2,3},
                       {3,1},
                       {0,5},
                       {4,5}};
        List<List<Integer>> adj=adjlist(edges,5);
        System.out.println(adj);
    }
}
