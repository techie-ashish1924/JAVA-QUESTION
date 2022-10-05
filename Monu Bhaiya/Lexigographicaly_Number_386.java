import java.util.ArrayList;
import java.util.Scanner;

public class Lexigographicaly_Number_386 {
    public static void Counting(int curr,int n)
    {
        if(curr > n)
        {
            return;
        }
        System.out.println(curr);
        int i = 0;
        if(curr == 0)
        {
            i=1;
        }
        for(;i<=9;i++)
        {
            Counting(curr*10+i,n);
        }

    }

    public static void Lexigo(int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        Counting(0, n);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Lexigo(n);
    }
    
}
