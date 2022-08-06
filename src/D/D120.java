package D;

import java.util.*;

public class D120 {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n >= 1 && n <= 50){
            m = n * 12;
            System.out.println(m);
        } else {
            System.exit(0);
        }
    }
}