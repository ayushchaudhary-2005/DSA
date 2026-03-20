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
    public ArrayList<TreeNode> find(int n){
        if(n%2==0){
            return new ArrayList<>();
        }
        if(n==1){
            TreeNode k=new TreeNode(0);
            ArrayList<TreeNode> al=new ArrayList<>();
            al.add(k);
            return al;
        }
        ArrayList<TreeNode> res=new ArrayList<>();
        for(int i=1;i<n;i+=2){
            ArrayList<TreeNode> left=find(i);
            ArrayList<TreeNode> right=find(n-i-1);
            for(TreeNode l:left){
                for(TreeNode r:right){
                    TreeNode curr=new TreeNode(0);
                    curr.left=l;
                    curr.right=r;
                    res.add(curr);
                }
            }

        }
        return res;
    }
    public List<TreeNode> allPossibleFBT(int n) {
        ArrayList<TreeNode> ans=find(n);
        return ans;
        
    }
}