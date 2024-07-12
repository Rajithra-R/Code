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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        Calculatedia(root);
        return diameter;
    }
    public int Calculatedia(TreeNode root)
    {
        if(root == null) return 0;
        int lh = Calculatedia(root.left);
        int rh = Calculatedia(root.right);
        diameter = Math.max(diameter,lh + rh);
        return Math.max(lh,rh) + 1;
    }
}