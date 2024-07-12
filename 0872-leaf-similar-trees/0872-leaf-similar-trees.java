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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        getleaf(root1,l1);
        getleaf(root2,l2);
        return l1.equals(l2);
    }
    public void getleaf(TreeNode root,List<Integer> leaf)
    {
        if(root == null) return;
        // leaf node means add it to arraylist
        if(root.left == null && root.right == null)  
        {
            leaf.add(root.val);
        }
        getleaf(root.left,leaf);
        getleaf(root.right,leaf);
    }
}