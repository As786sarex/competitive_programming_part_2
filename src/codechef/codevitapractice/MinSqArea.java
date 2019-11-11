package codechef.codevitapractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class MinSqArea {
    public static void main(String[] args) throws Exception{
        final BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(reader.readLine());
        while(t-->0){
            long n= Long.parseLong(reader.readLine());
            long maxX=Long.MIN_VALUE,minX=Long.MAX_VALUE,maxY=Long.MIN_VALUE,minY=Long.MAX_VALUE;
            for (int i = 0; i <n ; i++) {
                String[] str=reader.readLine().split(" ");
                long x= Long.parseLong(str[0]),y= Long.parseLong(str[1]);
                maxX=Long.max(maxX,x);maxY=Long.max(maxY,y);
                minX=Long.min(minX,x);minY=Long.min(minY,y);
            }
            BigInteger allX=BigInteger.valueOf(Math.abs(maxX-(minX)));
            BigInteger allY= BigInteger.valueOf(Math.abs(maxY-(minY)));
            BigInteger result=allX.multiply(allY);
            System.out.println(result);
        }
    }
}
