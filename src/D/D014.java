package D;

import java.util.Locale;
import java.util.Scanner;

public class D014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.length() >= 1 && s.length() <= 100) {
            System.out.println(s.toUpperCase(Locale.ROOT));
        } else {
            System.exit(0);
        }

    }
}
