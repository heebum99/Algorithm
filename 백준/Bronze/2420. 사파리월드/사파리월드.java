import java.util.Scanner;
import java.math.*;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //두 도메인의 유명도
        BigInteger N = scanner.nextBigInteger();
        BigInteger M = scanner.nextBigInteger();

        if(N.compareTo(M)>0){
            System.out.println(N.subtract(M));
        }
        else{
            System.out.println(M.subtract(N));
        }
    }
}