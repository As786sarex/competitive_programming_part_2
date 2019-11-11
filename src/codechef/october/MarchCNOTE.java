package codechef.october;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MarchCNOTE {
    public static void main(String[] args) throws Exception{
        final BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(reader.readLine());
        while(t-->0){
            boolean flag=false;
            String[] str=reader.readLine().split(" ");
            int x= Integer.parseInt(str[0]),y= Integer.parseInt(str[1])
                    ,k= Integer.parseInt(str[2]),n= Integer.parseInt(str[3]);
            String[] s;
            for (int i = 0; i <n ; i++) {
                s=reader.readLine().split(" ");
                if (Integer.parseInt(s[0])>=(x-y)&&Integer.parseInt(s[1])<=k){
                    flag=true;
                }
            }
            System.out.println(flag?"LuckyChef":"UnluckyChef");
        }
    }
}
