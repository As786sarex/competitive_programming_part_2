package imageutil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChefFootball {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        int n= Integer.parseInt(reader.readLine());
        int score=0;
        while (t-- > 0) {
            while (n-- > 0) {

                String[] str = reader.readLine().split(" ");
                int type = Integer.parseInt(str[0]);
                int a = Integer.parseInt(str[1]);
                int b = Integer.parseInt(str[2]);
                if (type == 1) {
                    System.out.println("YES");
                    score = a;
                } else {
                    if (a == b) {
                        System.out.println("YES");
                        score = a;
                    } else {
                        if ((a > score && b < score) || (b > score && a < score)) {
                            System.out.println("YES");
                        }
                        else if (a > score && b > score) {
                            System.out.println("NO");
                        }
                        else if (score==0){
                            System.out.println("NO");
                        }
                        else{
                            System.out.println("something wrong");
                        }

                    }
                }
            }
        }
    }
}
