package D;

import java.util.Scanner;

public class D029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        if (d == 1) {
            System.out.println(6);
        } else if (d == 2) {
            System.out.println(5);
        } else if (d == 3) {
            System.out.println(4);
        } else if (d == 4) {
            System.out.println(3);
        } else if (d == 5) {
            System.out.println(2);
        } else if (d == 6) {
            System.out.println(1);
        } else {
            System.exit(0);
        }
    }
}
