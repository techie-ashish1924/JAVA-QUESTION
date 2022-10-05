import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generate_Parenthesis_22 {

    public static void Check(int n,int open,int close,String ans,ArrayList<String> a)
    {
        if(open == n && close == n)
        {
            a.add(ans);
            // System.out.println(ans);
            return;
        }
        if(open < n)
        {
            Check(n, open+1, close, ans + "(",a);
        }
            

        if(close < open)
        {
            Check(n, open, close+1, ans+")",a);
        }
            
    }


    public static void Generate(int n)
    {
        ArrayList<String> a = new ArrayList<>();

        Check(n, 0, 0, "",a);
        System.out.println(a);


    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Generate(n);
    }
    
}
