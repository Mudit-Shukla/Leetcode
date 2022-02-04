/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 04-02-2022
 *   Time: 15:54
 *   File: ReverseNodesInKGroups.java
 */

package problemset;

public class ReverseNodesInKGroups {

//    public ListNode reverseKGroup(ListNode head, int k) {
//
//        ListNode dummyNode = new ListNode(0);
//        dummyNode.next = head;
//
//        int length = 0;
//        ListNode temp = head;
//        while(temp != null){
//            temp = temp.next;
//            length++;
//        }
//
//        ListNode current = dummyNode;
//        ListNode next = dummyNode;
//        ListNode previous = dummyNode;
//
//        while(length >= k){
//
//            current = previous.next;
//            next = current.next;
//            for(int i = 0; i< k-1; i++){
//                current.next = next.next;
//                next.next = previous.next;
//                previous.next = next;
//                next = current.next;
//            }
//
//            previous = current;
//            length = length - k;
//
//        }
//
//        return dummyNode.next;
//    }

}
