import java.util.Scanner;

// import javax.sound.sampled.SourceDataLine;

public class SubArray_Product_Less_Than_k_713 {


    public static int Solution(int arr[],int k)
    {
        int strt = 0;
        int end = 0;
        int mul = 1;
        int ans = 0;
        while(end < arr.length)
        {

            
            // window grow kro 
            mul = arr[end];
            // window kam karo ......
            while(mul >= k && strt<=end)
            {
                mul = mul/arr[strt];
                strt++;
            }
            // ans calculate karo..

            ans = ans + end - strt + 1;
            end++;

        }
        return ans;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(Solution(arr,k));
    }
   
    
}
