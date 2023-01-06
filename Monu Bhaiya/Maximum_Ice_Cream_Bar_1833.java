import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Ice_Cream_Bar_1833 {


    public static int find(int arr[],int cost)
    {
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) 
        {

            if (cost = cost - arr[i])
            {
                sum++;
            }
            // cost -= ar r[i];
            // if (cost > 0) {
            //     sum++;
            // }
        }
        
        return sum;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();

        // int arr[] = new int[n];

        // // for (int i = 0; i < arr.length; i++) {

        // //     arr[i] = sc.nextInt();
        // // }

        int arr[] = { 1, 3, 2, 4, 1 };
        // int arr[] = { 10, 6, 8, 7, 7, 8 };
        int cost = 7;
        // int cost = 5;
        System.out.println(find(arr, cost));
    }
    
}
