package imageutil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Flight {
    private final static int INF = 999999999;

    private void floydWarshall(int[][] graph,int V) {
        int[][] dist = new int[V][V];
        int i, j, k;
        for (i = 0; i < V; i++)
            for (j = 0; j < V; j++)
                dist[i][j] = graph[i][j];
        for (k = 0; k < V; k++) {
            for (i = 0; i < V; i++) {
                for (j = 0; j < V; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];
                }
            }
        }
        printSolution(dist,V);
    }

    private void printSolution(int[][] dist,int V) {
        int res=Integer.MIN_VALUE;
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (i != j) {
                    if (dist[i][j] != INF && res < dist[i][j]) {
                        res = dist[i][j];
                    }
                }
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) throws IOException {
        Flight a = new Flight();
        final BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] str=reader.readLine().split(" ");
        int v= Integer.parseInt(str[0]);
        int f= Integer.parseInt(str[1]);
        int[][] graph =new int[v][v];
        for (int i = 0; i <v ; i++) {
            Arrays.fill(graph[i],INF);
        }
        while(f-->0){
            String[] raw=reader.readLine().split(" ");
            int i= Integer.parseInt(raw[0])-1;
            int j= Integer.parseInt(raw[1])-1;
            graph[i][j]=graph[j][i]= Integer.parseInt(raw[2]);
        }
        a.floydWarshall(graph,v);
    }
}

