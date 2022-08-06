package D;

import java.util.Scanner;

public class D167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        if (k >= 1 && k <= 999) {
            System.out.println(k);
        } else if (k >= 1000 && k <= 5000) {
            System.out.println(k + 3);
        } else {
            System.exit(0);
        }
    }
}
