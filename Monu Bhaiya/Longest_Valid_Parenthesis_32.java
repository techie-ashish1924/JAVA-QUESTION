import java.util.Scanner;
import java.util.Stack;

public class Longest_Valid_Parenthesis_32 {


    public static int Find(String a)
    {
        int startInd = 0;

        Stack<Character> st = new Stack<>();

        for(int i=0;i<a.length();i++)
        {
            if (a.charAt(i) == '}' && !st.isEmpty() && st.peek() == '{') {
                st.pop();
            } else if (a.charAt(i) == ')' && !st.isEmpty() && st.peek() == '(') {
                st.pop();
            }
            if (a.charAt(i) == ']' && !st.isEmpty() && st.peek() == '[') {
                st.pop();

            } else {
                startInd = i - startInd;
                st.add(a.charAt(i));
            }
        }
        return startInd;
    }



    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        System.out.println(Find(a));
    }
    
}
