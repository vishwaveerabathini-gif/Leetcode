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
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int max=0;
        int count=0;
        for(int x: nums){
            set.add(x);
        }
        ListNode temp=head;
        while(temp!=null){
            if(set.contains(temp.val)){
                count++;
            }else{
                if(count>0){
                    max++;
                    count=0;
                }
            }
            temp=temp.next;
        }
        if(count>0){
            max++;
        }
        return max;
    }
}