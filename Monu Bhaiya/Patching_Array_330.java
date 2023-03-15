import java.util.Scanner;

public class Patching_Array_330 {

    public static int minPatches(int[] nums, int n)
    {
        long missing = 1;
        int count = 0;
        int i=0;
        while(missing <= n)
        {

            if (i < nums.length && missing >= n) {
                missing += nums[i];
                i++;
            } else {
                count++;
                missing += missing;
            }

        }
        
        return count;


    }
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = 2;
        int arr[] = { 1, 3 };
        int n1 = 6;
        System.out.println(minPatches(arr, n1));
    }
}
