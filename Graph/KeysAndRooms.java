import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KeysAndRooms {
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        int res=0;
        boolean[] isV=new boolean[n];
        for(int i=0;i<n;i++){
            if(isV[i]==false){
                isV[i]=true;
                bfs(rooms,isV,i);
                res++;
                if(res==2) return false;
            }
        }
        return true;
       
    }
    public static void bfs(List<List<Integer>> rooms,boolean[] isV,int i){
        Queue<List<Integer>> q=new LinkedList<>();
        q.add(rooms.get(i));
        while(q.size()!=0){
            List ans=q.remove();// list can also be used like this.
            int m=ans.size();
            for(int j=0;j<m;j++){
                int a=(int)ans.get(j);
                if(isV[a]==false){
                    isV[a]=true;
                    q.add(rooms.get(a));
                }
            }
        }
        return;
    }

    public static void main(String[] args) {
        List<List<Integer>> rooms=new ArrayList<>();
        rooms.add(Arrays.asList(1,2,3));
        rooms.add(Arrays.asList(1));
        rooms.add(Arrays.asList(1));
        rooms.add(Arrays.asList(1,2,3));
        boolean res=canVisitAllRooms(rooms);
        System.out.println(res);
        
        
    }
}