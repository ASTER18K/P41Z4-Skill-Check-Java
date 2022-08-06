package D;

import java.util.Scanner;

public class D135 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        if (D >= 180 && D <= 18000) {
            int N = D / 180 + 2;
            System.out.println(N);
        } else {
            System.exit(0);
        }
    }
}
