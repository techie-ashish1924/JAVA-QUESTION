import java.util.Scanner;

public class Rotate_Image_48 {

    public static void Transpose(int arr[][])
    {
        // int row = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr[0].length; j++) {
                
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void Rotate(int arr[][])
    {
        Transpose(arr);
        for (int i = 0; i < arr.length; i++) {
            int lo = 0;
            int hi = arr[0].length-1;

            while(lo <= hi)
            {
                int temp = arr[i][hi];
                arr[i][hi] = arr[i][lo];
                arr[i][lo] = temp;

                lo++;
                hi--;
            }
        }


    }

    public static void Display(int arr[][])
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        Display(arr);
        // Transpose(arr);
        // System.out.println("transpose matrix is : ");
        Display(arr);

        System.out.println("After rotation........");
        Rotate(arr);
        Display(arr);
    }
}
