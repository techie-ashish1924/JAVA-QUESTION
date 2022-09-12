import java.util.Scanner;

public class trapping_Rain_Water_42 {

    public static int Count(int arr[]) {
        int min = arr[0];
        int left_arr[] = new int[arr.length];
        int Right_arr[] = new int[arr.length];
        // int max  = arr[arr.length-1];
        int n = arr.length;
        int strt = 1;
        int end = arr.length-2;
        left_arr[0] = arr[0];
        Right_arr[n-1] = arr[n-1];
        while(strt < n && end >=0)
        {
            left_arr[strt] = Math.max(arr[strt], left_arr[strt-1]);
            Right_arr[end] = Math.max(arr[end], Right_arr[end+1]);
            strt++;
            end--;
        }

        int sum = 0;
        for(int i=0;i<n;i++)
        {
            sum += Math.min(left_arr[i], Right_arr[i]) - arr[i];
        }

        return sum;
       
       
       
       
       
       
       
        // return sum;
    }


    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int arr[] = new int[m];
        for(int i=0;i<m;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(Count(arr));

    }
    
}
