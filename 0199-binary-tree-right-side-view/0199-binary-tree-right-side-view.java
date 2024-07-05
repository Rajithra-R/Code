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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null)
        {
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int n = q.size();
            for(int i=1;i<=n;i++)
            {
                TreeNode cur = q.poll();
                if(i == n)
                {
                    res.add(cur.val);
                }
                if(cur.left != null)
                {
                    q.add(cur.left);
                }
                if(cur.right != null)
                {
                    q.add(cur.right);
                }
            }
        }
        return res;
    }
}