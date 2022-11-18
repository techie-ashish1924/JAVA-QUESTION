import java.util.Scanner;

public class Two_Sum2_167 {

    public static void Find(int arr[],int targ)
    {
        int lo = 0;
        int hi = arr.length-1;
        int ind = 0;
        int ans[] = new int[2];
        while(lo < hi)
        {
            if((arr[lo] + arr[hi]) == targ)
            {
                ans[ind] = lo+1;
                ans[ind+1] = hi+1;
                break;
                // return ans;
            }

            else if((arr[lo] +  arr[hi]) > targ)
            {
                hi = hi - 1;
            }
            else{
                lo = lo + 1;
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the targt value : ");
        int targ = sc.nextInt();

        Find(arr,targ);
    }
    
}

