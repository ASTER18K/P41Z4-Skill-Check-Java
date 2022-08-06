package D;

import java.util.Scanner;

public class D170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n >= 10 && n <= 1000 && m >= 1 && m <= 100) {
            int x = n * m;
            System.out.println(x);
        } else {
            System.exit(0);
        }
    }
}
