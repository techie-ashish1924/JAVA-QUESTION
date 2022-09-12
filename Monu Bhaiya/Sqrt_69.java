import java.util.Scanner;

public class Sqrt_69 {

    public static int Mysqrt(int x)
    {
        int lo = 1;
        int hi = x;
        int ans = 0;
        while(lo < hi)
        {
            int mid = (lo+hi)/2;

            if( (mid * mid) <= x)
            {
                ans = mid;
                lo = mid + 1;
            }
            else
            {
                hi = mid - 1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Mysqrt(n));
    }
    
}
