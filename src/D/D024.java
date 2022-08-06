package D;

import java.util.Scanner;

public class D024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a + b;
        if (a >= 1 && a <= 179 && b >= 1 && b <= 179 &&  x >= 2 && x <= 179) {
            int c = 180 - a - b;
            System.out.println(c);
        } else {
            System.exit(0);
        }
    }
}
