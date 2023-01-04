import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Minimum_Rounds_to_Complete_All_Tasks_2244 {


    public static int Find(int arr[])
    {

        int f_sum = 0;
        // Map<Integer, Integer> counter_array = new HashMap<>();
        Map<Integer, Integer> counter_array = new HashMap<>();

        for (final int val : arr)
            counter_array.merge(val, 1, Integer::sum);

        // Freq = 1 -> impossible
        // Freq = 2 -> needs 1 round
        // Freq = 3 -> needs 1 round
        // Freq = 3k -> needs k rounds
        // Freq = 3k + 1 = 3 * (k - 1) + 2 * 2 -> needs k + 1 rounds
        // Freq = 3k + 2 = 3 * k + 2 * 1 -> needs k + 1 rounds
        for (final int freq : counter_array.values())
            if (freq == 1)
                return -1;
            else
                f_sum += (freq + 2) / 3;

        return f_sum;
    }




    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);

        // int arr[] = { 2, 2, 3, 3, 2, 4, 4, 4, 4, 4 };

        int arr[] = { 2, 2};

        // int arr[] = { 2, 3, 3 };

        // int arr[] = { 69, 65, 62, 64, 70, 68, 69, 67, 60, 65, 69, 62, 65, 65, 61, 66, 68, 61, 65, 63, 60, 66, 68, 66,67, 65, 63, 65, 70, 69, 70, 62, 68, 70, 60, 68, 65, 61, 64, 65, 63, 62, 62, 62, 67, 62, 62, 61, 66,69};

        System.out.println(Find(arr));
    }
    
}
