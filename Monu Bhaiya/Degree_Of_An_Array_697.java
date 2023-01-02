import java.util.Scanner;

public class Degree_Of_An_Array_697 {

    public static int Find(int arr[])
    {
        int ans = 0;
        // int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] != -1)
            {
                int sum = 0;
                for(int j=i;j<arr.length;j++)
                {
                    if(arr[i] == arr[j])
                    {
                        sum++;
                    }
                }

                ans = Math.max(ans, sum);
            }
        }

        return ans;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // int arr[] = {1,2,2,3,1,1};
        int arr[] = {1,2,2,3,1,4,2,2};

        System.out.println(Find(arr));
    }
    
}
