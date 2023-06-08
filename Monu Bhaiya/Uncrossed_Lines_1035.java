


public class Uncrossed_Lines_1035 {


    public static int maxUncrossedLines(int[] arr1, int[] arr2) 
    {
        int dp[][] = new int[arr1.length+1][arr2.length+1];
        
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                int ans = 0;
                if(arr1[i-1] == arr2[j-1])
                {
                    ans = 1 + dp[i-1][j-1];
                }
                else{
                    ans = Math.max(dp[i-1][j], dp[i][j-1]);
                }

                dp[i][j] = ans;
            }
        }

        return dp[dp.length-1][dp[0].length-1];
        
    }

    public static void main(String[] args) {
        
        int arr1[] = {2,5,1,2,5};
        int arr2[] = {10,5,2,1,5,2};

        System.out.println(maxUncrossedLines(arr1, arr2));


    }
    
}
