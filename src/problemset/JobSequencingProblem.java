/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 30-01-2022
 *   Time: 10:56
 *   File: JobSequencingProblem.java
 */

package problemset;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JobSequencingProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Job[] job = new Job[4];
        for(int i = 0; i< 4; i++){
            job[i] = new Job(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        int[] array = jobSequencing(job, 4);
        for(int num : array)
            System.out.print(num + "   ");
    }

    public static int[] jobSequencing(Job[] jobs, int n){
        Arrays.sort(jobs, new Comparator<Job>() {
            @Override
            public int compare(Job o1, Job o2) {
                return o2.profit - o1.profit;
            }
        });
        int max = 0;
        for(Job job : jobs)
            if(job.end > max)
                max = job.end;
        int[] result = new int[max+1];
        Arrays.fill(result, -1);
        int maxProfit = 0;
        int count = 0;
        for(int i = 0; i< n; i++){
            for(int j = jobs[i].end; j > 0; j--)
                if(result[j] == -1) {
                    result[j] = jobs[i].profit;
                    maxProfit += jobs[i].profit;
                    count += 1;
                    break;
                }
        }
        return new int[]{count, maxProfit};
    }
}

class Job{
    int id;
    Integer end ;
    Integer profit;
    Job(int id, int end, int profit){
        this.id = id;
        this.profit = profit;
        this.end = end;
    }
}
