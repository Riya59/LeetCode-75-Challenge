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
    public boolean isValid(TreeNode root,TreeNode l, TreeNode r){
        if(root == null){
            return true;
        }
        if(l != null && root.val <= l.val){
            return false;
        }
        if(r != null && root.val >= r.val){
            return false;
        }
        return isValid(root.left,l,root) && isValid(root.right,root,r);
    }
    public boolean isValidBST(TreeNode root) {
        return isValid(root,null,null);
    }
}
