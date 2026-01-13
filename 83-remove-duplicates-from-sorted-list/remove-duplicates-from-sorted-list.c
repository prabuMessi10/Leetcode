/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
   struct ListNode* first=head;
   while(first!=NULL && first->next!=NULL){
    if(first->val==first->next->val){
        first->next=first->next->next;
        continue;
    }
    first=first->next;
   }
   return head;
}