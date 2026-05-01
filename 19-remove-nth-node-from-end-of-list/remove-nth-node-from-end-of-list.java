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
    public ListNode removeNthFromEnd(ListNode head, int n) {


        if(head.next==null&& n==1){
           head=null;

           return head;
        }
        int count =0;

        ListNode temp=head;

        while(temp!=null){
            count++;
            temp=temp.next;
        }

        int target=count-n;

        temp=head;

        if(target==0){
           

            return head.next;
        }


        for(int i=1;i<target;i++){
                temp=temp.next;
        }



        temp.next=temp.next.next;

        return head;




    }
}