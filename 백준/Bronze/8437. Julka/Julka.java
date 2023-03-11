import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger total_apple = scanner.nextBigInteger(); //사과 총 개수
        BigInteger current_kla_apple = scanner.nextBigInteger(); // klaudia가 가지고 있는 사과 수

        BigInteger kla_apple;
        BigInteger nat_apple;

        BigInteger total = total_apple.subtract(current_kla_apple); //총 사과 개수에서 klaudia가 가지고있는 개수를 뺀 갯수

        kla_apple = total.divide(BigInteger.valueOf(2)).add(current_kla_apple);
        nat_apple = total.divide(BigInteger.valueOf(2));
        System.out.println(kla_apple);
        System.out.println(nat_apple);

    }
}