import java.util.Arrays;

public class partitionSubsetSum {
    public static boolean canPartition(int[] nums) {
        int n=nums.length,sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum%2==1) return false;
        sum/=2;
        int[] dp=new int[sum+1];
        Arrays.fill(dp,-1);
        dp[0]=1;
        boolean res= part(nums,n-1,sum,dp);
        System.out.println();
        for(int num:dp) System.out.print(num +" ");
        System.out.println();
        return res;
    }
    public static boolean part(int[] nums,int idx,int sum,int[] dp){
        if(idx<0) return sum%nums[0]==0;
        if(dp[sum]!=-1) return dp[sum]==0?false:true;
        if(sum==0) return true;
        boolean skip=part(nums,idx-1,sum,dp);
        boolean pick=false;
        if(nums[idx]<=sum) pick=part(nums,idx-1,sum-nums[idx],dp); 
        dp[sum]= pick || skip?1:0;
        System.out.print(dp[sum]+" ");
        return pick || skip;
    }
    public static void main(String[] args) {
        int[] nums={1,1,1,1};
        boolean res=canPartition(nums);
        System.out.println(res);
    }
}
