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
    public ListNode deleteMiddle(ListNode head) {
        // if(head==null || head.next==null)
        //     return null;
        
        // if(head.next.next==null){
        //     head.next=null;
        //     return head;
        // }
        // int count =0;
        // ListNode slow = head;
        // while(slow!=null){
        //     count++;
        //     slow = slow.next;
        // }
        // ListNode fast = head;
        // slow = head;
        // while(fast!=null&&fast.next!=null && fast.next.next!=null)
        // {
        //     fast=fast.next.next;
        //     slow = slow.next;
        // }
        // if(count%2==0)
        //     slow.next = slow.next.next;
        // else{
        //     slow.val = slow.next.val;
        //     slow.next = slow.next.next;
        // }
        // return head;
        if(head.next==null)
            return null;
        ListNode slow = head;
        ListNode fast = head.next.next;
        while(fast!=null && fast.next!=null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }
            slow.next = slow.next.next;
            return head;
    }
}