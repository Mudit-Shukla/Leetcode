/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 30-01-2022
 *   Time: 01:56
 *   File: MinimumPlatforms.java
 */

package problemset;

import java.util.Arrays;

public class MinimumPlatforms {

    public static int findPlatforms(int[] arr, int[] dep, int n){

        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 0;
        int j = 0;
        int maxTrains = 0;
        int platform = 0;
        while(i < n && j < n){
            if(arr[i] <= dep[j]){
                maxTrains++;
                i++;
            }else{
                platform = Math.max(maxTrains, platform);
                maxTrains--;
                j++;
            }
        }
        return Math.max(platform, maxTrains);

    }

}
