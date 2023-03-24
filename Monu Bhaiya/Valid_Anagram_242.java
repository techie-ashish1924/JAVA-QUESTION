import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Valid_Anagram_242 {

    public static boolean isAnagram(String s, String t) {


        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();



        Arrays.sort(arr1);
        Arrays.sort(arr2);



        if(new String(arr1).equals(new String(arr2)))
        {
            return true;

        }
        else {
            return false;
        }

        // HashMap<Character, Integer> map1 = new HashMap<>();
        // HashMap<Character, Integer> map2 = new HashMap<>();


        // for (int i = 0; i < s.length(); i++) {

        //     if (!map1.containsKey(s.charAt(i))) {
        //         map1.put(s.charAt(i), 1);
        //     } else {
        //         int c = map1.get(s.charAt(i)) + 1;
        //         // System.out.println("value of : c " + c);
        //         map1.put(s.charAt(i), c);
        //     }

        // }


        // for (int i = 0; i < t.length(); i++) {

        //     if (!map2.containsKey(t.charAt(i))) {
        //         map2.put(t.charAt(i), 1);
        //     } else {
        //         int c = map2.get(t.charAt(i)) + 1;
        //         // System.out.println("value of : c " + c);
        //         map2.put(t.charAt(i), c);
        //     }

        // }



        // System.out.println(map1);
        // System.out.println(map2);

        // if (map1.size() != map2.size())
        // {
        //     return false;
        // }

        // for (char ch : map1.keySet())
        // {
        //     if (map2.containsKey(ch) && map1.get(ch) == map2.get(ch)) {
        //         continue;
        //         // char val1 = map1.remove(ch);
        //         // char val2 = map2.remove(ch);
        //     } else {
        //         return false;
        //     }
        // }
        
        // return true;
        // if (map1.size() == map2.size())
        // {
        //     return true;
        // }
        // else {
        //     return false;
        // }


        /* 


        for (char ch : map.keySet()) {
            int sum = 0;
            for (int i = 0; i < t.length(); i++) {
                if (t.charAt(i) == ch) {
                    sum++;
                }

            }
            if (sum != map.get(ch)) {
                return false;
            }
        }

        System.out.println(map);

        */
        // return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // String a = "anagram";
        // String b = "nagaram";

        // String a = "rat";
        // String b = "car";

        String a = "a";
        String b = "ab";



        System.out.println(isAnagram(a, b));

    }

}
