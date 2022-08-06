package D;

import java.util.Scanner;

public class D200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kw = sc.nextInt();
        if (kw >= 1 && kw <= 10) {
            int ryo = (kw * 24 * 25);
            System.out.println(ryo);
        } else {
            System.exit(0);
        }
    }
}
