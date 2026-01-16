/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> set = new ArrayList<>();
        call(set,root);
        return set;
    }
    private void call(List<Integer> set , TreeNode root ){
            if(root == null)
                return;
            call(set,root.left);
            set.add(root.val);
            call(set,root.right);
    }
}