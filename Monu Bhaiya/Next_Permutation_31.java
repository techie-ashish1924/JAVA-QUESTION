import java.util.Arrays;
import java.util.Scanner;

public class Next_Permutation_31 {

    public static void Next_Permutation(int nums[])
    {
        int n = nums.length;
        int p=0;
        int flag = 0;
        for (int i = n-2; i >= 0; i--) {
            if(nums[i] < nums[i+1])
            {
                flag = 1;
                p=i;
                break;
            }
        }
        int q = 0;
        for (int i = nums.length-1; i > p; i--) {

            if(nums[i] > nums[p])
            {
                q=i;
                break;
            }
            
        }
        int last = nums.length-1;
        if(flag == 1)
        {
            int temp = nums[p];
            nums[p] = nums[q];
            nums[q] = temp;
            // int last = nums.length-1;
            p = p+1;

        }
        // else{
            // int last = nums.length-1;
        // }
        
        
        

        
        

        // Arrays.sort(a);
        while( p <= last )
        {
            int temp1 = nums[last];
            nums[last] = nums[p];
            nums[p] = temp1;
            p++;
            last--;


        }


        // if(f==0)
        // {
            // int temp = nums[n-1];
            // nums[n-1] = nums[0];
            // nums[0] = temp;
        // }



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int arr[] = new int[m];
        for(int i=0;i<m;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("After Changing............");

        Next_Permutation(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
