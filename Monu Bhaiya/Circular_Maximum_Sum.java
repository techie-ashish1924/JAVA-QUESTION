import java.util.Scanner;

public class Circular_Maximum_Sum {
    public static int Kadens(int arr[])
    {
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            
            sum = sum + arr[i];
            ans = Math.max(sum, ans);

            if(sum < 0)
            {
                sum  = 0;
            }
        }
        // System.out.println(ans);
        return ans;
    }

    public static int CalculateSum(int arr[])
    {
        int lsum = Kadens(arr);
        // System.out.println(lsum);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum =  sum + arr[i];
            arr[i] = arr[i]*-1;
        }
        int kk = Kadens(arr);
        sum = sum + kk;

        int ans = Math.max(lsum, sum);

        if(sum == 0)
        {
            return lsum;
        }
        else{
            return ans;
        }

    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(CalculateSum(arr));
    }
    
}
