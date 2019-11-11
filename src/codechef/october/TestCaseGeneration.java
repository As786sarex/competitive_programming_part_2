package codechef.october;

import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TestCaseGeneration {
    public static void main(String[] args) throws IOException {
        Scanner reader=new Scanner(new File("test3.txt"));
        Scanner scanner=new Scanner(new File("test2.txt"));
        StringTokenizer tokenizer=new StringTokenizer(reader.nextLine());
        StringTokenizer tokenizer1=new StringTokenizer(scanner.nextLine());
        boolean flag = true;
        int count=0;
        for (int i = 0; tokenizer1.hasMoreTokens(); i++) {
            String s1=tokenizer.nextToken();
            String s2=tokenizer1.nextToken();
            boolean c=s1.equals(s2);
            count++;
            if (!c) {
                flag=false;
                System.out.println("fk");
                System.out.println(s1+" "+s2);
                System.out.println(i);
            }

            //System.out.println(scanner.nextInt());
        }
        System.out.println(count);
        System.out.println(flag?"Equal":"Fucked Up");
    }
}
