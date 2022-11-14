import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        BigInteger tl, tw, el, ew, ta, ea; //tl = telecom length, tw = telecom width, ta = telecom area
        int cnt = 0;
        while (cnt < count) {
            tl = scanner.nextBigInteger();
            tw = scanner.nextBigInteger();
            el = scanner.nextBigInteger();
            ew = scanner.nextBigInteger();
            ta = tl.multiply(tw);
            ea = el.multiply(ew);
            if (ta.compareTo(ea) == 1) { //ta가 큰 경우
                System.out.println("TelecomParisTech");
            } else if (ta.compareTo(ea) == -1) { //ta가 작은 경우
                System.out.println("Eurecom");
            } else {
                System.out.println("Tie");
            }
            cnt++;
        }
    }
}