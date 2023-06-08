import java.util.*;

public class Rain_Water_Trapping {


    public static int Trapp_Water(int arr[])
    {
        int leftMax[] = new int[arr.length];
        int rightMax[] = new int[arr.length];

        leftMax[0] = arr[0];
        rightMax[arr.length - 1] = arr[arr.length - 1];

        for(int i=1;i<leftMax.length;i++)
        {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }

        for(int j=arr.length-2;j>=0;j--)
        {
            rightMax[j] = Math.max(rightMax[j + 1], arr[j]);
        }

        int sum = 0;

        for(int i=0;i<arr.length;i++)
        {
            int val = Math.min(leftMax[i], rightMax[i]) - arr[i];
            sum += val;
        }

        return sum;
    }




    public static void main(String[] args) {
        


        Scanner sc = new Scanner(System.in);

        // int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

        int arr[] = { 4, 2, 0, 3, 2, 5 };

        System.out.println(Trapp_Water(arr));

        
    }
    
}
