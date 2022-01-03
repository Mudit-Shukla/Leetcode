/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 04-01-2022
 *   Time: 01:44
 *   File: HasPath.java
 */

package problemset;

import java.util.ArrayList;
import java.util.Stack;

public class HasPath {
    /**
     * Runtime: 186 ms, faster than 37.08% of Java online submissions for Find if Path Exists in Graph.
     * Memory Usage: 174.4 MB, less than 33.78% of Java online submissions for Find if Path Exists in Graph.
     */

    public boolean validPath(int n, int[][] edges, int start, int end) {
        ArrayList<Edge> [] graph = new ArrayList[n];
        for(int i = 0; i< graph.length; i++)
            graph[i] = new ArrayList<Edge>();
        for(int i = 0; i< edges.length; i++){
            int source = edges[i][0];
            int destination = edges[i][1];
            graph[source].add(new Edge(source, destination));
            graph[destination].add(new Edge(destination, source));
        }

        boolean[] visited = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        visited[start] = true;
        while(!stack.empty()){
            int current = stack.peek();
            if(current == end)
                return true;
            stack.pop();
            for(Edge neighbour : graph[current]){
                if(!visited[neighbour.destination]){
                    stack.push(neighbour.destination);
                    visited[neighbour.destination] = true;
                }
            }
        }
        return false;
    }
}

class Edge{
    int source;
    int destination;

    public Edge(int source, int destination){
        this.source = source;
        this.destination = destination;
    }
}
