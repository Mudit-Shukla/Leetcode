/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 09-01-2022
 *   Time: 15:04
 *   File: ReversePairs.java
 */

package problemset;

import java.util.ArrayList;

public class ReversePairs {

    public static void main(String[] args) {
        System.out.println(countReversePairs(new int[]{1, 3, 2, 3, 1}));
    }

    public static int countReversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public static int merge(int[] nums, int low, int mid, int high) {
        int count = 0;
        int j = mid + 1;
        for (int i = low; i < mid + 1; i++) {
            while (j <= high && nums[i] > (2 * (long) nums[j])) {
                j++;
            }
            count += (j - (mid + 1));
        }

        ArrayList<Integer> temp = new ArrayList<>();
        int left = low, right = mid + 1;
        while (left < mid+1 && right < high+1) {
            if (nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left++;
            } else {
                temp.add(nums[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(nums[left]);
            left++;
        }
        while (right <= high) {
            temp.add(nums[right]);
            right++;
        }

        int k = 0;
        for(int i = low; i <= high; i++){
            nums[i] = temp.get(k);
            k++;
        }
        return count;
    }

    public static int mergeSort(int[] nums, int low, int high) {
        if (low >= high) return 0;
        int mid = (low + high) / 2;
        int count = mergeSort(nums, low, mid);
        count += mergeSort(nums, mid + 1, high);
        count += merge(nums, low, mid, high);
        return count;
    }


}