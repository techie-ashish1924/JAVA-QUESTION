import java.util.Scanner;

public class Contains_Duplicate_2 {

    public static boolean Search(int arr[],int ind,int k)
    {
        int lo = 0;
        int hi = arr.length - 1;

        while(lo <= hi)
        {
            if((lo != ind) && (arr[lo] == arr[ind]) && (int)Math.abs(lo - ind) <= k)
            {
                return true;
            }

            if((hi != ind) && (arr[hi] == arr[ind]) && (int)Math.abs(hi - ind) <= k)
            {
                return true;
            }
            
                lo++;
                hi--;
    
        }
        return false;
    }

    public static boolean Find(int arr[],int k)
    { 
        for (int i = 0; i < arr.length; i++) {
            if(Search(arr, i, k))
            {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter the array : ");
        
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value k : ");
        int k = sc.nextInt();

        System.out.println(Find(arr, k));

    }
    
}
