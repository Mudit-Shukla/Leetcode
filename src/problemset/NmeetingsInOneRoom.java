/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 30-01-2022
 *   Time: 10:12
 *   File: NmeetingsInOneRoom.java
 */

package problemset;

import java.util.Arrays;
import java.util.Comparator;

public class NmeetingsInOneRoom {
    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 5, 8, 5};
        int[] dep = {2, 4, 6, 7, 9, 9};
        System.out.println(maxMeetings(arr, dep, arr.length));
    }

    public static  int maxMeetings(int[] arr, int[] dep, int n){
        Meeting[] meetings = new Meeting[n];
        for(int i = 0; i< n; i++){
            meetings[i] = new Meeting(arr[i], dep[i]);
        }
        Arrays.sort(meetings, new Comparator<Meeting>() {
            @Override
            public int compare(Meeting o1, Meeting o2) {
                return o1.departure-o2.departure;
            }
        });
        int count = 1;
        int i = 0;
        for(int j = 1; j < n; j++){
            if(meetings[j].arrival > meetings[i].departure) {
                count++;
                i = j;
            }
        }
        return count;
    }

    static class Meeting{
        Integer arrival;
        Integer departure;
        Meeting(int arrival, int departure){
            this.arrival = arrival;
            this.departure = departure;
        }
    }
}
