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
    public int getDecimalValue(ListNode head) {
        StringBuilder sb=new StringBuilder();
        ListNode temp=head;
        while(temp!=null){
            sb.append(temp.val);
            temp=temp.next;
        }
        String s=sb.toString();
        int num=0;
        int pow=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            int curr=ch-'0';
            num=num+((int)Math.pow(2,pow))*curr;
            pow++;
        }
        return num;        
    }
}