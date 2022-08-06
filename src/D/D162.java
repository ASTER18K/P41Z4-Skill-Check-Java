package D;

import java.util.Scanner;

public class D162 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a >= 1 && a <= 20) {
            b = a * 150;
            System.out.println(b);
        } else {
            System.exit(0);
        }
    }
}