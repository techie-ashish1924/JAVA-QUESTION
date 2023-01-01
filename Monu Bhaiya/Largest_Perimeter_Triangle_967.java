import java.util.Arrays;
import java.util.Scanner;

public class Largest_Perimeter_Triangle_967 {


    public static int Find(int arr[])
    {

        Arrays.sort(arr);

        for(int i=arr.length-1 ; i>= 2 ; i--)
        {
            if(arr[i] < arr[i-1] + arr[i-2])
            {
                int sum = arr[i] + arr[i-1] + arr[i-2];
                // System.out.println(arr[i] + " "  + arr[i-1] + " " + arr[i-2]);
                // return (arr[i] + arr[i-1] + arr[i-2]);/
                return sum;
            }
        }

        return 0;

    }


    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,1,2};
        // int arr[] = {1,2,1,10};
        

        System.out.println(Find(arr));


        
    }
}
    

