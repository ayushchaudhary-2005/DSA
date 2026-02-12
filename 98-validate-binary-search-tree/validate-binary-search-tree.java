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
    long leftM;
    long rightM;
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
        return left&&right;

    }
    public void findL(TreeNode root){
        if(root==null){
            return;
        }
        leftM=Math.max(root.val,leftM);
        findL(root.left);
        findL(root.right);
    }
    public void findR(TreeNode root){
        if(root==null){
            return;
        }
        rightM=Math.min(rightM,root.val);
        findR(root.left);
        findR(root.right);


    }
    public boolean isValidBST(TreeNode root) {
        if(root.left==null && root.right==null){
            return true;
        }
        if(!find(root,Long.MIN_VALUE,Long.MAX_VALUE)){
            return false;
        }
        leftM=Long.MIN_VALUE;
        findL(root.left);

        rightM=Long.MAX_VALUE;
        findR(root.right);
        if(leftM>=root.val || rightM<=root.val){
            return false;
        }
        return true;
        
    }
}