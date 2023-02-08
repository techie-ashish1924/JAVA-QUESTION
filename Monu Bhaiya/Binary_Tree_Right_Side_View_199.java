import java.util.ArrayList;
import java.util.LinkedList;

public class Binary_Tree_Right_Side_View_199 {



    
      Definition for a binary tree node.
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
      }
      }
     
    class Solution {

        
        List<List<Integer>> wl = new ArrayList<>();
        public List<Integer> rightSideView(TreeNode root) {

            if (root == null) {
                return ans;
            }
            ans.add(root);
            rightSideView(root.right);

        }

        public static void Find(TreeNode root)
        {
            if(root == null)
            {
                return;
            }

            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            ans.add(root.val);

            while(!queue.isEmpty())
            {
                ArrayList<Integer> arr = new ArrayList<>();

                TreeNode root1 = queue.poll();
                arr.add(root1.val);
                if(root1.left !=  null)
                {
                    queue.add(root1.left)
                }
                if(root1.right != null)
                {
                    queue.add(root1.right);
                }
                wl.add(arr1);

            }
            for(int i=0;i<wl.size();i++)
            {
               ans.add( wl.get(i).get(wl.size()-1));
            }
        }

    }
    
}
