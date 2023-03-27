import java.util.Arrays;

public class Distribute_Candies_575 {



    public static int distributeCandies(int[] candyType) {

        int n = candyType.length / 2;

        Arrays.sort(candyType);

        int sum = 0;
        int count = 1;
        for(int i=0;i<candyType.length;i++)
        {
            if (sum + candyType[i] <= n) {
                count++;
                sum = sum + candyType[i];
            } else {
                
                break;
            }
        }
        
        return count;

    }



    public static void main(String[] args) {
        
        // int arr[] = { 1, 1, 2, 2, 3, 3 };

        int arr[] = { 1, 1, 2, 3 };

        // int arr[] = {6,6,6,6};

        System.out.println(distributeCandies(arr));

    }
    
}
