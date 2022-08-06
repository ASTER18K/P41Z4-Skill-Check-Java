package D;

import java.util.Scanner;

public class D123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if (X >= 0 && X <= 10000) {
            int cX =  X  + 10000;
            System.out.println(cX);
        } else {
            System.out.println(X);
        }
    }
}
