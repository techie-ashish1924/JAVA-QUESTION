import java.util.Scanner;

import org.w3c.dom.ls.LSException;

public class Find_Pivot_Index_724 {


    public static int Find(int arr[])
    {
        int lo = 0;
        int hi = arr.length - 1;
        int l_sum = 0;
        int r_sum = 0;
        while(lo <= hi)
        {
            // l_sum += arr[lo];
            // r_sum += arr[hi];

            if(l_sum == r_sum && (hi - lo == 0))
            {
                return lo;
            }

            else if(r_sum > l_sum)
            {
               
                l_sum += arr[lo];
                lo++;
            }
            else if(l_sum > r_sum)
            {
                
                r_sum += arr[hi];
               hi--;
            }
            else{
                // lo++;
              
                // l_sum += arr[lo];
                r_sum += arr[hi];
                 hi--;
            }

        }

        return -1;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // int arr[] = {1,7,3,6,5,6};
        int arr[] = {1,2,3};
        // int arr[] = {1,2,3,5,1,1,3,1};
        // int arr[] = {2,1,-1};


        System.out.println(Find(arr));
    }
    
}
