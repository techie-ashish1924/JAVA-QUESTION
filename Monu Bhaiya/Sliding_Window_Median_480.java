import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Sliding_Window_Median_480 {


    public static double Median_Array(ArrayList<Integer> temp,int k)
    {

        // Collections.sort(temp);
        if (k % 2 != 0) {
            return temp.get(k / 2);
        } else {

            double a = (double) temp.get(k / 2) / 2;
            double b = (double) temp.get(k / 2 - 1) / 2;
            System.out.println("xxxxxx : " + (double)(a+b));
            // System.out.println("Valueof medin " + ((long) ((long) temp.get(k / 2) + (long) temp.get(k / 2 - 1))/2));
            // return ((long) ((long)temp.get(k / 2) + (long)temp.get(k / 2 - 1))) / 2;
            return (double) (a + b);
        }
    }
// ArrayList<Integer> arr
    public static int insert(ArrayList<Integer> arr,int ele)
    {
        int lo = 0;
        int hi = arr.size() - 1;
        int mid = arr.size();

        while(lo <= hi)
        {
            int m = lo + (hi - lo) / 2;

            if (arr.get(m) >= ele) {
                mid = m;

                hi = m - 1;

            } else if (arr.get(m) < ele) {
                lo = m + 1;

            }

        }
        
        return mid;
    }
    
    public static void Median(int arr[],int k)
    {


        // System.out.println(insert(arr, 1));
 
        ArrayList<Integer> window = new ArrayList<>();

        double ans[] = new double[arr.length - k + 1];
        int ansInd = 0;


        // for first sliding window

        for(int i=0;i<k;i++)
        {
            window.add(arr[i]);
        }

        // Sorting list

        ArrayList<Integer> sortList = new ArrayList<>(window);
        Collections.sort(sortList);
        System.out.println("Print sort list : " + sortList);
        ans[ansInd++] = Median_Array(sortList, k);

    

        // for other window

        for(int i=k;i<arr.length;i++)
        {
            int item = window.get(0);
            // System.out.println("Print the item : " + item);
            
            sortList.remove(Integer.valueOf(item));
            System.out.println("After removing : " + sortList);

            
            window.remove(0);
            window.add(arr[i]);
           
            int index = insert(sortList, arr[i]);
            System.out.println("Find index value is : " + index);
            sortList.add(index, arr[i]);
            System.out.println("Adding value : " + sortList);

            ans[ansInd++] = Median_Array(sortList, k);
            
        }

        for (int j = 0; j < ans.length; j++) {
            
            System.out.println("Median of : " + (j+1) + " : " + ans[j]);
        }
        
        



    }


    



    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        // int arr[] = { 1,2,3,8};

        int arr[] = { 2147483647, 2147483647 };
        int k = 2;
        // int k = 3;

        Median(arr, k);

        // ArrayList<Integer> check = new ArrayList<>();
        // check.add(-3);
        // check.add(-1);
        // check.add(3);

        // System.out.println(insert(check, 5));


    }
    
}
