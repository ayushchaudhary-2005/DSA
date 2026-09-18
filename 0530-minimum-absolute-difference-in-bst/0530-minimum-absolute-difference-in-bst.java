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
    public void find(TreeNode root,ArrayList<Integer> al){
        if(root==null){
            return;
        }
        find(root.left,al);
        al.add(root.val);
        find(root.right,al);
        
    }
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> al=new ArrayList<>();
        find(root,al);
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<al.size();i++){
            ans=Math.min(ans,al.get(i)-al.get(i-1));
           
        }
        return ans;
        
    }
}