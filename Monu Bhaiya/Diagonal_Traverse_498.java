import java.util.ArrayList;
import java.util.Scanner;

public class Diagonal_Traverse_498 {

    public static void Diagonal(int arr[][])
    {
        int n = arr.length;
        int m = arr[0].length;
        // int arr1[] = new int[m*n];
        // int k = 0;
        for(int d=0;d<m+n - 1;d++)
        {
            int r,c = 0;
            if(d<m)
            {
                r=0;
                c=d;
            }
            else{
                c = m-1;
                r = d-m+1;
            }

            ArrayList<Integer>list = new ArrayList<>();

            while(r<n && c>=0)
            {
                list.add(arr[r][c]);
                // System.out.print(arr[r][c] + " ");
                r++;
                c--;
            }
            if(d%2==0)
            {
                for (int i = list.size()-1; i >=0; i--) {

                    System.out.print(list.get(i) + " ");
                    // arr1[k++] = list.get(i);
                    
                }

            }
            else{
                for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i) + " ");
                    // arr1[k++] = list.get(i);
                }
            }
        }

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
        Diagonal(arr);
    }
    
}
