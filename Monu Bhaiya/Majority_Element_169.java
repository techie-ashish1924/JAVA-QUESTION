import java.util.Arrays;
import java.util.Scanner;

public class Majority_Element_169 {

    public static int Find(int arr[])
    {

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // System.out.println(arr);
        int ans = Integer.MIN_VALUE;
        int sum = 1;
        int data = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] == arr[i-1])
            {
                sum++;
            }
            else{
                if(sum > ans)
                {
                    ans = sum;
                    data = arr[i-1];
                }
        
                // ans = Math.max(ans, sum);
                sum = 1;
                // data = arr[i];
            }
        }

        if(sum > ans)
        {
            data = arr[arr.length-1];
        }
        // ans = Math.max(ans, sum);
        return data;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Find(arr));
    }
    
}
