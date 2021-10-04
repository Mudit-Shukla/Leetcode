/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 31-08-2021
 *   Time: 00:14
 *   File: AddTwoSum.java
 */

package problemset;

public class AddTwoSum {

    class ListNode{
        private int val;
        private ListNode next;
        ListNode(){}
        ListNode(int data){
            this.val = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {



    }

    public static void addTwoNumbers(ListNode l1, ListNode l2) {

//        ListNode head = new ListNode();
//        ListNode temp = head;
//        int carry = 0;
//        int sum = 0;
//        while(l1 != null && l2!= null){
//            sum = l1.val + l2.val + carry;
//            if(sum > 9){
//                sum = sum % 10;
//                carry = 1;
//            }
//            else
//                carry = 0;
//            if(temp == null)
//                temp = new ListNode(sum);
//            else
//                temp.next = new ListNode(sum);
//            l1 = l1.next;
//            l2 = l2.next;
//            temp = temp.next;
//        }
//
//        while(l1 != null){
//            sum = l1.val + carry;
//            if(sum > 9){
//                sum = sum%10;
//                carry = 1;
//            }else
//                carry = 0;
//            l1 = l1.next;
//            temp.next = new ListNode(sum);
//            temp = temp.next;
//
//        }
//
//        while(l2 != null){
//            sum = l2.val + carry;
//            if(sum > 9){
//                sum = sum%10;
//                carry = 1;
//            }else
//                carry = 0;
//            l2 = l2.next;
//            temp.next = new ListNode(sum);
//            temp = temp.next;
//
//        }
//
//        if(carry != 0)
//            temp.next = new ListNode(1);
//
//
//        return head.next;

    }
}

