/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
 struct ListNode* reverse(struct ListNode* head){
    if(head->next==NULL)
        return head;
    struct ListNode* prev = NULL;
    struct ListNode* current = head;
    struct ListNode* last = head;
    while(current!=NULL){
        last = last->next;
        current->next = prev;
        prev = current;
        current = last;
    }
    return prev;
 }

struct ListNode* removeNodes(struct ListNode* head) {
    head = reverse(head);
    struct ListNode* temp = head;
    while(temp->next!=NULL){
        if(temp->val > temp->next->val){
            struct ListNode* temp1 = temp->next;
            temp->next = temp->next->next;
            free(temp1);
        }
        else
            temp = temp->next;
    }
    return reverse(head);
}