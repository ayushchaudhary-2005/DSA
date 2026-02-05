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
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            return null;
        }
        int nodes=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            nodes++;
        }
        int mid=nodes/2;
        temp=head;
        ListNode prev=head;
        int c=0;
        while(c<mid){
            c++;
            prev=temp;
            temp=temp.next;

        }
        prev.next=temp.next;
        temp.next=null;
        return head;
        
    }
}