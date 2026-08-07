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
    public void find(TreeNode root,List<Integer> al,Stack<TreeNode> s){
        while(!s.isEmpty()){
            TreeNode curr=s.pop();
            al.add(curr.val);
            if(curr.right!=null){
                s.push(curr.right);
            }
            if(curr.left!=null){
                s.push(curr.left);
            }
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){
            return new ArrayList<Integer>();
        }
        List<Integer> ans=new ArrayList<>();
        Stack<TreeNode> s=new Stack<>();
        s.add(root);
        find(root,ans,s);
        return ans;
        
    }
}