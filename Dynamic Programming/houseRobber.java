import java.util.Arrays;
import java.util.Scanner;

class houseRobber {
    public static int rob(int[] nums) {
        int n=nums.length;
        if(n<2) return nums[0];
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        dp[0]=nums[0];
        dp[1]=nums[1];
        //dp[2]=nums[2];
        return Math.max(help(nums,dp,n-1),help(nums,dp,n-2));
    }
    public static int help(int[] nums,int[] dp,int n){
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        dp[n]=nums[n]+Math.max(help(nums,dp,n-2),help(nums,dp,n-3));
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(rob(nums));
        sc.close();
    }
}
