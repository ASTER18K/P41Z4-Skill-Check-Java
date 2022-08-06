package D;

import java.util.Scanner;

public class D153 {
    public static void main(String[] args) {
        int A, B, C;
        int x = 0;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        if (A >= 0 && A <= 1000 && B >= 0 && B <= 1000 && C >= 0 && C <= 1000) {
            if (A >= B)
                if (B >= C)
                    x = B;
                else if (A <= C)
                    x = A;
                else
                    x = C;
            else if (A > C)
                x = A;
            else if (B > C)
                x = C;
            else
                x = B;
        }
        else{
            System.exit(0);
        }
        System.out.println(x);
    }
}
