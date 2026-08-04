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
            TreeNode n=new TreeNode(val);
            return n;
        }
        if(root.val<val){
            root.right=find(root.right,val);
        }
        else{
            root.left=find(root.left,val);

        }
        return root;

    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return find(root,val);
        
    }
}