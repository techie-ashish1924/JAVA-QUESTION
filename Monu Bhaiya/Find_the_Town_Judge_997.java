import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Find_the_Town_Judge_997 {

    



    public static int findJudge(int n, int[][] trust) 
    {

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 1; i <= n; i++)
        {
            map.put(i, new ArrayList<>());
        }

        for(int i=0;i<trust.length;i++)
        {

            if (map.containsKey(trust[i][0])) {
                map.get(trust[i][0]).add(trust[i][1]);

            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(trust[i][1]);

                map.put(trust[i][0], list);

            }
        }
        
        System.out.println(map);
        System.out.println(map.keySet());

        // System.out.println(map.get(1));

        for (int val : map.keySet())
        {
            int f = 0;
            if (map.get(val).size() == 0 && val != trust[0][1])
            {
                return -1;
            }
            for(int nbrs : map.get(val))
            {

                System.out.println(nbrs);
                System.out.println(trust[0][1]);
                if(nbrs == trust[0][1])
                {
                    // System.out.println("galat");
                    // break;/

                    // return -1;
                    f = 1;

                }

                if(f == 0)
                {
                    return -1;
                }
            }
        }

        return trust[0][1];

    }


    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        // int n = 3;

        // int trust[][] = { { 1, 3 }, { 2, 3 } };



        int n = 4;
        int trust[][] = { { 1, 3 }, { 1, 4 }, { 2, 3 }};


        System.out.println(findJudge(n, trust));


        

    }
    
}
