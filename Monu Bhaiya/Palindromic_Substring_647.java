
// AXIS ORBIT ALGORITHM

import java.util.Scanner;

public class Palindromic_Substring_647 {

    public static int Count_Palindrome(String a)
    {
        int count = 0;
        
        // for ODD LENGTH

        for (int axis = 0; axis < a.length(); axis++) 
        {

            for (int orbit = 0; orbit < a.length() && axis-orbit >= 0 && axis+orbit < a.length(); orbit++) 
            {
                if(a.charAt(axis-orbit) != a.charAt(axis+orbit))
                {
                    break;
                }
                count++;
            }
            
        }

        // FOR EVEN LENGTH

        for (double axis = 0.5; axis < a.length(); axis++) 
        {

            for (double orbit = 0.5; orbit < a.length() && axis-orbit >= 0 && axis+orbit < a.length(); orbit++) 
            {
                if(a.charAt((int)(axis-orbit)) != a.charAt((int)(axis+orbit)))
                {
                    break;
                }
                count++;
            }
            
        }
        
        return count;

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        System.out.println(Count_Palindrome(a));
    }
    
}
