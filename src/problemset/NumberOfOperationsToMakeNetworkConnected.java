/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 04-01-2022
 *   Time: 19:47
 *   File: NumberOfOperationsToMakeNetworkConnected.java
 */

package problemset;

import java.util.ArrayList;

public class NumberOfOperationsToMakeNetworkConnected {

    public int makeConnected(int n, int[][] connections){
        if(connections.length < n-1)
            return -1;
        ArrayList<Integer> [] graph = new ArrayList[n];
        for(int i = 0; i< n; i++)
            graph[i] = new ArrayList<>();
        for(int i = 0; i< connections.length; i++){
            int source = connections[i][0];
            int destination = connections[i][1];
            graph[source].add(destination);
            graph[destination].add(source);
        }

        boolean[] visited = new boolean[n];
        int components = 0;
        for(int vertex = 0; vertex < n; vertex++){
            if(!visited[vertex]){
                components += getComponents(graph, vertex, visited);
            }
        }
        return components - 1;
    }

    public int getComponents(ArrayList<Integer> [] graph, int vertex, boolean[] visited){
        if(visited[vertex])
            return 0;
        visited[vertex] = true;
        for(int neighbour : graph[vertex]){
            getComponents(graph, neighbour, visited);
        }
        return 1;
    }
}


