import java.util.*;

public class Missing_Number_268 {


    public static int Find(int arr[])
    {
        boolean ans[] = new boolean[arr.length + 1];

        for(int i=0;i<arr.length;i++)
        {
            ans[i] = true;
        }

        for(int i=0;i<ans.length;i++)
        {
            if (ans[arr[i]] == false) {
                return i;
            }
        }
        return -1;
 }



    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int arr[] = { 3, 0, 1 };

        System.out.println(Find(arr));
    }
    
}
