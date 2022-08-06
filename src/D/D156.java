package D;

import java.util.Scanner;

public class D156 {
    public static void main(String[] args) {
        int n, m, x;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        if (n >= 1 && n <= 100 && m >= 1 && m <= 100) {
            x = n * m;
            System.out.println(x);
        } else {
            System.exit(0);
        }
    }
}
