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
    public ListNode solution(ListNode prev , ListNode curr , ListNode temp){
        if(curr == null){
            return prev;
        }
        temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
        
        return solution(prev , curr , temp);
    }
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
         ListNode prev = null;
         ListNode curr = head;
         ListNode temp = prev;
        //  while(curr!=null){
        //     temp = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = temp;
        //  }
         return solution(prev,curr,temp);
    }
}

