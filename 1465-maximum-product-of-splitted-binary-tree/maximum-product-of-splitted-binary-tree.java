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
    long sum;
    long ans;
    public long findSum(TreeNode root){
        if(root==null){
            return 0;
        }
        long left=findSum(root.left);
        long right=findSum(root.right);
        return (long)root.val+left+right;
    }
    public long find(TreeNode root){
        if(root==null){
            return 0;
        }
        long left=find(root.left);
        long right=find(root.right);
        long currSum=root.val+left+right;
        ans=Math.max(ans,currSum*(sum-currSum));
        return currSum;
    }
    public int maxProduct(TreeNode root) {
        sum=findSum(root);
        ans=0;
        find(root);
        ans=ans%1000000007;
        return (int)ans;


        
    }
}