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
    public void find(TreeNode root,ArrayList<String> al,String curr){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            curr=curr+String.valueOf(root.val);
            al.add(curr);
            return;
        }
        find(root.left,al,curr+String.valueOf(root.val));
        find(root.right,al,curr+String.valueOf(root.val));
    }
    public int sumNumbers(TreeNode root) {
        ArrayList<String> al=new ArrayList<>();
        find(root,al,"");
        int ans=0;
        for(int i=0;i<al.size();i++){
            int curr=Integer.parseInt(al.get(i));
            ans=ans+curr;
        }
        return ans;

        
    }
}