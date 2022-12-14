import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Coin_Change_322 {
    public static int res = Integer.MAX_VALUE;
    public static int f = 1;
    public static void Count(int arr[],int curr_ind,int curr,int targ,String ans)
    {
        if(curr == targ)
        {
            f = 0;
            // System.out.println("Length of ans ");
            res = Math.min(res,ans.length());
            // System.out.println(ans);
            // return res;
            return;
            // break;
        }

        if(curr > targ)
        {
            return;
        }

        int sum = 0;
        for (int i = curr_ind ;i < arr.length; i++) 
        {
            Count(arr,curr_ind, curr + arr[i], targ,ans + arr[i]);
        }

        // return res;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int targ = sc.nextInt();

        // Arrays.sort(arr, Collections.reverseOrder());
        // Arrays.sort(arr);
        // reverse(arr);
        Count(arr,0, 0, targ,"");
        // System.out.println(res);

        if(f==0)
        {
            System.out.println(res);
        }
        else{
            System.out.println("-1");
        }
    }
}
