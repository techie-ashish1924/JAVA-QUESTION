import java.util.Scanner;

public class IsSubSequence_392 {

    public static boolean Check(String s,String t,String ans)
    {
        if(t.length() == 0)
        {
            if(s.equals(ans))
            {
                return true;
            }
            return false;
        }

        char ch = t.charAt(0);
        boolean x = Check(s, t.substring(1), ans);
        boolean y = Check(s, t.substring(1), ans + ch);

        return x||y;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        // String t = sc.nextLine();
        String s = "axc";
        String t = "ahbgdc";

        System.out.println(Check(s, t, ""));
    }
    
}
