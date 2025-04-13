import java.util.*;
public class Knapsack {

    public static int maxProfit(ArrayList<Integer> values, ArrayList<Integer> weights, int n, int w) {

        int[][] dp=new int[values.size()][w+1];

        for(int[] arr:dp) Arrays.fill(arr,-1);

        return max(values,weights,n,w,dp,0);

    }

    public static int max(ArrayList<Integer> values, ArrayList<Integer> weights, int n,int w,int[][] dp,int idx){

        if(idx==values.size()) return 0;

        if(n==0 || w==0) return 0;

        if(dp[idx][w]!=-1) return dp[idx][w];

        int skip=max(values,weights,n,w,dp,idx+1);

        int pick=0;

        if(n!=0 && weights.get(idx)<=w) pick=values.get(idx)+max(values,weights,n-1,w-weights.get(idx),dp,idx+1);

        return dp[idx][w]=Math.max(skip,pick);

    }
    public static void main(String[] args) {
        ArrayList<Integer> values=new ArrayList<>(List.of(5,4,8,6));
        ArrayList<Integer> weights=new ArrayList<>(List.of(1,2,4,5));
        System.out.println(maxProfit(values, weights,4, 5));
    }

}
