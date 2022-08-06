package D;

import java.util.Scanner;

public class D055 {
    public static void main(String[] args) {
        String a = "Best in ";
        Scanner sc = new Scanner(System.in);
        String b = sc.next() + " ";
        String c = sc.next();
        String x = a + b + c;
        System.out.println(x);
    }
}
