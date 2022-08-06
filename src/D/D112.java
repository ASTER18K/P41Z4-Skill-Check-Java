package D;

import java.util.Scanner;

public class D112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        if (n >= 1 && n <= 200 && h >= 1 && h <= 24) {
            int x = n * h;
            System.out.println(x);
        }
    }
}
