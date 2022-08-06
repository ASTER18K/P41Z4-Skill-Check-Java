package D;

import java.util.Scanner;

public class D179 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n >= 2 && n <= 10 && m >= 1 && m <= 100 && n < m) {
            int x = m % n;
            System.out.println(x);
        } else {
            System.exit(0);
        }
    }
}
