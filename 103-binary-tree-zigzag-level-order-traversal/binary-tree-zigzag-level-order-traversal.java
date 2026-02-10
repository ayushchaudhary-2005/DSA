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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> q=new LinkedList<>();
        boolean reversed=false;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> al=new ArrayList<>();
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
            if(reversed){
                Collections.reverse(al);
                ans.add(new ArrayList<>(al));
            }
            else{
                ans.add(new ArrayList<>(al));
            }
            reversed=!reversed;
        }
        return ans;
        
    }
}