import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Valid_Anagram_242 {

    public static boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                int c = map.get(s.charAt(i)) + 1;
                System.out.println("value of : c " + c);
                map.put(s.charAt(i), c);
            }

        }

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
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // String a = "anagram";
        // String b = "nagaram";

        String a = "rat";
        String b = "car";



        System.out.println(isAnagram(a, b));

    }

}
