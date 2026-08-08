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
    public TreeNode find(int arr[],int s,int e){
        if(s>e){
            return null;
        }
        int mid=s+(e-s)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=find(arr,s,mid-1);
        root.right=find(arr,mid+1,e);
        return root; 
    }
    public TreeNode sortedArrayToBST(int[] arr) {
        return find(arr,0,arr.length-1);
        
    }
}