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
    public ListNode doubleIt(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        ListNode temp=prev;
        int carry=0;
        while(temp!=null){
            int val=2*temp.val+carry;
            int av=val%10;
            temp.val=av;
            carry=val/10;
            temp=temp.next;
        }
        temp=head;
        prev=null;
        curr=head;
         while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        if(carry!=0){
            ListNode nn=new ListNode(carry);
            nn.next=prev;
            head=nn;
        }
        return head;
        


       
        
    }
}