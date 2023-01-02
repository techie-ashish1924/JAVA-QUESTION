import java.util.Scanner;

public class Transpose_Matrix_867 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int matrix[][] = {{1,2,3,4},{5,6,7,8}};


        int arr[][] = new int[matrix[0].length][matrix.length];

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                arr[j][i] = matrix[i][j];
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        
    }
    
}
