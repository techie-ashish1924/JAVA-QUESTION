import java.util.Scanner;

import org.w3c.dom.ls.LSException;

public class Find_Pivot_Index_724 {


    public static int Find(int nums[])
    {


        int sum = 0, leftsum = 0;
        for (int x: nums)
        {
            sum += x;
        }

        for (int i = 0; i < nums.length; ++i) 
        {
            if (leftsum == sum - leftsum - nums[i]) 
            {
                return i;
            }

            leftsum += nums[i];
        }
        return -1;



        
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // int arr[] = {1,7,3,6,5,6};
        // int arr[] = {1,2,3};
        // int arr[] = {1,2,3,5,1,1,3,1};
        // int arr[] = {2,1,-1};

        int arr[] = {-1,-1,-1,-1,-1,0};


        System.out.println(Find(arr));
    }
    
}
