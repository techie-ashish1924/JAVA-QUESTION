// import java.awt.List;
import java.util.*;
// import java.util.HashMap;

public class Group_Anagrams_49 {

    public static String GenerateKey(String s)
    {
        int sum = 0;

        int ar[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            // sum = sum + (int) s.charAt(i);

            char ch = s.charAt(i);
            ar[ch - 'a']++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ar.length; i++)
        {
            sb.append(ar[i] + " ");
        }

        return sb.toString();
    }



// List<List<String>>
    public static List<List<String>> groupAnagrams(String[] strs) 
    {

        HashMap<String, List<String>> map = new HashMap();

        for(int i=0;i<strs.length;i++)
        {
            String key = GenerateKey(strs[i]);

            if (map.containsKey(key)) {
                map.get(key).add(strs[i]);
            } else {
                map.put(key, new ArrayList<>());
                map.get(key).add(strs[i]);
            }
        }
        
        // System.out.println(map);

        List<List<String>> ans = new ArrayList<>();



        for(String key : map.keySet())
        {
            ans.add(map.get(key));
        }


        return ans;


    }



    public static void main(String[] args) {
        
        String arr[] = { "eat", "tea", "tan", "ate", "nat", "bat" };

        System.out.println(groupAnagrams(arr));

        // groupAnagrams(arr);


    }
    
}
