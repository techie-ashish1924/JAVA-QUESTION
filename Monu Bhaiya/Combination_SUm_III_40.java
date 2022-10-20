import java.util.Arrays;
import java.util.Scanner;

public class Combination_SUm_III_40 {

    public static void Combinations(int arr[],int targ,String ans,int idx)
    {
        if(targ == 0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=idx;i<arr.length;i++)
        {
            if( i != idx && arr[i] == arr[i-1])
            {
                continue;
            }
            if(arr[i] <= targ)
            {
                Combinations(arr, targ - arr[i], ans + arr[i], i+1);
            }
        }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int targ = sc.nextInt();

        Arrays.sort(arr);

        Combinations(arr, targ, "", 0);

        // for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i]);
        // }
        // System.out.println(arr);
    }
    
}
