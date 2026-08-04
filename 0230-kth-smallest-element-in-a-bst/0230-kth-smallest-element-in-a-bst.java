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
    int pos=0;
    public TreeNode find(TreeNode root,int k){
        if(root==null){
            return null;
        }
        TreeNode left=find(root.left,k);
        if(left!=null){
            return left;
        }
        pos+=1;
        if(pos==k){
            return root;
        }
        return find(root.right,k);
        
    }
    public int kthSmallest(TreeNode root, int k) {
        TreeNode ans=find(root,k);
        return ans.val;
        
    }
}