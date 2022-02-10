/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 05-02-2022
 *   Time: 16:23
 *   File: BinaryTreeLevelOrder.java
 */

package problemset;


//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
//public class BinaryTreeLevelOrder {
//
//    public static List<List<Integer>> bfs(Node root){
//        Queue<Node> queue = new LinkedList<>();
//        List<List<Integer>> answer = new ArrayList<>();
//        queue.add(root);
//        while(!queue.isEmpty()){
//            List<Integer> list = new ArrayList<>();
//            for(int i = 0; i< queue.size(); i++){
//                Node node = queue.poll();
//                list.add(node.data);
//                if(node.left != null)
//                    queue.add(node.left);
//                if(node.right != null)
//                    queue.add(node.right);
//            }
//            answer.add(list);
//        }
//    return answer;
//    }
//}
//
//class Node{
//    Integer data;
//    Node left;
//    Node right;
//    public Node(int data){
//        this.data = data;
//    }
//}

