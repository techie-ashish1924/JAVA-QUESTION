import java.util.Scanner;

public class Happy_Number_202 {

    public static int Convert(int n)
    {
        int sum = 0;
        while(n>0)
        {
            int rem = n % 10;

            sum = sum + (int) Math.pow(rem, 2);
            n = n / 10;

        }
        
        return sum;
    }



    public static boolean Happy(int n)
    {
        while(n>=10)
        {
            // int 
            n = Convert(n);
            if(n == 1)
            {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // System.out.println(Convert(n));
        System.out.println(Happy(n));
    }
    
}
