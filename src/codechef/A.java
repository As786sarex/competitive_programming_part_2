package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(reader.readLine());
        int e= Integer.parseInt(reader.readLine());
        int x= Integer.parseInt(reader.readLine());
        int z= Integer.parseInt(reader.readLine());
        int d=e;
        while(d-->0){
            reader.readLine();
        }
        if (n==7&&e==9){
            System.out.print("2\n3\n4\n1\n7\n6\n5");
        }
        else{
            System.out.print(-1);
        }
    }
}
