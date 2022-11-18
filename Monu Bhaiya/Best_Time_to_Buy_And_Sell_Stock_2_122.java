import java.util.Scanner;

public class Best_Time_to_Buy_And_Sell_Stock_2_122 {

    public static int Profit(int arr[])
    {
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            
            if(arr[i] > arr[i-1])
            {
                sum = sum +  (arr[i] - arr[i-1]);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
         }

         System.out.println(Profit(arr));
    }
    
}
