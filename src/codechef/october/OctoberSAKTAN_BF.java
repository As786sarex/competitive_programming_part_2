package codechef.october;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class OctoberSAKTAN_BF {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String[] str=reader.readLine().split(" ");
            int m= Integer.parseInt(str[0]),n= Integer.parseInt(str[1])
                    ,q= Integer.parseInt(str[2]);
            int[][] arr=new int[m][n];
            while(q-->0){
                String[] s=reader.readLine().split(" ");
                int x= Integer.parseInt(s[0])-1,y= Integer.parseInt(s[1])-1;
                for (int i = 0; i <n ; i++) {
                    arr[x][i]=arr[x][i]+1;
                }
                for (int i = 0; i <m ; i++) {
                    arr[i][y]=arr[i][y]+1;
                }
            }
            for (int i = 0; i <m ; i++) {
                System.out.println(Arrays.toString(arr[i]));
            }
            long res=0;
            for (int i = 0; i <m ; i++) {
                for (int j = 0; j <n ; j++) {
                    if ((arr[i][j]&1)==1){
                        res++;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
/*

10 10 3
1 1
1 2
2 1*/