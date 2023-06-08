public class Network_Interuption {



    public static char Check(String s1, String s2)
    {
        int ind_str1 = 0;
        int ind_str2 = 0;
        char ans = 0;
        while(ind_str1 < s1.length() && ind_str2 < s2.length())
        {
            if (s1.charAt(ind_str1) != s2.charAt(ind_str2)) {
                ans = s1.charAt(ind_str1);
                break;
            }

            ind_str1++;
            ind_str2++;

        }

        if (ans == '0')
        {
            ans = s1.charAt(s2.length());
        }
        
        return ans;
    }



    public static void main(String[] args) {
        
        String s1 = "abcdfjgerj";
        String s2 = "abcdfger";

        // String s1 = "";
        // String s2 = "";

        System.out.println(Check(s1, s2));
    }
    
}


