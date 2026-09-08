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
    public void reverse(ListNode s,ListNode temp){
        s.next=null;
        ListNode l1=temp;
        ListNode l2=temp.next;
        if(l2==null){
            l1.next=s;
            return;
        }
        while(l2!=null){
            if(l1.val<=s.val && l2.val>=s.val){
                s.next=l2;
                l1.next=s;
                return;
            }else{
                l1=l2;
                l2=l2.next;
            }
        }
        l1.next=s;
    }
    public ListNode insertionSortList(ListNode head) {
        ListNode temp=new ListNode(Integer.MIN_VALUE);
        ListNode fake=temp;
        ListNode temp1=head;
        while(temp1!=null){
            ListNode s=temp1;
            temp1=temp1.next;
            reverse(s,fake);
        }
        return temp.next;
    }
}