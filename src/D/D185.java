package D;

import java.util.Scanner;

public class D185 {
    public static void main(String[] args) {
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        if (x >= 1100 && x <= 5000 && y >= 1 && y <= 200) {
            z = x * y;
            System.out.println(z);
        } else {
            System.exit(0);
        }
    }
}
