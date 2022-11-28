import java.util.Scanner;

public class Find_First_And_Last_Position_Of_Elements_In_Sorted_Array_34 {


    public static int Index(int arr[],int targ)
    {
        int lo = 0;
        int hi = arr.length - 1;
        
        while(lo <= hi)
        {
            int mid = (hi - lo)/2 + lo;

            if(arr[mid] == targ)
            {
                return mid;
            }

            else if(arr[mid] > targ)
            {
                hi = mid - 1;
            }
            else{
                lo = mid + 1;
            }
        }

        return -1;
    }

    public static void Find(int arr[],int target)
    {
        
        int arr1[] = new int[2];
        int ind = Index(arr, target);

        System.out.println("Index is : " + ind);

        if(ind == -1)
        {
            arr1[0] = -1;
            arr1[1] = -1;
        }
        else
        {
            int strt = ind;
            int end = ind;
            while(strt >= 0)
            {
                if(arr[strt] == target)
                {
                    arr1[0] = strt;
                    // break;
                // return strt + 1;
                }
                else{
                    break;
                }
                strt--;
            }

            while(end < arr.length)
            {
                if(arr[end] == target)
                {
                    arr1[1] = end;
                    // break;
                // return end-1;
                }
                else{
                    break;
                }
                end++;
            }

            
        
    }
    System.out.println(arr1[0]);
            System.out.println(arr1[1]);
}
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        // int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int targ = sc.nextInt();
        // int ind  = Index(arr, targ);

        Find(arr, targ);
    }
}
