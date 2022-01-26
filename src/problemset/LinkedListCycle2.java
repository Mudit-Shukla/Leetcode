/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 27-01-2022
 *   Time: 02:20
 *   File: LinkedListCycle2.java
 */

package problemset;

public class LinkedListCycle2 {

//    public ListNode detectCycle(ListNode head) {
//        ListNode slowPointer = head;
//        ListNode fastPointer = head;
//
//        if(head == null || head.next == null )
//            return null;
//        while(fastPointer.next != null && fastPointer.next.next != null){
//            slowPointer = slowPointer.next;
//            fastPointer = fastPointer.next.next;
//            if(slowPointer == fastPointer){
//                ListNode temp = head;
//                while(temp != slowPointer){
//                    temp = temp.next;
//                    slowPointer = slowPointer.next;
//                }
//                return slowPointer;
//            }
//        }
//        return null;
//    }
}
