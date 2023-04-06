import java.util.Arrays;

public class House_Rober_198 {


    public static int robRecursion(int[] nums,int i) 
    {

        if(i >= nums.length)
        {
            return 0;
        }


        int rob = nums[i] + robRecursion(nums, i+2);
        int Dontrob = robRecursion(nums, i+1);

        return Math.max(rob, Dontrob);
        
    }

    public static int robTD(int[] nums,int i, int dp[]) 
    {

        if(i >= nums.length)
        {
            return 0;
        }
        if(dp[i] != -1)
        {
            return dp[i];
        }


        int rob = nums[i] + robTD(nums, i+2,dp);
        int Dontrob = robTD(nums, i+1,dp);

        return dp[i] = Math.max(rob, Dontrob);
        
    }

    public static int robBU(int[] nums) 
    {
        if(nums.length == 1)
        {
            return nums[0];
        }
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for(int i=2;i<dp.length;i++)
        {
            int rob = nums[i] + dp[i-2];
            int Dontrob = dp[i-1];

            dp[i] = Math.max(rob, Dontrob);
        }

        return dp[dp.length-1];
        
    }


    public static void main(String[] args) {
        
        int []nums = {1,2,3,1};
        int []dp = new int[nums.length];

        Arrays.fill(dp, -1);

        System.out.println(robRecursion(nums, 0));
        System.out.println(robTD(nums, 0, dp));

    }
    
}
