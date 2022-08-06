package D;

import java.util.Scanner;

public class D106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n >= 1 && m <= 100) {
            int x = n % m;
            System.out.println(x);
        }
    }
}
