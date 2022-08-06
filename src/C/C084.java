import java.util.*;

public class C084 {
    public static void main(String[] args) {
        String S;
        StringBuffer P = new StringBuffer();
        int sl;
        Scanner sc = new Scanner(System.in);
        S = sc.next();
        sl = S.length();
        if (sl >= 1 && sl <= 100) {
            for (int i = 0; i - 2 < sl; i++ ){
                P.append("+");
            }
            System.out.println(P);
            System.out.println("+" + S + "+");
            System.out.println(P);
        } else {
            System.exit(0);
        }
    }
}
