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
   static int x =0 ;// keep track of index
    public boolean findTarget(TreeNode root, int k) {
         int n = size(root);
         int arr[] = new int[n];
         x = 0;
        inorder(root,k,arr);
         int i=0;
        int j=arr.length-1;
        while(i < j)
        {
        if(arr[i] + arr[j] == k) return true;
        else if(arr[i] + arr[j] < k) 
        {
            i++;
        }
        else if(arr[i] + arr[j] > k)
        {
            j--;
        }
        }
        return false;
    }
    public static void inorder(TreeNode root,int k,int[] arr)
    {
        
        int c=0;
        if(root != null)
        {
            inorder(root.left,k,arr);
            arr[x++] = root.val;
            inorder(root.right,k,arr);  
        }
         
    }
    public static int size(TreeNode root)
    {
        if(root == null) return 0;
        int l = size(root.left);
        int r = size(root.right);
        return l+r+1;
    }
    
}