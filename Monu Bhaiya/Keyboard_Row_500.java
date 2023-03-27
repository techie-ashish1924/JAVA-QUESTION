import java.util.ArrayList;
import java.util.HashMap;

public class Keyboard_Row_500 {


    public static void findWords(String [] arr)
    {
        String a = "qwertyuiop";
        String b = "asdfghjkl";
        String c = "zxcvbnm";


        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        HashMap<Character,Integer> map3 = new HashMap<>();
        //

        for(int i=0;i<a.length();i++)
        {
            map1.put(a.charAt(i), 0);
        }
        for(int i=0;i<b.length();i++)
        {
            map2.put(b.charAt(i), 0);
        }
        for(int i=0;i<c.length();i++)
        {
            map3.put(c.charAt(i), 0);
        }

        // 

        // System.out.println("1 : " + map1);
        // System.out.println("2 : " + map2);
        // System.out.println("3 : " + map3);

        ArrayList<String> ans = new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {

            String str = new String(arr[i].toLowerCase());
            char ch = str.charAt(0);
            // System.out.println("VAlue of ch : " + ch);
           

            // System.out.println(map1.keySet().contains(ch));

            if(map1.keySet().contains(ch))
            {
                int f = 1;
                // System.out.println("Map 1 me mila ......   ");
                
                for(int j = 0;j<arr[i].length();j++)
                {
                    if (!map1.containsKey(str.charAt(j))) {
                        f = 0;
                    }
                }
                if (f == 1) {
                    ans.add(arr[i]);
                }

            }
            else if(map2.keySet().contains(ch))
            {
                int f = 1;
                // System.out.println("Map 2 me mila ......   " + ch);
                for(int j = 0;j<arr[i].length();j++)
                {
                    if (!map2.containsKey(str.charAt(j))) {
                        // System.out.println("this key is not belong : . .....    " + str.charAt(j));
                        f = 0;
                    }

                }
                if (f == 1) {
                    ans.add(arr[i]);
                }

            }
            else if(map3.keySet().contains(ch))
            {
                int f = 1;
                // System.out.println("Map 3 me mila ......   ");
                for(int j = 0;j<arr[i].length();j++)
                {

                    if (!map3.containsKey(str.charAt(j))) {
                        f = 0;
                    }

                }
                if (f == 1) {
                    ans.add(arr[i]);
                }

            }


            // if(f == 1)
            // {
            //     ans.add(str);
            // }
        }

        System.out.println(ans);



    }




    public static void main(String[] args) {
        

        String arr[] = { "Hello", "Alaska", "Dad", "Peace" };

        // String arr[] = {"Alaska" };
        
        findWords(arr);
        
    }
    
}
