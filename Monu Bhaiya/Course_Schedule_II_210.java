import java.util.HashMap;
import java.util.List;

public class Course_Schedule_II_210 {



    public int[] findOrder(int numCourses, int[][] prerequisites)
    {
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < numCourses; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int i = 0; i < prerequisites; i++) {
            int v1 = prerequisites[i][0];
            int v2 = prerequisites[i][1];

            map.get(v2).add(v1);
        }

    }



    public static int[] Indegree(HashMap<Integer, List<Integer>> map) {
        int[] in = new int[map.size()];

        for (int key : map.keySet()) {
            for (int nbrs : map.get(key)) {
                in[nbrs]++;
            }
        }

        return in;
    }

    public static int[] IsCycle(HashMap<Integer, List<Integer>> map) {
        int[] in = Indegree();
        int count = 0;

        int course[] = new int[map.size()];
        int c_ind = 0;
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < in.length; i++) {
            if (in[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            count++;
            int rv = q.poll();

            count[c_ind++] = rv;
            // System.out.println(rv);

            for (int nbrs : map.get(rv)) {
                in[nbrs]--;

                if (in[nbrs] == 0) {
                    q.add(nbrs);
                }
            }

        }

        return count == map.size() ? course : new int[0];

        // return course;

    }
    
}
