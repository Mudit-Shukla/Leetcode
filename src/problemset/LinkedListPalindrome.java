/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 22-01-2022
 *   Time: 00:52
 *   File: LinkedListPalindrome.java
 */

package problemset;

public class LinkedListPalindrome {

//   public boolean isPalindrome(ListNode head) {
//
//        if(head.next == null || head == null)
//            return true;
//
//        ListNode slowPointer = head;
//        ListNode fastPointer = head;
//
//        while(fastPointer.next != null && fastPointer.next.next != null){
//            slowPointer = slowPointer.next;
//            fastPointer = fastPointer.next.next;
//        }
//
//        ListNode previous = slowPointer;
//        ListNode current = previous.next;
//        ListNode next = current.next;
//
//        while(next != null){
//            current.next = next.next;
//            next.next = previous.next;
//            previous.next = next;
//            next = current.next;
//        }
//
//        slowPointer = slowPointer.next;
//
//        while(slowPointer != null){
//            if(head.val != slowPointer.val)
//                return false;
//            head = head.next;
//            slowPointer = slowPointer.next;
//        }
//        return true;
//    }

}


