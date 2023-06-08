

import java.util.*;


public class Min_Cost_Climbing_Stairs_746 {



    public static int Helper(int arr[], int dp[])
    {
        int f = minCostClimbingStairs(arr, 0, dp);
        int s = minCostClimbingStairs(arr, 1, dp);

        return Math.min(f, s);
    }



    public static int minCostClimbingStairs(int[] arr, int i,int dp[]) {


        if(i >= arr.length)
        {
            return 0;
        }


        if(dp[i] != -1)
        {
            return dp[i];
        }


        
        int first = minCostClimbingStairs(arr, i + 1,dp);
        int second = minCostClimbingStairs(arr, i + 2,dp);
        
        return dp[i] = Math.min(first, second) + arr[i];
        
    }


    public static void main(String[] args) {
        
        int[] cost = { 10, 15, 20 };

        int dp[] = new int[cost.length];

        Arrays.fill(dp, -1);


        

        // System.out.println(minCostClimbingStairs(cost, 0,dp));

        System.out.println(Helper(cost, dp));

    }
    
}
