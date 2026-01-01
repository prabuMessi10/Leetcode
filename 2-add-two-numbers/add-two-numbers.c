/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
// #include<stdlib.h>
//  struct ListNode* reverse(struct ListNode* n){
//     struct ListNode* temp=n;
//     struct ListNode* last=n;
//     struct ListNode* prev=NULL;

//     while(temp!=NULL){
//         last=last->next;
//         temp->next=prev;
//         prev=temp;
//         temp=last;
//     }
//     return prev;
//  }
//  int multi(struct ListNode* n){
//     struct ListNode* temp=n;
//     int sum=0;
//     while(temp!=NULL){
//         sum=sum*10+temp->val;
//         temp=temp->next;
//     }
//     return sum;
//  }
struct ListNode* createNode(struct ListNode* l3,int value){
    struct ListNode* temp = (struct ListNode* )malloc(sizeof(struct ListNode));
    temp->val= value;
    temp->next=NULL;
    if(l3==NULL)
        return temp;
    struct ListNode* newNode = l3;
    while(newNode->next!=NULL){
        newNode=newNode->next;
    }
    newNode->next = temp;
    return l3;
}
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    int carry =0;
    struct ListNode* l3;
    while(l1!=NULL && l2!=NULL){
        int value = l1->val + l2->val + carry;
        l3 = createNode(l3,value%10);
        carry = value/10;
        l1=l1->next;
        l2 = l2->next;
    }
    while(l1!=NULL){
        int value = l1->val+carry;
        l3 = createNode(l3,value%10);
        carry=value/10;
        l1=l1->next;
    }
    while(l2!=NULL){
        int value = l2->val+carry;
        l3 = createNode(l3,value%10);
        carry=value/10;
        l2=l2->next;
    }
    if(carry!=0){
        l3 = createNode(l3,carry);
    }
    return l3;

}
    // struct ListNode* temp1=l1;
    // struct ListNode* temp2=l2;
    // temp1=reverse(temp1);
    // temp2=reverse(temp2);
    // int n1,n2,sum;
    // n1=multi(temp1);
    // n2=multi(temp2);
    // sum=n1+n2;
    // struct ListNode* head;
    // while(sum!=0){
    //     int digit=sum%10;
    //     sum=sum/10;
    //     struct ListNode* temp=malloc(sizeof(struct ListNode));
    //     temp->val=digit;
    //     temp->next=NULL;
    //     if(head==NULL){
    //         head=temp;
    //     }
    //     temp  = temp->next;
       
        
    // }
    // return head;