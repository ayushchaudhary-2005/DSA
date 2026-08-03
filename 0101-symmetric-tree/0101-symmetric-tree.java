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
    public boolean find(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null){
            return true;
        }
        if((root1==null && root2!=null) || (root2==null && root1!=null)){
            return false;
        }
        if(root1.val!=root2.val){
            return false;
        }
        boolean first=find(root1.left,root2.right);
        if(!first){
            return false;
        }
        boolean second=find(root1.right,root2.left);
        if(!second){
            return false;
        }
        return first&&second;

    }
    public boolean isSymmetric(TreeNode root) {
        return find(root.left,root.right);
        
    }
}