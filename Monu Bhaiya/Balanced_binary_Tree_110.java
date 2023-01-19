public class Balanced_binary_Tree_110 {

    // Definition for a binary tree node.

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        
        public boolean IsBalanced(TreeNode root)
        {

            boolean left = IsBalanced(root.left);
            boolean right = IsBalanced(root.right);
            boolean isbal = Math.abs(height(root.left) - height(root.right)) <= 1;

            return left && right && isbal;
        }

        public int height(TreeNode root)
        {
            if(root == null)
            {
                return -1;
            }

            int lh = height(root.left);
            int rh = height(root.right);

            return Math.max(lh, rh) + 1;
        }
    }
    

    
    
}
