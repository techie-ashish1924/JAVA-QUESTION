import java.util.HashMap;

public class Longest_Consecutive_Sequence_128 {



    public static int Consecutive(int arr[]) {

        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if (map.containsKey(val - 1)) {
                map.put(val, false);
            } else {
                map.put(val, true);
            }
            // map.put(val, true);
            if (map.containsKey(val + 1)) {
                map.put(val + 1, false);
            }

        }
        int ans = 0;

        for (int key : map.keySet()) {

            if (map.get(key) == true) {
                int count = 0;
                while (map.containsKey(key)) {
                    key++;
                    count++;
                }
                ans = Math.max(ans, count);

            }

        }

        // System.out.println(map);

        return ans;

    }

   



    public static void main(String[] args) {
        
        // int arr[] = { 100, 4, 200, 1, 3, 2 };

        int arr[] = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };

        System.out.println(Consecutive(arr));

    }
    
}
