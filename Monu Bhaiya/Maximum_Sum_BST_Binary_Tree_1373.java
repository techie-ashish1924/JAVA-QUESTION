public class Maximum_Sum_BST_Binary_Tree_1373 {




    
    //  Definition for a binary tree node.

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


    class BstPair {

        boolean isbst = true;
        long minimum = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        int sum = 0;  // bt vala sum
        int ans = 0;  // bst vaal ansBinary_Tree_Right_Side_View
    }
      
    
    class Solution {


        public int maxSumBST(TreeNode root) {

        }



        public BstPair MaximumSumBst(TreeNode root) {

            if (root == null) {
                return new BstPair();
            }

            BstPair lbp = ValidBst(root.left);
            BstPair rbp = ValidBst(root.right);
            BstPair sbp = new BstPair();

            sbp.max = Math.max(lbp.max, Math.max(rbp.max, root.val));
            sbp.minimum = Math.min(lbp.minimum, Math.min(rbp.minimum, root.val));

            if (lbp.isbst && rbp.isbst && lbp.max < root.val && rbp.minimum > root.val) {
                sbp.isbst = true;
            } else {
                sbp.isbst = false;
            }

            return sbp;
        }
    }

    
}
