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
   
    public boolean findTarget(TreeNode root, int k) {
          List<Integer> nums = new ArrayList<>();
        inorder(root, nums);
        
        int i = 0, j = nums.size() - 1;
        
        while (i < j) {
            int sum = nums.get(i) + nums.get(j);
            if (sum == k) {
                return true;
            } else if (sum < k) {
                i++;
            } else {
                j--;
            }
        }
        
        return false;
    }
    
    private void inorder(TreeNode root, List<Integer> nums) {
        if (root == null) {
            return;
        }
        
        inorder(root.left, nums);
        nums.add(root.val);
        inorder(root.right, nums);
    
    }
    
}

/*  NAIVE APPROACH
1.FIND THE SIZE OF THE TREE USING L+R+1
2.INITIALIZE AN ARAAY AND PUT THE INORDER IN THAT ARRAY (inoreder to keep track of index initialize the var outside the fn globally)
3.MAINTAIN TWO POINTER I AND J ITERATE UNTIL I AND J CROSSES AND CHECK FOR THE SUM 

        static int x =0 ;// keep track of index

         int n = size(root);
         int arr[] = new int[n];
         x = 0;
         inorder(root,k,arr);
         int i=0;
        int j=arr.length-1;
        while(i < j)
        {
        if(arr[i] + arr[j] == k) return true;
        else if(arr[i] + arr[j] < k)  i++;
        else if(arr[i] + arr[j] > k)  j--;
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

*/