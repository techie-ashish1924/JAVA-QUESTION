import java.util.Scanner;

public class Maximum_Circular_Sum {


    public static int KadensAlgo(int arr[])
    {
        int sum = 0;
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            ans = Math.max(ans, sum);

            if (sum < 0) {
                sum = 0;
            }
        }

        return ans;
    }
    

    public static int CircularSum(int arr[])
    {
        int linearKadens = KadensAlgo(arr);

        int sum = 0;
         
        for(int i = 0;i<arr.length;i++)
        {
            sum += arr[i];

            arr[i] *= -1;
        }

        int k = KadensAlgo(arr);
        sum = sum + k;
        
        int ans = Math.max(sum, linearKadens);

        if(sum == 0)
        {
            return linearKadens;
        }
        else {
            return ans;
        }
    }





    public static void main(String[] args) {
        


        Scanner sc = new Scanner(System.in);

        // int arr[] = { 1, -2, 3, -2 };

        int arr[] = { 2, 3, -7, -11, 6 };

        System.out.println(CircularSum(arr));


    }
    
}
