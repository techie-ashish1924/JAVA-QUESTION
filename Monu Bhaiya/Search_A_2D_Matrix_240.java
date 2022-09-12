import java.util.Scanner;

public class Search_A_2D_Matrix_240 {
    public static int Index(int arr[][],int target)
    {
        for (int i = 0; i < arr.length; i++) {
            if( arr[0][0] <= target && arr[i][arr[i].length - 1] >= target)
            {
                return i;
            }
        }
        return -1;
    }

    public static boolean Search(int arr[][],int target)
    {
        int ind = Index(arr, target);
        if(ind < 0)
        {
            return false;
        }
        else{
            int lo = 0;
            int hi = arr[ind][arr[ind].length - 1];

            while(lo <= hi)
            {
                int mid = (hi + lo)/2;

                if(arr[ind][mid] == target)
                {
                    return true;
                }
                else if(arr[ind][mid] > target)
                {
                    hi = mid - 1;
                }
                else{
                    lo = mid + 1;
                }

            }

        }
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
