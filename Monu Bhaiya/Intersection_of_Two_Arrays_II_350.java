import java.util.ArrayList;
import java.util.HashMap;

public class Intersection_of_Two_Arrays_II_350 {


    public static int[] IntersectionArray(int arr1[],int arr2[])
    {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

       
        int ind = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            if (map1.containsKey(arr1[i])) {
                int c = map1.get(arr1[i]) + 1;
                map1.put(arr1[i], c);

            } else {

                map1.put(arr1[i], 1);
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (map2.containsKey(arr2[i])) {
                int c = map2.get(arr2[i]) + 1;
                map2.put(arr2[i], c);

            } else {

                map2.put(arr2[i], 1);
            }
        }

        System.out.println(map1);
        System.out.println(map2);

        for (int i : map1.keySet()) {
            if (map2.containsKey(i)) {
                int minValue = Math.min(map1.get(i), map2.get(i));

                for (int j = 0; j < minValue; j++) {
                    // arr[ind++] = i;
                    ans.add(i);
                }

            }
        }

        // System.out.println(ans);
        int arr[] = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++)
        {
            arr[ind++] = ans.get(i);
        }

        // int arr[] = ans.toArray();
        Display(arr);

        return arr;
    }
    

    public static void Display(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            
            System.out.println(arr[i]);
        }
    }



    public static void main(String[] args) {
        

        int arr1[] = { 1, 2, 2, 1};
        int arr2[] = { 2, 2 };

        // int arr1[] = { 4, 9, 5 };
        // int arr2[] = { 9, 4, 9, 8, 4 };
        
        System.out.println(IntersectionArray(arr1, arr2));
    }
    
}
