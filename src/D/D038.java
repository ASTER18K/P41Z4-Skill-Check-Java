package D;

import java.util.Scanner;

public class D038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 2 && n <= 100) {
            int x = n * (n - 1) / 2;
            System.out.println(x);
        } else {
            System.exit(0);
        }

    }
}
