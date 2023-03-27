import java.util.Scanner;

public class Number_of_Boomerangs_447 {

    public static int Boomeranges(int arr[][])
    {
        if(arr.length == 1 || arr.length == 0)
        {
            return 0;
        }
        
        for(int i=0;i<arr.length-2;i++)
        {
            int dis1 = Math.abs(arr[i][0] - arr[i + 1][0]) + Math.abs(arr[i][1] - arr[i + 1][1]);

            int dis2 = Math.abs(arr[i][0] - arr[i + 2][0]) + Math.abs(arr[i][1] - arr[i + 2][1]);

            
        }
    }




    public static void main(String[] args) {
        
        int arr[][] = { { 0, 0 }, { 1, 0 }, { 2, 0 } };

    }
    
}
