package D;

import java.util.Scanner;

public class D197 {
    public static void main(String[] args) {
        int n;
        double p;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n >= 1 && n <= 100000) {
            if (n >= 1000) {
                p = n * 0.1;
                System.out.println((int)p);
            } else {
                System.out.println("0");
            }
        } else {
            System.out.println("0");
        }
    }
}
