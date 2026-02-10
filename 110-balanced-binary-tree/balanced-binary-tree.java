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
    public int findH(TreeNode root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        int left=1+findH(root.left);
        int right=1+findH(root.right);
        return Math.max(left,right);
    }
    public boolean find(TreeNode root){
        if(root==null){
            return true;
        }
        int lh=findH(root.left);
        int rh=findH(root.right);
        if(Math.abs(lh-rh)>1){
            return false;
        }
        boolean left=find(root.left);
        if(!left){
            return false;
        }
        boolean right=find(root.right);
        if(!right){
            return false;
        }
        return left && right;
    }
    
    public boolean isBalanced(TreeNode root) {
        return find(root);
        
    }
}