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
    class Pair{
        TreeNode root;
        int val;
        Pair(TreeNode root,int val){
            this.root=root;
            this.val=val;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        int ans=0;
        while(!q.isEmpty()){
            int size=q.size();
            int s=0;
            int e=0;
            for(int i=0;i<size;i++){
                Pair curr=q.poll();
                TreeNode r=curr.root;
                int d=curr.val;
                if(i==0){
                    s=d;
                }
                if(i==size-1){
                    e=d;
                }
                if(r.left!=null){
                    q.add(new Pair(r.left,2*d+1));
                }
                if(r.right!=null){
                    q.add(new Pair(r.right,2*d+2));
                }
            }
            ans=Math.max(ans,e-s+1);
            
        }
        return ans;
        
    }
}