package codechef.codevitapractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UjjalTarget {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        StringTokenizer token =new StringTokenizer(reader.readLine());
        long[] arr=new long[n];
        arr[0]=Long.parseLong(token.nextToken());
        for(int i=1;i<n;i++){
            arr[i]=Long.parseLong(token.nextToken())+arr[i-1];
        }
        int m= Integer.parseInt(reader.readLine());
        while(m-->0){
            long targer= Long.parseLong(reader.readLine());
            if (targer>arr[n-1]){
                System.out.println(-1);
            }
            else{
                for (int i = 0; i <n ; i++) {
                    if(arr[i]>=targer){
                        System.out.println(i+1);
                        break;
                    }
                }
            }
        }
    }
}
