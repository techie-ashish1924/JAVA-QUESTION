import java.util.*;

public class Search_A_2DArray {

    public static boolean Search(int arr[][],int target)
    {

        return false;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        Search(arr, target);
    }
    
}
