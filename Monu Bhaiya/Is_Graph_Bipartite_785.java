import java.util.*;

public class Is_Graph_Bipartite_785 
{

    class BipartitePair 
    {
        
        int vtx;
        int lv;

        public BipartitePair(int src,int lv)
        {
            this.vtx = src;
            this.lv = lv;
        }
    }


    public static boolean isBipartite(int[][] graph) 
    {
        HashMap<Integer,Integer> visited = new HashMap<>();

        Queue<BipartitePair> q = new LinkedList<>();

        for (int src = 0; src < graph.length;src++) {

            if (visited.containsKey(src)) {
                continue;
            }

            q.add(new BipartitePair(src,0));

            while (!q.isEmpty()) {

                // 1. Remove

                BipartitePair rv = q.poll();  // (1,0)

                // 2. If already visited then ignore kro.

                if (visited.containsKey(rv.vtx)) {

                    if(visited.get(rv.vtx) != rv.lv)
                        return false;
                    else
                        return true;
                    // continue;
                }

                // 3 Visited.
                visited.put(rv.vtx,rv.lv);

                // 4 Self work.

                // System.out.print(rv + " ");

                // Add Neighbours

                for (int nbrs : graph[rv.vtx]) {
                    if (!visited.containsKey(nbrs)) {
                        q.add(new BipartitePair(nbrs, rv.lv + 1));
                    }
                }

            }
            return true;

        }

    


    }



    public static void main(String[] args) 
    {
        
        int arr[][] = { { 1, 2, 3 }, { 0, 2 }, { 0, 1, 3 }, { 0, 2 } };

        System.out.println(isBipartite(arr));

    }

    
}
