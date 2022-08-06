package D;

import java.util.Scanner;

public class D193 {
    public static void main(String[] args) {
        int n, m, x, y;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        if (n >= 1 && n <= 20 && m >= 1 && m <= 20 && n <= m) {
            x = m / n;
            y = m % n;
            System.out.println(x);
            System.out.println(y);
        } else {
            System.exit(0);
        }
    }
}
