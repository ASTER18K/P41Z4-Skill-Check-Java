package D;

import java.util.*;

public class D109 {
    public static void main(String[] args) {
        int m, d;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        d = sc.nextInt();
        if (m >= 1 && m <= 12 && d >= 1 && d <= 31) {
            if (m == 1 || m == 11) {
                if (d == 1 || d == 11){
                    System.out.println("Yes");
                }
            }
            else if (m == 2) {
                if (d == 2 || d == 22){
                    System.out.println("Yes");
                }
            }
            else if (m == d) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
        else {
            System.out.println("No");
        }
    }
}

