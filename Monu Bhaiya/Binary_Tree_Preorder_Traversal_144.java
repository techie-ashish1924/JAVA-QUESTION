
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

    public static List<Integer> data = new ArrayList<Integer>();

    public List<Integer> preorderTraversal(TreeNode root) {

        printPreorder(root);

        List<Integer> copy = new ArrayList<>();
        copy.addAll(data);
        data.clear();
        return copy;

    }

    public void printPreorder(TreeNode node) {

        if (node == null)
            return;

        data.add(node.val);

        printPreorder(node.left);

        printPreorder(node.right);
    }
}