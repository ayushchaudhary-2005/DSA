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
    public TreeNode find(TreeNode root,int val){
        if(root==null){
            return null;
        }
        if(root.val==val){
            return root;
        }
        TreeNode left=null;
        TreeNode right=null;
        if(root.val>val){
            left=find(root.left,val);
        }
        else{
            right=find(root.right,val);

        }
        if(left!=null){
            return left;
        }
        if(right!=null){
            return right;
        }
        return null;
    }
    public TreeNode searchBST(TreeNode root, int val) {
        return find(root,val);
        
    }
}