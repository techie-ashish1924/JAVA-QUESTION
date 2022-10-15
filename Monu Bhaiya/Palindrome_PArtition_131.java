import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palindrome_Partition_131 {
    public static boolean Palindrome(String a)
    {
        int i=0;
        int j = a.length()-1;

        while(i <= j)
        {
            if(a.charAt(i) != a.charAt(j))
            {
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
    // List<List<String>>
    public static void Partion(String ques,ArrayList<String> data,List<List<String>> answer)
    {
        if(ques.length() == 0)
        {
            // List<String> cp = data;
            answer.add(new ArrayList<>(data));
            // System.out.println(data);
            // System.out.println(ans);
            // data.add(ques)
            return;

        }

        for(int cut=1; cut <= ques.length();cut++)
        {
            String s1 = ques.substring(0,cut);
            if(Palindrome(s1))
            {
                data.add(s1);
                Partion(ques.substring(cut), data,answer);
                data.remove(data.size()-1);
            }
           
        }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        ArrayList<String> data = new ArrayList<>();
        List<List<String>> answer = new ArrayList<>();

        Partion(a,data,answer);
        System.out.println(answer);

        
    }
    
}
