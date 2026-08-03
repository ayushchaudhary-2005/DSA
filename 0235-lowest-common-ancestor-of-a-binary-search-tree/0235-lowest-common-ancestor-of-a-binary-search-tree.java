/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode find(TreeNode root,TreeNode p,TreeNode q){
        if(root==null){
            return null;
        }
        if((root.val>p.val && root.val<q.val) || (root.val<p.val && root.val>q.val)){
            return root;
        }
        else if(root.val==p.val){
            return p;
        }
        else if(root.val==q.val){
            return q;
        }
        else if(root.val>p.val && root.val>q.val){
            return find(root.left,p,q);
        }
        else{
            return find(root.right,p,q);
        }
        

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return find(root,p,q);
        
    }
}