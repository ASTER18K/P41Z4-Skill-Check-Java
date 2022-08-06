package D;

import java.util.Scanner;

public class D192 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        if (s.length() >= 1 && s.length() <= 20) {
            System.out.println(s + "!");
        } else {
            System.exit(0);
        }
    }
}