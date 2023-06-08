public class Coin_Change_II_518 {



    // Using recursion


    public static int change(int amount, int[] coins,int idx) 
    {

        if(amount == 0)
        {
            return 1;
        }
        if(idx == coins.length)
        {
            return 0;
        }


        int inc = 0;
        int exc = 0;

        if(coins[idx] <= amount)
        {
            inc = change(amount - coins[idx], coins, idx);  // dp[amount - coin[idx]][idx]
        }
        exc = change(amount, coins, idx + 1);      // dp[amount - coin[idx]][idx-1]

        return inc + exc;


        
    }

    // using dynamic programming

    public static int coin_change(int coins[],int amount)
    {

        int dp[][] = new int[coins.length + 1][amount + 1];

        for(int i=0;i<dp.length;i++)
        {
            dp[i][0] = 1;
        }

        for(int i=1;i<dp.length;i++)
        {
            for(int am=1;am<dp[0].length;am++)
            {
                int inc = 0;
                int exc = 0;
                if(coins[i-1] <= amount)
                {
                    inc = dp[i][amount - coins[i-1]];
                }
                exc = dp[i-1][am];

                dp[i][am] = inc + exc;


            }
        }

        return dp[dp.length-1][dp[0].length-1];
    }





    public static void main(String[] args) {
        
        int coin[] = {1,2,5};
        int amount = 5;

        System.out.println(change(amount, coin,0));

        System.out.println(coin_change(coin, amount));

    }
    
}
