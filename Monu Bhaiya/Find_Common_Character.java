import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Find_Common_Character {

    public static int Common_CharacterCount(String arr[])
    {
        
        HashMap<Integer, HashMap<Character, Integer>> map = new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            map.put(i, new HashMap<>());
        }

        for(int ans : map.keySet())
        {
            // if(!map.containsKey(ans))
            // {
            //     for(int i=0;i<arr[ans].length();i++)
            //     {
            //         if(!map.get(ans).containsKey(arr[ans].charAt(i)))
            //         {
            //             map.get(ans).put(arr[ans].charAt(i), 1);
            //         }
            //         else {
            //             // map.put(ans).put(arr[ans].charAt(i), map.get(ans).get(arr[ans].charAt(i) + 1));
            //         }
            //     }
            // }
            String s = arr[ans];
            HashMap<Character, Integer> sh = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                if (!sh.containsKey(s.charAt(i))) {
                    sh.put(s.charAt(i), 1);
                } else {
                    sh.put(s.charAt(i), sh.get(s.charAt(i)) + 1);
                }
            }
            
            map.put(ans, new HashMap<>(sh));
            sh.clear();
        }

        System.out.println(map);
        ArrayList<String> ans = new ArrayList<>();

        int sum = 0;

        for(char kk:map.get(0).keySet())
        {
            int min = Integer.MAX_VALUE;
            int f = 1;
            for(int key : map.keySet())
            {

                System.out.println("Loop for : " + key + "................");
                if (map.get(key).containsKey(kk) && f == 1) {
                    min = Math.min(map.get(key).get(kk), min);
                }
                else {
                    f = 0;
                    min = 0;
                }
                
            }
            System.out.println("Minimum vlue for : " + kk + min);
            
            if (f == 1)
            {
                sum += min;
                for (int i = 0; i < min; i++)
                {
                    ans.add(kk + "");
                }
                // ans.add(kk+"");
            }
          
        }

        // for(key : map.keySet())
        // {
        //     for(kk : map.get(key).keySet())
        //     {

        //     }
        // }

        System.out.println(sum);
        Collections.sort(ans);
        System.out.println(ans);
        return 0;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String[] words = { "bella", "label", "roller" };

        // String[] words = { "cool", "lock", "cook" };

        System.out.println(Common_CharacterCount(words));
    }


    
}
