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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp1 = head;
        ListNode temp2 = head;
        for(int i=0;i<k-1;i++){
                temp1 = temp1.next;
        }
        ListNode temp3 = temp1;
        while(temp3.next !=null){
            temp2 = temp2.next;
            temp3 = temp3.next;
        }
        System.out.print(temp1.val +" " + temp2.val);
        int a = temp1.val;
        temp1.val = temp2.val;
        temp2.val = a;
        return head;
    }
}
