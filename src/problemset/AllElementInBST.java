/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 26-01-2022
 *   Time: 12:11
 *   File: AllElementInBST.java
 */

package problemset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllElementInBST {

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(4);
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(0);
        root2.right = new TreeNode(3);
        List<Integer> list = getAllElements(root1, root2);

    }

    public static List<Integer> getAllElements(TreeNode root1, TreeNode root2){
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1 = inOrderTraversal(root1, l1);
        l2 = inOrderTraversal(root2, l2);
        int i = l1.size()-1;
        int j = l2.size()-1;
        l1.addAll(l2);
        Collections.sort(l1);
        for(int element : l1)
            System.out.print(element + "  ");
        return l1;
    }

    public static List<Integer> inOrderTraversal(TreeNode root, List<Integer> list){
        if(root == null)
            return list;
        inOrderTraversal(root.left, list);
        list.add(root.data);
        inOrderTraversal(root.right, list);
        return list;
    }

    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
