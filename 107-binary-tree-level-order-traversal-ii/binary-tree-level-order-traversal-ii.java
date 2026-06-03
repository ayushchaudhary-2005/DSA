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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null){
            List<List<Integer>> ans=new ArrayList<>();
            return ans;
        }
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> al=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                al.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            ans.add(al);
        }
        for(int i=0;i<ans.size()/2;i++){
            List<Integer> curr=ans.get(i);
            ans.set(i,ans.get(ans.size()-i-1));
            ans.set(ans.size()-1-i,curr);
        }
        return ans;
    }
}