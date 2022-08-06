package D;

import java.util.Scanner;

public class D190 {
    public static void main(String[] args) {
        int c, m;
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        if (c >= 1 && c <= 100) {
            m = c * 10;
            System.out.println((int)m);
        }
    }
}