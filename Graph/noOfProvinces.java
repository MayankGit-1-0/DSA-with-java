import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class noOfProvinces {
    private static int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int res=0;
        boolean[] isV=new boolean[n];
        for(int i=0;i<n;i++){
            if(isV[i]==false){
                isV[i]=true;
                bfs(isConnected,isV,i);
                res++;
            }
        }   
        return res;  
    }
    private static void bfs(int[][] isConnected,boolean[] isV,int i){
        int n=isConnected.length;
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        while(q.size()!=0){
            int row=q.remove();
            for(int j=0;j<n;j++){
                if(isConnected[row][j]==1 && isV[j]==false){
                    q.add(j);
                    isV[j]=true;
                }
            }
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] isConnected=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                isConnected[i][j]=sc.nextInt();
            }
        }
        int res=findCircleNum(isConnected);
        System.out.println(res);
        sc.close();
                
        }
        
            
}