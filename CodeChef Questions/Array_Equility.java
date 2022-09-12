import java.util.*;
import java.lang.*;
import java.io.*;

public class Array_Equility {

    public static void main(String[] args) {

	    
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        int length = sc.nextInt();

			// int arr[] = {3,3,4};
	        int arr[] = new int[length];
	        for(int i_1=0;i_1<length;i_1++)
	        {
	            arr[i_1] = sc.nextInt();
	        }
	    
	        int k=0;
	        int sum = 0;
	        while(k<length-1)
	        {
	            int t_i = k;
	            for(int j=k+1;j<length;j++)
	            {
	                if(arr[k] == arr[j])
	                {
	                    t_i++;
                        sum++;
	                }
	                else{
						t_i++;
	                    break;
	                }
	            }
	            k = t_i;
	        }
	        if(sum < length-1)
	        {
	            System.out.println("Yes");
	        }
	        else{
	            System.out.println("No");
	        }
		// your code goes here
	    }
    }
}
