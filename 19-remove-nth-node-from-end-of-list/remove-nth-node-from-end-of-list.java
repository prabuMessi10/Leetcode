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
 import java.util.LinkedList;
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size =0;
        ListNode temp1 = head;
        while(temp1!=null){
            size++;
            temp1=temp1.next;
        }
        if(size == n){
            head = head.next;
            return head;
        }
        temp1 = head;
        if(n==1){
            if(size==2){
                head.next=null;
                return head;
            }
            while(temp1.next.next!=null){
                temp1 = temp1.next;
            }
            temp1.next=null;
            return head;
        }
        int del = size-n-1;
        ListNode temp =head;
        for(int i=1;i<=del;i++){
            temp=temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}