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
    public ArrayList<Integer> find(TreeNode root,int target){
        if(root==null){
            return new ArrayList<>();
        }
        if(root.left==null && root.right==null){
            ArrayList<Integer> al=new ArrayList<>();
            al.add(root.val);
            return al;
        }
        ArrayList<Integer> left=find(root.left,target);
        ArrayList<Integer> right=find(root.right,target);
        ArrayList al=new ArrayList<>();
        if(left.size()>0){
            for(int i=0;i<left.size();i++){
                if(left.get(i)>=root.val && target<=left.get(i)){
                    al.add(left.get(i));
                }

            }
        }
        if(right.size()>0){
            for(int i=0;i<right.size();i++){
                if(right.get(i)>=root.val && target<=right.get(i)){
                    al.add(right.get(i));
                }

            }

        }
        al.add(root.val);
        return al;


    }
    public int goodNodes(TreeNode root) {
        ArrayList<Integer> nal=find(root,root.val);
        return nal.size();
        
    }
}