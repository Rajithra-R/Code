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
    int i = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        int ub = Integer.MAX_VALUE;
        return construct(preorder,ub);
    }
    public TreeNode construct(int[] preorder,int ub)
    {
        if(i >= preorder.length || preorder[i] > ub) return null;
        TreeNode root = new TreeNode(preorder[i++]);
        root.left = construct(preorder,root.val);
        root.right = construct(preorder,ub);
        return root;
    }
}