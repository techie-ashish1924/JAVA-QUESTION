import java.lang.reflect.Array;
import java.util.Arrays;

public class Longest_Increasing_Subsequence_300 {


    public static int lengthOfLIS(int[] nums) 
    {
        int []dp = new int[nums.length];
        Arrays.fill(dp, 1);

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(nums[i] > nums[j])
                {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        int max = dp[0];

        for(int i=0;i<dp.length;i++)
        {
            if(dp[i] > max)
            {
                max = dp[i];
            }
        }

        return max;
        
    }




    public static void main(String[] args) {
        
        int arr[] = {10,9,2,5,3,7,101,18};


        System.out.println(lengthOfLIS(arr));

    }
    
}
