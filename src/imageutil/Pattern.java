package imageutil;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String one = "\n  |\n  |", two = " _ \n _|\n|_ ", three = " _ \n _|\n _|", four = "   \n|_|\n  |",
                five = " _ \n|_ \n _|", six = " _ \n|_ \n|_|",
                seven = " _ \n| |\n  |", eight = " _ \n|_|\n|_|",
                nine = " _ \n|_|\n _|", zero = " _ \n| |\n|_|";
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print(one);
                break;
            case 2:
                System.out.print(two);
                break;
            case 3:
                System.out.print(three);
                break;
            case 4:
                System.out.print(four);
                break;
            case 5:
                System.out.print(five);
                break;
            case 6:
                System.out.print(six);
                break;
            case 7:
                System.out.print(seven);
                break;
            case 8:
                System.out.print(eight);
                break;
            case 9:
                System.out.print(nine);
                break;
            case 0:
                System.out.print(zero);
                break;
        }
    }
}
