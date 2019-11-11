package imageutil;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class MobilePhones {
    public static void main(String[] args) throws Exception {
        final BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(reader.readLine());
        long[] arr=new long[t];
        for (int i = 0; i <t ; i++) {
            arr[i]= Long.parseLong(reader.readLine());
        }
        Arrays.sort(arr);
        for (int i = t-1; i >=0 ; i--) {
            arr[i]=(arr[i]*(t-i));
        }
        long res=Long.MIN_VALUE;
        for (int i = 0; i <t ; i++) {
            res=Math.max(res,arr[i]);
        }
        System.out.println(res);
    }
}
