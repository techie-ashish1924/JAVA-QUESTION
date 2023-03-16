// import java.util.HashMap;
// import java.util.HashSet;
import java.util.*;

public class Graph_Valid_Tree {


    public static boolean validTree(int n, int edges[][])
    {
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int j = 0; j < edges.length; j++) {
            int v1 = edges[j][0];
            int v2 = edges[j][1];

            map.get(v1).add(v2);
            map.get(v2).add(v1);
        }
        
        return isValid(map);

    }
    
    public static boolean isValid(HashMap<Integer, List<Integer>> map)
    {

        HashSet<Integer> visited = new HashSet<>();

        Queue<Integer> q = new LinkedList<>();
        int count = 0;

        for (int src : map.keySet()) {

            if (visited.contains(src)) {
                continue;
            }
            count++;

            q.add(src);

            while (!q.isEmpty()) {

                // 1. Remove

                int rv = q.poll();

                // 2. If already visited then ignore kro.

                if (visited.contains(rv)) {
                    return false;
                }

                // 3 Visited.
                visited.add(rv);

                // 4 Self work.

                System.out.print(rv + " ");

                // Add Neighbours

                for (int nbrs : map.get(rv).keySet()) {
                    if (!visited.contains(nbrs)) {
                        q.add(nbrs);
                    }
                }

            }
            // return false;

            return count == 1;


    }




    }

    public static void main(String[] args) {
        
        int n = 5;
        int edges[][] = { { 0, 1 }, { 0, 2 }, { 0, 3 }, { 1, 4 } };
        // System.out.println(valid);

        // Graph_Valid_Tree ob = new Graph_Valid_Tree();

        System.out.println(validTree(n, edges));

    
    }
    
}
