import java.util.Arrays;

public class _of_Two_Subsequences_1458 {


    // by using recursion 

    public static int maxDotProduct1(int[] arr1, int[] arr2,int i,int j,boolean flag) 
    {

        if(i==arr1.length || j == arr2.length)
        {
            if(flag == true)
                return 0;
            else{

                return -10000000;
            }
        }

        int dot = arr1[i] * arr2[j] + maxDotProduct1(arr1, arr2, i+1, j+1,true);

        // first me se delete
        int fd = maxDotProduct1(arr1, arr2, i+1, j,false);

        // second me se delete
        int sd = maxDotProduct1(arr1, arr2, i, j+1,false);


        return Math.max(fd, Math.max(dot, sd));

        // return Math.min(arr1[i]*arr2[j], Math.max(fd, Math.max(dot, sd)));

        
    }

    // second way using dynamic programming


    public static int maxDotProduct2(int[] arr1, int[] arr2,int i,int j,boolean flag,int dp[][]) 
    {

        if(i==arr1.length || j == arr2.length)
        {
            if(flag == true)
                return 0;
            else{

                return -10000000;
            }
        }

        int dot = arr1[i] * arr2[j] + maxDotProduct2(arr1, arr2, i+1, j+1,true,dp);

        // first me se delete
        int fd = maxDotProduct2(arr1, arr2, i+1, j,false,dp);

        // second me se delete
        int sd = maxDotProduct2(arr1, arr2, i, j+1,false,dp);


        // return Math.max(fd, Math.max(dot, sd));

        return dp[i][j] =  Math.max(arr1[i]*arr2[j], Math.max(fd, Math.max(dot, sd)));

        
    }

    // third way bottom up dp


    public static int maxDotProduct3(int[] arr1, int[] arr2) 
    {

        int dp[][] = new int[arr1.length + 1][arr2.length+1];
        int sp = Integer.MIN_VALUE;

        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                int dot = arr1[i-1] * arr2[j-1] + dp[i-1][j-1];

                int fd = dp[i-1][j];
                int sd = dp[i][j-1];

                dp[i][j] = Math.max(arr1[i-1] * arr2[j-1], Math.max(fd, Math.max(dot, sd)));

                sp = Math.max(sp, arr1[i-1]*arr2[j-1]);

            }
        }

        if(dp[dp.length - 1][dp[0].length - 1] == 0)
        {
            return sp;
        }

      return dp[dp.length-1][dp[0].length - 1];

        
    }










    public static void main(String[] args) {

        int arr1[] = {2,1,-2,5};
        int arr2[] = {3,0,-6};

        int dp[][] = new int[arr1.length+1][arr2.length+1];

        for(int a[] : dp)
        {
            Arrays.fill(a, -1000_000_00);
        }

        System.out.println(maxDotProduct1(arr1, arr2, 0, 0,true));
        System.out.println(maxDotProduct2(arr1, arr2, 0, 0, true,dp));
        System.out.println(maxDotProduct3(arr1, arr2));
        

    }
    
}
