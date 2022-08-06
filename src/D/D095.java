package D;

import java.util.Scanner;

public class D095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        if (N >= 100 && N <= 2000 && M >= 100 && M <= 2000 && N >= M) {
            int c = N / M;
            System.out.println(c);
        } else {
            System.exit(0);
        }
    }
}
