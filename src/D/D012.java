package D;

import java.util.Scanner;

public class D012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= -100 && n <= 100) {
            if (n <= -1) {
                int x = n * -1;
                System.out.println(x);
            } else {
                System.out.println(n);
            }
        } else {
            System.exit(0);
        }
    }
}
