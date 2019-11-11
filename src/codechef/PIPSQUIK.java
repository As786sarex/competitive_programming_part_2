package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PIPSQUIK {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(reader.readLine());
        while(t-->0){
            String[] s=reader.readLine().split(" ");
            int n= Integer.parseInt(s[0]),h= Integer.parseInt(s[1])
                    ,y1= Integer.parseInt(s[2]),y2= Integer.parseInt(s[3])
                    ,l= Integer.parseInt(s[4]);
            int count=0;
            while(n-->0){
                String[] str=reader.readLine().split(" ");
                int type= Integer.parseInt(str[0]),xi= Integer.parseInt(str[1]);
                if(l>0) {
                    switch (type) {
                        case 1:
                            if ((h - y1) > xi) {
                                l--;
                                if(l>0){
                                    count++;
                                }
                            }
                            else{
                                count++;
                            }
                            break;
                        case 2:
                            if(y2>=xi){
                                count++;
                            }
                            else{
                                l--;
                                if (l>0){
                                    count++;
                                }
                            }
                            break;
                    }
                }

            }
            System.out.println(count);
        }
    }
}
