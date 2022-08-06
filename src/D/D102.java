package D;

import java.util.Scanner;

public class D102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1 && n <= 30) {
            int x = 100 + n * 10;
            System.out.println(x);
        } else {
            System.exit(0);
        }
    }
}
