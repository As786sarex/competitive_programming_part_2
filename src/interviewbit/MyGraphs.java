package interviewbit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MyGraphs {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int node= Integer.parseInt(reader.readLine());
        int edge= Integer.parseInt(reader.readLine());
        int matRow= Integer.parseInt(reader.readLine());
        int matCol= Integer.parseInt(reader.readLine());
        int[] nodesDegree=new int[node+1];
        int[][] adjacency=new int[matRow][matCol];
        int i=0;
        while(edge-->0){
            String[] str=reader.readLine().split(" ");
            int a= Integer.parseInt(str[0]),b= Integer.parseInt(str[1]);
            nodesDegree[a]=nodesDegree[a]+1;
            nodesDegree[b]=nodesDegree[b]+1;
            adjacency[i][0]= Math.min(a, b);
            adjacency[i][1]=Math.max(a,b);
            i++;
        }
        if(node>=edge){
            System.out.println(-1);
        }
        System.out.println(i);
        System.out.println(Arrays.toString(nodesDegree));
        for (int j = 0; j <matRow ; j++) {
            System.out.println(Arrays.toString(adjacency[j]));
        }
        boolean isfeasible=true;
        int oneCount=0;
        for (int j = 1; j <=node ; j++) {
            if (nodesDegree[j]==1){
                oneCount++;
            }
            if (oneCount>=3){
                isfeasible=false;
            }
        }
        if (!isfeasible){
            System.out.println(-1);
            return;
        }


    }
}
