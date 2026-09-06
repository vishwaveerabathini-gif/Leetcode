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
    public void reverse(ListNode fake,int k,int z,ListNode du){
        ListNode curr=fake;
        ListNode dupe=null;
        ListNode s=fake;
        while(z!=k){
            if((z+1)!=k){
                curr=curr.next;
            }
            s.next=dupe;
            dupe=s;
            s=curr;
            z++;
        }
        du.next=s;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode d=new ListNode(0);
        ListNode du=d;
        ListNode fake=head;
        ListNode f1=head;
        ListNode rec=head;
        int z=0;
        while(f1!=null){
            f1=f1.next;
            z++;
            if(z==k){
                z=0;
                reverse(fake,k,z,du);
                fake=f1;
                du=rec;
                rec=f1;
                z=0;
            }
        }
        while(rec!=null){
            du.next=rec;
            du=rec;
            rec=rec.next;
        }
        return d.next;
    }
}