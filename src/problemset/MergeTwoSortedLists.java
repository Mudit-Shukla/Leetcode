/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 30-09-2021
 *   Time: 03:45
 *   File: MergeTwoSortedLists.java
 */

package problemset;

public class MergeTwoSortedLists {
    public static void main(String[] args) {

        /**
         * Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Sorted Lists.
         * Memory Usage: 38.3 MB, less than 80.01% of Java online submissions for Merge Two Sorted Lists.
         */


//        if(l1 == null && l2 == null)
//            return null;
//        if(l1 == null)
//            return l2;
//        if(l2 == null)
//            return l1;
//        ListNode list = new ListNode(-1);
//        ListNode temp = list;
//        while(l1 != null && l2 != null){
//            if(l1.val <= l2.val){
//                temp.next = new ListNode(l1.val);
//                l1 = l1.next;
//            }else{
//                temp.next = new ListNode(l2.val);
//                l2 = l2.next;
//            }
//            temp = temp.next;
//        }
//
//        if(l1 != null)
//            temp.next = l1;
//        if(l2 != null)
//            temp.next = l2;
//
//        return list.next;


        /**
         * COMPLETED MERGE TWO SORTED LIST USING IN PLACE SORTING (LIKE MERGE SORT)
         */

//        if(l1==null)
//            return l2;
//        if(l2==null)
//            return l1;

//        ListNode root = l1.val>l2.val ? l2 : l1;
//        ListNode currentPre = root;
//        ListNode current = root.next;
//        ListNode other = root==l1 ? l2 : l1;
//
//        while(current!=null) {
//            if(current.val <= other.val) {
//                current = current.next;
//                currentPre = currentPre.next;
//            } else {
//                currentPre.next = other;
//                other = current;
//                current = currentPre.next;
//
//                current = current.next;
//                currentPre = currentPre.next;
//            }
//        }
//
//        currentPre.next = other;
//        return root;

    }
}
