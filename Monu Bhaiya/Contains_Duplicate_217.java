import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Contains_Duplicate_217 {

    public static boolean Find(int arr[])
    {
        Arrays.sort(arr);
        int sum = 1;

        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i] == arr[i-1])
            {
                sum++;

                if(sum >= 2)
                {
                    return true;
                }
                // return false;
            }
            else{
                sum = 1;

            }
        }

        return false;
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
