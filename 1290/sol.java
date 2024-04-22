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
        ListNode ptr = head;
        int decimal = 0;
        while(ptr != null){
            decimal = (decimal << 1) | ptr.val;
            ptr = ptr.next;

        }
        return decimal;
    }
}