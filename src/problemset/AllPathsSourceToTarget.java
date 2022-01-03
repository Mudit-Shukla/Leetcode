/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 04-01-2022
 *   Time: 00:04
 *   File: AllPathsSourceToTarget.java
 */

package problemset;

import java.util.ArrayList;
import java.util.List;

public class AllPathsSourceToTarget {

    /**
     * Runtime: 2 ms, faster than 94.44% of Java online submissions for All Paths From Source to Target.
     * Memory Usage: 40.4 MB, less than 84.29% of Java online submissions for All Paths From Source to Target.
     */

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> answer = new ArrayList<>();
        int source = 0;
        int destination = graph.length-1;
        boolean[] visited = new boolean[graph.length];
        getPaths(answer, new ArrayList<>(), graph, source, destination, visited);
        return answer;
    }

    public void getPaths(List<List<Integer>> answer, List<Integer> path, int[][] graph, int source, int destination, boolean[] visited){
        path.add(source);
        visited[source] = true;

        if(source == destination){
            answer.add(new ArrayList<>(path));
        }
        else{
            for(int neighbour : graph[source]){
                if(!visited[neighbour])
                    getPaths(answer, path, graph, neighbour, destination, visited);
            }
        }

        path.remove(path.size() - 1);
        visited[source] = false;
    }

}
