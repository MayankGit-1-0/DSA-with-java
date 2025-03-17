import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class pathExist {
    public static boolean validPath(int n,int[][] edges,int source, int destination){
        List<List<Integer>> graph=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        // Populate the adjacency list with edges
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]); // Since it's an undirected graph
        }
        boolean[] isV=new boolean[n];
        for(int i=source;i<n;){
            if(!isV[i]){
                isV[i]=true;
                bfs(graph,isV,i);
            }
            if(isV[source] && isV[destination]) return true;
            break;
        }
        return false;
        
    }
    public static void bfs(List<List<Integer>> graph,boolean[] isV,int i){
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        while(q.size()!=0){
            int j=q.remove();
            for(int ele:graph.get(j)){
                if(!isV[ele]){
                    isV[ele]=true;
                    q.add(ele);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] edges= {{0,1},{0,2},{3,5},{5,4},{4,3}};
        
        int source=sc.nextInt();
        int destination=sc.nextInt();
        boolean valid=validPath(n,edges,source,destination);
        System.out.println(valid);
        sc.close();
    }
}
