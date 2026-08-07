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
    int ans=0;
    class Box{
        boolean isBST;
        int min;
        int max;
        int sum;
        public Box(boolean isBST,int min,int max,int sum){
            this.isBST=isBST;
            this.min=min;
            this.max=max;
            this.sum=sum;
        }
    }
    public Box find(TreeNode root){
        if(root==null){
            return new Box(true,Integer.MAX_VALUE,Integer.MIN_VALUE,0);
        }
        if(root.left==null && root.right==null){
            ans=Math.max(ans,root.val);
            return new Box(true,root.val,root.val,root.val);
        }
        Box left=find(root.left);
        Box right=find(root.right);
        if(left.isBST && right.isBST && root.val>left.max && root.val<right.min){
            ans=Math.max(ans,left.sum+right.sum+root.val);
            return new Box(true,Math.min(left.min,root.val),Math.max(root.val,right.max),left.sum+right.sum+root.val);
        }
        return new Box(false,0,0,0);
    }
    public int maxSumBST(TreeNode root) {
        find(root);
        return ans;
        
    }
}