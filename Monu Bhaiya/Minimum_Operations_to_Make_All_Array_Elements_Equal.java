import java.util.*;

public class Minimum_Operations_to_Make_All_Array_Elements_Equal {


    public static List<Long> minOperations(int[] nums, int[] queries) 
    {

        HashMap<Integer, Long> map = new HashMap<>();

        ArrayList<Long> ans = new ArrayList<>();

        for (int i = 0; i < queries.length; i++) {
            if (map.containsKey(queries[i])) {
                ans.add(map.get(queries[i]));
            } else {

                long sum = 0;
                for (int j = 0; j < nums.length; j++) {
                    sum += Math.abs(queries[i] - nums[j]);
                }
                ans.add(sum);
                map.put(queries[i], sum);

            }
        }

        // for(int i=0;i<queries.length;i++)
        // {
        //     map.put(queries[i], 0l);
        // }

        // System.out.println(map);

        // for(int val : map.keySet())
        // {
        //     // int sum = 0;
        //     long sum = 0;
        //     for (int j = 0; j < nums.length; j++) {
        //         sum += Math.abs(val - nums[j]);
        //     }

        //     map.put(val, sum);

        // }

        // System.out.println(map);
        // ArrayList<Long> ans = new ArrayList<>();

        // for (int i = 0; i < queries.length; i++) {
        //     if (map.containsKey(queries[i])) {
        //         ans.add(map.get(queries[i]));
        //     }
        // }

        // for(int i=0;i<queries.length;i++)
        // {
        //     long sum = 0;
        //     for (int j = 0; j < nums.length; j++) {
        //         sum += Math.abs(queries[i] - nums[j]);
        //     }
        //     ans.add(sum);
        // }

        return ans;
    }




    public static void main(String[] args) {


        int []nums = {3,1,6,8};
        int[] queries = { 1, 5 };


        System.out.println(minOperations(nums, queries));
        

    }
    
}
