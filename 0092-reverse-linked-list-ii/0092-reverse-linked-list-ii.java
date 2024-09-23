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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevLeft = dummy;

        
        for (int i = 1; i < left; i++) {
            prevLeft = prevLeft.next;
        }

        
        ListNode current = prevLeft.next;
        ListNode prev = null;
        for (int i = 0; i <= right - left; i++) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        
        prevLeft.next.next = current;
        prevLeft.next = prev;

        return dummy.next;
    }
    
}