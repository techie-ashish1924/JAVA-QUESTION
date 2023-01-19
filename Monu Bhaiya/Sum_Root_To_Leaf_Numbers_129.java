
// Definition for a binary tree node.
public class TreeNode 
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}

    TreeNode(int val) 
    {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) 
    {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
 
class Solution {
    public int sumNumbers(TreeNode root) {

    }

    public int Sum(TreeNode root,int ans)
    {
        
        if (root == null)
        {
            return 0;
        }

        if(root.left == null  && root.right == null)
        {
            return ans * 10 + root.val;
        }
        int left = Sum(root.left, ans * 10 + root.val);
        int right = Sum(root.right, ans * 10 + root.val);

        return left + right;
        
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public int sumNumbers(TreeNode root) {

    }
}