import javax.swing.tree.TreeNode;

public class Diameter_of_Binary_Tree_543 {

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

}

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {

        if(root == null)
        {
            return 0;
        }

        int ld = diameterOfBinaryTree(root.left);
        int rd = diameterOfBinaryTree(root.right);

        int sd = ht(root.left) + ht(root.right) + 2;

        return Math.max(ld, Math.max(rd, sd));

    }


    public int ht(TreeNode root)
    {
        if (root == null) {
            return -2;
        }

        int lh = ht(root.left);
        int rh = ht(root.right);

        return Math.max(lh, rh) + 1;
    }
    
    // ORDER O(N)

    public int Diameter(TreeNode root)
    {
        if(root == null)
        {
            return -1;
        }
        
    }
}
