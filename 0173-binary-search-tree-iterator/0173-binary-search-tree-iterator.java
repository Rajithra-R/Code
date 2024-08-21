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
class BSTIterator {
    Stack<TreeNode> s = new Stack<>();
    public BSTIterator(TreeNode root) {
        pushAll(root);  // pushes the left nodes
    }
    
    public int next() {  // initially point to null -> whenever next comes move the pointer to the next
        // pop the value and push all its right nodes
        TreeNode cur = s.pop();
        pushAll(cur.right);
        return cur.val;
    }
    
    public boolean hasNext() { 
        return !s.isEmpty();
    }
    public void pushAll(TreeNode root)
    {
        while(root != null)
        {
            s.push(root);
            root = root.left;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */