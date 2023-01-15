import java.util.List;

// Definition for a binary tree node.

public class TreeNode 
{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() 
    {

    }
    TreeNode(int val) { this.val = val; }

    TreeNode(int val, TreeNode left, TreeNode right) 
    {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class Path_Sum_2_113 {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

    }

    public void path(TreeNode root,int target, List<Integer> data, List<List<Integer>> ans)
    {


        if (root == null) {
            return ;
        }

        if (root.left == null && root.right == null) {
            if (root.val - targetSum == 0) {
                data.add(root.val);
                ans.add(new ArrayList<>(arr));
                data.remove(arr.size() - 1);
            }
        }
        
        data.add(root.val)
        hasPathSum(root.left, targetSum - root.val, data, ans);
        hasPathSum(root.right, targetSum - root.val,data,ans);
        data.remove(data.size()-1);
        
    }
    
}
