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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp=head;
        int i=0;
        while(temp!=null){
            temp=temp.next;
            i++;
        }
        int z=1;
        int zz=0;
        temp=head;
        if(i>k){
            z=i/k;
            zz=i%k;
        }
        int s=0;
        ListNode[] arr=new ListNode[k];
        for(int j=0;j<k;j++){
            arr[j]=temp;
            ListNode nxt=arr[j];
            while(nxt!=null && s!=(z-1)){
                nxt=nxt.next;
                s++;
            }
            s=0;
            // if(j==0){
            //     while(s!=zz && nxt!=null){
            //         nxt=nxt.next;
            //         s++;
            //     }
            //     s=0;
            // }
            if(zz>=1 && nxt!=null){
                nxt=nxt.next;
                zz--;
            }
            if(nxt!=null){
                temp=nxt.next;
                nxt.next=null;
            }else{
                temp=null;
            }
        }
        return arr;
    }
}