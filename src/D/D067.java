package D;

import java.util.Scanner;

public class D067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1 && n <= 100) {
            if (n % 2 == 0) {
                System.out.println("OFF");
            } else {
                System.out.println("ON");
            }
        } else {
            System.exit(0);
        }
    }
}
