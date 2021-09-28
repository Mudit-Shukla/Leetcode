/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 28-09-2021
 *   Time: 00:39
 *   File: PascalsTriangle.java
 */

package problemset;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


//        List<List<Integer>> l2 = new ArrayList<>();
//
//        for(int i=0; i<n; i++){
//            List<Integer> l1 = new ArrayList<>(i+1);
//            l1.add(0,1);
//            l1.add(i, 1);
//            l2.add(l1);
//        }
//
//        for(int i =2; i< n;i++){
//            for(int j = 1; j< l2.get(i).size()-1; i++){
//                l2.get()
//            }
//        }

//        int [][] array = new int[n][n];

        ArrayList<List<Integer>> lists = new ArrayList<>(n);

        for(int i =0; i< n; i++){
            ArrayList<Integer> list = new ArrayList<>(i+1);
            for(int j = 0; j<= i; j++){
                if( j == 0 || j == i)
                    list.add(j,1);
                else{
                    list.add(j, lists.get(i-1).get(j-1) + lists.get(i-1).get(j));
                }
            }
            lists.add(list);
        }
//
//
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(lists.get(i).get(j) + " ");
            }
            System.out.println();
        }


    }
}
