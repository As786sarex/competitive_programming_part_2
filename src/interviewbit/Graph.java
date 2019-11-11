package interviewbit;

import java.util.*;

class Solution {
    public List<String> findItinerary(String[][] edges) {
        int N = edges.length; //At most n nodes.
        //Build the graph
        Map<String, LinkedList<String>> graph = new HashMap<>();
        for (String[] edge : edges){
            String from = edge[0];
            String to = edge[1];
            if (!graph.containsKey(from)) graph.put(from,new LinkedList<>());
            graph.get(from).add(to);
        }
        sort(graph);
        LinkedList<String> path = new LinkedList<>();
        dfs("JFK", path, graph);
        return path;
    }

    private void sort(Map<String, LinkedList<String>> graph){
        for (String key: graph.keySet()){
            Collections.sort(graph.get(key));
        }
    }
    private void dfs(String node, LinkedList<String> path, Map<String, LinkedList<String>> graph){
        if (graph.containsKey(node))

            while (graph.get(node).size() != 0){
                String nei = graph.get(node).poll();
                dfs(nei, path, graph);
            }
        path.addFirst(node);
    }

    public static void main(String[] args) {

    }
}