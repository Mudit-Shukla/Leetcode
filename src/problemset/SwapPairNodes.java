/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 20-01-2022
 *   Time: 14:07
 *   File: SwapPairNodes.java
 */

package problemset;

public class SwapPairNodes {


    /**
     *
     * Example ->   1 ----> 2 -----> 3 ----> 4 -----> 5
     * Output  ->   2 ----> 1 -----> 4 ----> 3 -----> 5
     *
     * We need to swap each pair
     *
     */

//    public ListNode swapPairs(ListNode head) {
//        ListNode dummyNode = new ListNode(0, head);
//        ListNode current = dummyNode;
//        while(current.next != null && current.next.next != null){
//            ListNode first = current.next;
//            ListNode second = first.next;
//            first.next = second.next;
//            second.next = first;
//            current.next = second;
//            current = first;   //  POSITIONS OF FIRST AND SECOND HAVE INTERCHANGED
//        }
//
//        return dummyNode.next;
//    }
}
