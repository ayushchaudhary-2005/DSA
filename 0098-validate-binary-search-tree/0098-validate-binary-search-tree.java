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
    public boolean find(TreeNode root,long min,long max){
        if(root==null){
            return true;
        }
        if(root.val<=min || root.val>=max){
            return false;
        }
        boolean left=find(root.left,min,root.val);
        if(!left){
            return false;
        }
        boolean right=find(root.right,root.val,max);
        if(!right){
            return false;
        }
        return left&& right;
    }
    public boolean isValidBST(TreeNode root) {
        if(root.left==null && root.right==null){
            return true;
        }
        if(!find(root,Long.MIN_VALUE,Long.MAX_VALUE)){
            return false;
        }
        return true;

        
    }
}