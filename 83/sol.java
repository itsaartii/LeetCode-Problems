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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode firstptr = head;
        
        while(firstptr != null && firstptr.next != null){
            if(firstptr.val == firstptr.next.val){
                firstptr.next = firstptr.next.next;

            }else{
                firstptr = firstptr.next;
                
            }
        }
        return head;
    }
}