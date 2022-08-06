package D;

import java.util.*;

public class D164 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        if (x >= 1 && x <= 256){
            if (x == 0 || x == 2 || x == 4 || x == 8 || x == 16 || x == 32 || x == 64 || x == 128 || x == 256) {
                System.out.println("OK");
            }
            else {
                System.out.println("NG");
            }
        } else {
            System.out.println("NG");
        }
    }
}
