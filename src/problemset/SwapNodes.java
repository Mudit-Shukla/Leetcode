/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 20-01-2022
 *   Time: 14:14
 *   File: SwapNodes.java
 */

package problemset;

public class SwapNodes {

    public ListNode swapNodes(ListNode head, int k){
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        int length = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            length++;
        }

        ListNode current = dummyNode;
        ListNode next = dummyNode;
        ListNode previous = dummyNode;

        while(length >= k){

            current = previous.next;
            next = current.next;
            for(int i = 0; i< k-1; i++){
                current.next = next.next;
                next.next = previous.next;
                previous.next = next;
                next = current.next;
            }

            previous = current;
            length = length - k;

        }

        return dummyNode.next;
    }

    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
}
