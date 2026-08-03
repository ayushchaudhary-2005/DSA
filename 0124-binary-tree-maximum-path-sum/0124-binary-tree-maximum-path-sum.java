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
    int ans=Integer.MIN_VALUE;
    public int find(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=find(root.left);
        int right=find(root.right);
        int rootVal=root.val;
        int onlyOnePath=Math.max(left+rootVal,right+rootVal);
        int fullSubtree=rootVal+left+right;
        ans=Math.max(ans,Math.max(rootVal,Math.max(fullSubtree,onlyOnePath)));
        return Math.max(rootVal,onlyOnePath);
        
    }
    public int maxPathSum(TreeNode root) {
        find(root);
        return ans;
        
    }
}