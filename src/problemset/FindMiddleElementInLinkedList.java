/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 17-01-2022
 *   Time: 18:26
 *   File: FindMiddleElementInLinkedList.java
 */

package problemset;

public class FindMiddleElementInLinkedList {

    public ListNode middleNode(ListNode head){
        if(head == null)
            return head;

        ListNode fastPointer = head;
        ListNode slowPointer = head;
        while(fastPointer != null && fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }

    class ListNode {
        ListNode next;
        int val;
        public ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
}
