import java.util.Scanner;

public class Product_Of_Array_Except_Self_238 {

    public static void Product(int arr[])
    {
        int left_product[] = new int[arr.length];
        int Right_product[] = new int[arr.length];
        int n = arr.length;
        left_product[0]  = 1;
        Right_product[n-1] = 1;
        for(int i=1;i<arr.length;i++)
        {
            left_product[i] = arr[i-1] * left_product[i-1];  
        }
        for(int i=n-2;i>=0;i--)
        {
            Right_product[i] = arr[i+1] * Right_product[i+1];  
        }

        for(int i=0;i<n;i++)
        {
            left_product[i] = left_product[i] * Right_product[i];
        }

        for (int i = 0; i < left_product.length; i++) {
            System.out.println(left_product[i]);
        }
    }
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int arr[] = new int[m];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Product(arr);



    }
 
 
 
 
 
}
