/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode makeBST(ArrayList<ListNode> al,int s ,int e){
        if(s>e){
            return null;
        }
        int mid=s+(e-s)/2;
        TreeNode node=new TreeNode(al.get(mid).val);
        node.left=makeBST(al,s,mid-1);
        node.right=makeBST(al,mid+1,e);
        return node;

    }
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<ListNode> al=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            al.add(curr);
            curr=curr.next;
        }
        return makeBST(al,0,al.size()-1);
        
    }
}