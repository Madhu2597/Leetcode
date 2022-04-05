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
//TC:O(n) SC:O(1)
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        k=k-1;
        ListNode first=head;
        while(k>0){
            first=first.next;
            k--;
        }
        ListNode f=first;
        ListNode sec=head;
        while(f.next!=null){
            sec=sec.next;
            f=f.next;
        }
        int temp=first.val;
        first.val=sec.val;
        sec.val=temp;
        return head;
    }
}