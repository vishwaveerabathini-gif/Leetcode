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
    public void check(ListNode temp,ListNode dup,ArrayList<Integer> arr,ListNode nxt,int ii){
        if(dup.val==-69 || nxt==null){
            return;
        }
        if(temp.val>dup.val && temp.val>nxt.val){
            arr.add(ii);
        }
        if(temp.val<dup.val && temp.val<nxt.val){
            arr.add(ii);
        }
    }
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        int ii=1;
        ListNode temp=head;
        ListNode dup=new ListNode(-69);
        ListNode nxt=head.next;
        int []ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        while(nxt!=null){
            check(temp,dup,arr,nxt,ii);
            dup.next=temp;
            dup=temp;
            temp=temp.next;
            nxt=nxt.next;
            ii++;
        }
        if(arr.size()>=2){
            ans[0]=arr.get(1)-arr.get(0);
            for(int i=2;i<arr.size();i++){
                ans[0]=Math.min(ans[0],Math.abs(arr.get(i)-arr.get(i-1)));
            }
            ans[1]=arr.get(arr.size()-1)-arr.get(0);
        }
        return ans;
    }
}