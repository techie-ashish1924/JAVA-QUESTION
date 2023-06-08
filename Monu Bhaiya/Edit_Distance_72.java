public class Edit_Distance_72 {


    // Recursion................

    public static int minOps(String s1, String s2,int i,int j) 
    {

        if(i == s1.length())
        {
            return s2.length() - j;
        }
        if(j == s2.length())
        {
            return s1.length() - i;
        }


        int ans = 0;

        if(s1.charAt(i) == s2.charAt(j))
        {
           ans = minOps(s1, s2, i+1, j+1);
        }
        else{
            int insert = minOps(s1, s2, i, j+1);
            int delete = minOps(s1, s2,i+1, j);
            int replace = minOps(s1, s2, i+1, j+1);

            ans = Math.min(insert, Math.min(delete, replace)) + 1;
        }

        return ans;
    }



    public static void main(String[] args) 
    {

        String word1 = "horse";
        String word2 = "ros";

        System.out.println(minOps(word1, word2,0,0));
        

    }
    
}
