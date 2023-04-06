import java.util.*;


class BipartitePair {

    int vtx;
    int lv;

    public BipartitePair(int src, int lv) {
        this.vtx = src;
        this.lv = lv;
    }
}

public class Is_Graph_Bipartite_785 
{

 


    public static boolean isBipartite(int[][] graph) 
    {
        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
        for (int i = 0; i < graph.length; i++) {
            map.put(i, new HashMap<>());
        }

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                map.get(i).put(graph[i][j], 0);
            }
        }

        return Bipartite(map);
    }
    
    public static boolean Bipartite(HashMap<Integer,HashMap<Integer,Integer>> map)
    {


        LinkedList<BipartitePair> q = new LinkedList<>();

        HashMap<Integer,Integer> visited = new HashMap();

        for(int src : map.keySet())
        {
            if (visited.containsKey(src)) {
                continue;
            }

            BipartitePair bp = new BipartitePair(src, 0);

            q.add(bp);

            while (!q.isEmpty()) {
                BipartitePair rp = q.poll();

                if (visited.containsKey(rp.vtx) && rp.lv != visited.get(rp.vtx)) {
                    return false;
                }

                visited.put(rp.vtx, rp.lv);

                // System.out.println(val + " -> ");

                for (int nbrs : map.get(rp.vtx).keySet()) {
                    if (!visited.containsKey(nbrs)) {
                        BipartitePair nbp = new BipartitePair(nbrs, rp.lv + 1);
                        q.add(nbp);
                    }
                }
            }
        }
        
        return true;
    }



    public static void main(String[] args) 
    {
        
        // int arr[][] = { { 1, 2, 3 }, { 0, 2 }, { 0, 1, 3 }, { 0, 2 } };

        int arr[][] = {{1,3},{0,2},{1,3},{0,2}};
        System.out.println(isBipartite(arr));

    }

    
}
