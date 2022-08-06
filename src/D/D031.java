package D;

import java.util.Scanner;

public class D031 {
    public static void main(String[] args) {
        int min, sec;
        Scanner sc = new Scanner(System.in);
        min = sc.nextInt();
        if (min >= 1 && min <= 100) {
            sec = min * 60;
            System.out.println(sec);
        } else {
            System.exit(0);
        }
    }
}
