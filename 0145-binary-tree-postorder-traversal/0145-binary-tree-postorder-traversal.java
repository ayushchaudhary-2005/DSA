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
    public static void find(TreeNode root,List<Integer> al,Stack<TreeNode> s){
        while(!s.isEmpty()){
            TreeNode curr=s.pop();
            al.add(curr.val);
            if(curr.left!=null){
                s.push(curr.left);
            }
            if(curr.right!=null){
                s.push(curr.right);
            }

        }

    }
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null){
            return new ArrayList<Integer>();
        }
        List<Integer> al=new ArrayList<>();
        Stack<TreeNode> s=new Stack<>();
        s.add(root);
        find(root,al,s);
        for(int i=0;i<al.size()/2;i++){
            int curr=al.get(i);
            al.set(i,al.get(al.size()-i-1));
            al.set(al.size()-i-1,curr);
        }
        return al;
    }
}