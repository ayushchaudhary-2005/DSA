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
    public void find(TreeNode leftr,TreeNode rightr,int level){
        if(leftr==null || rightr==null){
            return;
        }
        if(level%2!=0){
            int lv=leftr.val;
            int rv=rightr.val;
            leftr.val=rv;
            rightr.val=lv;
        }
        find(leftr.left,rightr.right,level+1);
        find(leftr.right,rightr.left,level+1);
    }
    public TreeNode reverseOddLevels(TreeNode root) {
        find(root.left,root.right,1);
        return root;
        
    }
}