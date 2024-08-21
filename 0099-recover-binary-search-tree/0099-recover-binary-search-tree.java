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
    private TreeNode first = null;
    private TreeNode middle = null;
    private TreeNode last = null;
    private TreeNode prev = new TreeNode(Integer.MIN_VALUE);
    
    public void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);
        if (prev != null && root.val < prev.val) {
            // If this is the first violation, mark these two nodes // adjacent
            if (first == null) {
                first = prev;
                middle = root;
            } else {
                // If this is the second violation, mark this node as last  //not adjacent
                last = root;
            }
        }
        
        // Mark this node as previous for the next iteration
        prev = root;

        inorder(root.right);
    }

    public void recoverTree(TreeNode root) {
        // Perform the in-order traversal and find the swapped nodes
        inorder(root);

        // Swap the values of the first and last nodes if two violations are found
        // non adjacent
        if (first != null && last != null) {
            int temp = first.val;
            first.val = last.val;
            last.val = temp;
        }
        // Swap the values of the first and middle nodes if only one violation is found
        // adjacent
        else if (first != null && middle != null) {
            int temp = first.val;
            first.val = middle.val;
            middle.val = temp;
        }
    }
}