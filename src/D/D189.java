package D;

import java.util.Scanner;

public class D189 {
    public static void main(String[] args) {
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        if (x >= 1900 && x <= 2021 && y >= 1900 && y <= 2021) {
            z = y - x;
            System.out.println(z);
        } else {
            System.exit(0);
        }
    }
}
