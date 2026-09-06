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
    public void check(ListNode temp,int[] arr,int i){
        ListNode s=temp;
        while(s!=null){
            if(s.val>temp.val){
                arr[i]=s.val;
                break;
            }
            s=s.next;
        }
    }
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;
        int i=0;
        while(temp!=null){
            temp=temp.next;
            i++;
        }
        int []arr=new int[i];
        temp=head;
        i=0;
        while(temp!=null){
            check(temp,arr,i);
            temp=temp.next;
            i++;
        }
        return arr;
    }
}