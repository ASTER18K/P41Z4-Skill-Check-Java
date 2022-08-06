package D;

import java.util.Scanner;

public class D198 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if (a >= 1 && a <= 100 && b >= 1 && b <= 100) {
            System.out.println(a + "/" + b);
        } else {
            System.exit(0);
        }
    }
}
