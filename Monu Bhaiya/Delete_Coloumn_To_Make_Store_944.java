import java.util.Scanner;

public class Delete_Coloumn_To_Make_Store_944 {


    public static int Find(String ans[])
    {

        int sum = 0;

        for(int i = 0 ; i < ans[0].length() ; i++)
        {
            for(int j = 1 ; j < ans.length ; j++)
            {
                if(ans[j].charAt(i) < ans[j-1].charAt(i))
                {
                    // return i;
                    sum++;
                    break;

                }

            }
        }
        return sum;
    }


    public static void main(String[] args) {


        
        Scanner sc = new Scanner(System.in);

        String str[] = {"abc", "bce", "cae"};

        // String str[] = {"zyx","wvu","tsr"};

        System.out.println(Find(str));

    }
    
}
