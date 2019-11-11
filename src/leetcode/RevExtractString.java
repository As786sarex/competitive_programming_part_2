package leetcode;

import java.util.Scanner;

public class RevExtractString {
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");
        StringBuilder builder=new StringBuilder();
        for (int i = str.length-1; i>0 ; i--) {
            builder.append(str[i]).append(" ");
        }
        builder.append(str[0]);
        return builder.toString();
    }

    public static void main(String[] args) {
        String s1="the sky is blue",s2="  hello world!  ",s3="a good   example";
        RevExtractString e=new RevExtractString();
        System.out.println(e.reverseWords(s1));
        System.out.println(e.reverseWords(s2));
        System.out.println(e.reverseWords(s3));
    }
}
