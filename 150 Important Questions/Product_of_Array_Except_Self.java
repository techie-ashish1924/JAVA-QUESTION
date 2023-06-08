import java.util.Scanner;

public class Product_of_Array_Except_Self {

    public static void Display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] Product(int arr[])
    {
        int n = arr.length;

        int leftProduct[] = new int[n];
        int rigthProduct[] = new int[n];

        leftProduct[0] = 1;
        rigthProduct[n - 1] = 1;

        for(int i=1;i<n;i++)
        {
            leftProduct[i] = leftProduct[i - 1] * arr[i - 1];
        }

        for(int i=n-2;i>=0;i--)
        {
            rigthProduct[i] = rigthProduct[i + 1] * arr[i + 1];
        }


        for(int i=0;i<n;i++)
        {
            rigthProduct[i] = leftProduct[i] * rigthProduct[i];
        }

        Display(rigthProduct);

        return rigthProduct;


    }



    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 4 };


        System.out.println(Product(arr));

    }
    
}
