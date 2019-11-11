package codechef.november;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WEIRDO {
    private static HashMap<Character, Character> consonants, vowels;

    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        consonants = new HashMap<>(21);
        vowels = new HashMap<>(5);
        HashMap<Character,Integer> isPresent=new HashMap<>(26);
        Matcher matcher = Pattern.compile("[a-z]*[a-z&&[^aeiou]][a-z]?[a-z&&[^aeiou]][a-z]*").matcher("");
        ArrayList<String> alice = new ArrayList<>();
        ArrayList<String> bob = new ArrayList<>();
        fillVowels();
        fillConsonants();
        while (t-- > 0) {
            int[] aliceAllCount=new int[28];
            int[] aliceIndCount=new int[28];
            int[] bobAllCount=new int[28];
            int[] bobIndCount=new int[28];
            int l = Integer.parseInt(reader.readLine());
            while (l-- > 0) {
                String s = reader.readLine();
                if (matcher.reset(s).find()) {
                    bob.add(s);
                } else {
                    alice.add(s);
                }
            }
            for (String str : alice){
                char[] als=str.toCharArray();
                for (int i = 0; i <als.length ; i++) {
                    if (!isPresent.containsKey(als[i])){
                        isPresent.put(als[i],1);
                        aliceIndCount[als[i]-97]=aliceIndCount[als[i]-97]+1;
                    }
                    aliceAllCount[als[i]-97]=aliceAllCount[als[i]-97]+1;
                }
                isPresent.clear();
            }
            for (String str : bob){
                char[] als=str.toCharArray();
                for (int i = 0; i <als.length ; i++) {
                    if (!isPresent.containsKey(als[i])){
                        isPresent.put(als[i],1);
                        bobIndCount[als[i]-97]=bobIndCount[als[i]-97]+1;
                    }
                    bobAllCount[als[i]-97]=bobAllCount[als[i]-97]+1;
                }
                isPresent.clear();
            }
            alice.clear();
            bob.clear();
            int aliceUpper=1,bobUpper=1,aliceLower=1,bobLower=1;

            for (int i = 0; i <27 ; i++) {
                if(aliceAllCount[i]>0){
                    aliceUpper*=aliceIndCount[i];
                    aliceLower*=(int)Math.pow(aliceAllCount[i],2);
                    bobUpper*=bobIndCount[i];
                    bobLower*=(int)Math.pow(bobAllCount[i],2);                }
            }
            if (aliceLower==0||bobUpper==0){
                System.out.println("Infinity");
                continue;
            }
            try {
                double res = (double) (aliceUpper * bobLower) / (double) (aliceLower * bobUpper);
                if (res>10000000.0){
                    System.out.println("Infinity");
                }
                else{
                    System.out.println(roundToDouble(res));
                }
            }
            catch (ArithmeticException e){
                System.out.println("Infinity");
            }




        }
    }
    public static double roundToDouble(double d) {
        BigDecimal bd = new BigDecimal(d);
        bd = bd.setScale(7, RoundingMode.CEILING);
        return bd.doubleValue();
    }

    private static void fillConsonants() {
        consonants.put('b', 'b');
        consonants.put('c', 'c');
        consonants.put('d', 'd');
        consonants.put('f', 'f');
        consonants.put('g', 'g');
        consonants.put('h', 'h');
        consonants.put('j', 'j');
        consonants.put('k', 'k');
        consonants.put('l', 'l');
        consonants.put('m', 'm');
        consonants.put('n', 'n');
        consonants.put('p', 'p');
        consonants.put('q', 'q');
        consonants.put('r', 'r');
        consonants.put('s', 's');
        consonants.put('t', 't');
        consonants.put('v', 'v');
        consonants.put('w', 'w');
        consonants.put('x', 'x');
        consonants.put('y', 'y');
        consonants.put('z', 'z');


    }

    private static void fillVowels() {
        vowels.put('a', 'a');
        vowels.put('e', 'e');
        vowels.put('i', 'i');
        vowels.put('o', 'o');
        vowels.put('u', 'u');
    }

}
