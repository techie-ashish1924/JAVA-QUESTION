import java.util.Scanner;


public class Maximum_Product_Subarray_152 {


    public static int maxProduct(int arr[])
    {
        int mul = arr[0] * arr[1];
        int ans = mul;
        for (int i = 2; i < arr.length; i++) {
         
            mul = (arr[i] * mul)/arr[i-2];
            ans = Math.max(ans, mul);
        }
        return ans;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxProduct(arr));

    }
    
}
