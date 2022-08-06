package D;

import java.util.Scanner;

public class D172 {
    public static void main(String[] args) {
        int N, e;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        if (N >= 2 && N <= 31) {
            e = N - 1;
            System.out.println(e);
        } else {
            System.exit(0);
        }

    }
}
