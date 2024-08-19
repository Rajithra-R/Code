/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        // Approach is that whenever ur root is null it is null
        // Whenever root == p || root == q => current node is either equal to p or q then return that val
        // recursively call left and right
        //  there are 3 cases either one side is null( left or right) , both are not null then return that cur val = > root
        if(root == null || root == p || root == q)  return root;
        TreeNode l = lowestCommonAncestor(root.left,p,q);
        TreeNode r = lowestCommonAncestor(root.right,p,q);
        if( l == null)
        {
            return r;
        }
        else if(r == null)
        {
            return l;
        }
        else // if both are not null
        {
            return root;
        }
    }
}