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

    // optimize solution

    public static int Search(int []dp,int si,int ei,int val)
    {
        int ans = 0;
        while(si <= ei)
        {
            int mid = (si+ei)/2;

            if(dp[mid] >= val)
            {
                ans = mid;
                ei = mid-1;
            }
            else{
                si = mid + 1;
            }
        }

        return ans;

    }

    public static int Lis_NlogN(int arr[])
    {
        int []dp = new int[arr.length];
        dp[0] = arr[0];
        int len = 1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] > dp[len-1])
            {
                dp[len] = arr[i];
                len++;
            }
            else{

                int ith = Search(dp,0,len-1,arr[i]);
                dp[ith] = arr[i];

            }
        }

        return len;
    }




    public static void main(String[] args) {
        
        int arr[] = {10,9,2,5,3,7,101,18};


        // System.out.println(lengthOfLIS(arr));

        System.out.println(Lis_NlogN(arr));

    }
    
}
