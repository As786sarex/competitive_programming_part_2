package imageutil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tournament {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(reader.readLine());
        long result=0;
        StringTokenizer tokenizer=new StringTokenizer(reader.readLine());
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
           arr[i]=Integer.parseInt(tokenizer.nextToken());
        }
        for (int i = 0; i <n ; i++) {
            int a=arr[i];
            for (int j = i; j <n ; j++) {
                result+=Math.abs(a-arr[j]);
            }
        }
        System.out.println(result);
    }
}
