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
    public ListNode reverse(ListNode l){
        ListNode temp=l;
        ListNode curr=l;
        ListNode pre=null;
        while(curr!=null){
            curr=curr.next;
            temp.next=pre;
            pre=temp;
            temp=curr;
        }
        return pre;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverse(l1);
        l2=reverse(l2);
        ListNode fake=new ListNode(0);
        ListNode a=fake;
        int bar=0; 
        while(l1!=null && l2!=null){
            ListNode b=new ListNode(0);
            bar=(l1.val+l2.val+bar);
            if(bar>9){
                b.val=bar%10;
                bar=1;
            }else{
                b.val=bar;
                bar=0;
            }
            l1=l1.next;
            l2=l2.next;
            a.next=b;
            a=b;
        }
        while(l1!=null){
            l1.val=(l1.val+bar);
            if(l1.val>9){
                bar=1;
                l1.val%=10;
            }else{
                bar=0;
            }
            a.next=l1;
            a=l1;
            l1=l1.next;
        }
        while(l2!=null){
            l2.val=(l2.val+bar);
            if(l2.val>9){
                bar=1;
                l2.val%=10;
            }else{
                bar=0;
            }
            a.next=l2;
            a=l2;
            l2=l2.next;
        }
        if(bar!=0){
            ListNode s=new ListNode(bar);
            a.next=s;
        }
        fake=fake.next;
        fake=reverse(fake);
        return fake;
    }
}