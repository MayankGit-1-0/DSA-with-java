import java.util.List;

public class dfs {
    public static List<Integer> Dfs(int[][] adj){
        
    }
    public static void main(String[] args) {
    int[][] adj={{1,5,7},
                                {0,4,6},
                                {3},
                                {2,4},
                                {1,3,7},
                                {0,6},
                                {1,5},
                                {0,4}
                            };
    List<Integer> traversal=Dfs(adj);                        
    System.out.println(traversal);
    }
}
