import java.util.Arrays;
import java.util.Scanner;

class minCostClimb {
    public static int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] memo=new int[n];
        Arrays.fill(memo,-1);
        memo[0]=cost[0];
        memo[1]=cost[1];
        return Math.min(minco(cost,memo,n-1),minco(cost,memo,n-2));
    }
    public static int minco(int[] cost,int[] memo,int n){
        if(memo[n]!=-1) return memo[n];
        memo[n]=cost[n]+Math.min(minco(cost,memo,n-1),minco(cost,memo,n-2));
        return memo[n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] cost=new int[n];
        for(int i=0;i<n;i++){
            cost[i]=sc.nextInt();
        }
        System.out.println(minCostClimbingStairs(cost));
        sc.close();
    }

}