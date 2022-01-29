/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 29-01-2022
 *   Time: 15:38
 *   File: RotateList.java
 */

package problemset;

public class RotateList {

    class ListNode {
      int val;
      ListNode next;
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }}

    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || k == 0)
            return head;

        ListNode temp = head;
        int count = 1;
        while(temp.next != null){
            temp = temp.next; count++;
        }

        temp.next = head;

        ListNode current = head;
        k = count - (k % count)-1;
        while(k > 0){
            current = current.next;
            k--;
        }

        temp = current.next;
        current.next = null;
        return temp;
    }
}
