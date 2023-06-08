import java.util.Scanner;

public class Single_in_engineering_college {


    public static boolean Check(int arr[],int val,int k)
    {
        int sum = 0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] >= val)
            {
                sum = sum + arr[i] - val;

            }
            else{
                sum += 0;
            }
            // arr[i] > val ? (sum += (arr[i]-val)) : sum += 0;
        }

        if(sum >= k)
        {
            return true;
        }
        return false;
    }



    public static int Find(int arr[],int k)
    {
        int lo = 0;

        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        int hi = max;
        int ans = 0;
        // System.out.println(lo);
        // System.out.println(hi);
        // System.out.println(ans);

        while(lo <= hi)
        {
            // int mid = hi - (hi - lo) / 2;
            System.out.println("hello");
            int mid = (hi - lo) / 2 + lo;
            // System.out.println("Mid : " + mid);
            if (Check(arr, mid, k)) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid-1;

            }

        }
        
        return ans;
    }


    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(Find(arr, k));
    }
    
}
