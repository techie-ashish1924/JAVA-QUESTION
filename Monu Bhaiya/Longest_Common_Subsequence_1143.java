import java.util.Arrays;
import java.util.Scanner;



// first approach

public class Longest_Common_Subsequence_1143 {


    // i--> s1, j --> s2

    public static int longestCommonSubsequence(String s1, String s2,int i,int j) 
    {
        if(i == s1.length() || j == s2.length())
        {
            return 0;
        }
        int ans = 0;

        if(s1.charAt(i) == s2.charAt(j))
        {
            ans = 1 + longestCommonSubsequence(s1, s2, i+1, j+1);

        }
        else{
            int fs = longestCommonSubsequence(s1, s2, i+1, j);
            int ss = longestCommonSubsequence(s1, s2, i, j+1);

            ans = Math.max(fs, ss);
        }
        return ans;
        
    }

    // second approach

    public static int lcs2(String s1, String s2,int i,int j) 
    {
        if(i < 0 || j < 0)
        {
            return 0;
        }
        int ans = 0;

        if(s1.charAt(i) == s2.charAt(j))
        {
            ans = 1 + lcs2(s1, s2, i-1, j-1);

        }
        else{
            int fs = lcs2(s1, s2, i-1, j);
            int ss = lcs2(s1, s2, i, j-1);

            ans = Math.max(fs, ss);
        }
        return ans;
        
    }


    // dp top down approach

    public static int lcsTD(String s1, String s2,int i,int j,int [][]dp) 
    {
        if(i == s1.length() || j == s2.length())
        {
            return 0;
        }

        if(dp[i][j] != -1)
        {
            return dp[i][j];
        }

        int ans = 0;

        if(s1.charAt(i) == s2.charAt(j))
        {
            ans = 1 + lcsTD(s1, s2, i+1, j+1,dp);  // dp[i+1][j+1]

        }
        else{
            int fs = lcsTD(s1, s2, i+1, j,dp);   // dp[i+1][j]
            int ss = lcsTD(s1, s2, i, j+1,dp);   // dp[i][j+1]

            ans = Math.max(fs, ss);
        }
        return dp[i][j] = ans;
        
    }

    public static int lcsBU(String s1, String s2)
    {
        int dp[][] = new int[s1.length()+1][s2.length()+1];
       
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                int ans = 0;
                if(s1.charAt(i-1) == s2.charAt(j-1))
                {
                    ans = 1 + dp[i-1][j-1];
                }
                else{
                    int fs = dp[i-1][j];
                    int ss = dp[i][j-1];

                    ans = Math.max(fs, ss);
                }
                dp[i][j] = ans;
            }
        }

        return dp[dp.length - 1][dp[0].length - 1];

    }




    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String s1 = "pmjghexybyrgzczy";
        String s2 = "hafcdqbgncrcbihkd";


        // "pmjghexybyrgzczy"

        int dp[][] = new int[s1.length()][s2.length()];

        for(int a[] : dp)
        {
            Arrays.fill(a, -1);
        }

        System.out.println(longestCommonSubsequence(s1, s2,0,0));
        System.out.println(lcs2(s1, s2, s1.length()-1, s2.length()-1));
        System.out.println(lcsTD(s1, s2, 0, 0, dp));
        System.out.println(lcsBU(s1, s2));

    }
    
}
