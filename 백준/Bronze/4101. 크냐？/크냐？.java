import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger f_num;
        BigInteger s_num;

        do { //do~while 루프로 최소 한번 이상 입력받게 한다.
            f_num = scanner.nextBigInteger();
            s_num = scanner.nextBigInteger();

            if(f_num.toString().equals("0")&&s_num.toString().equals("0")){ //처음부터 0, 0이 입력된 경우
                System.exit(0);
            }

            if(f_num.compareTo(s_num) == 1){ //인자 값보다 크면 1, 같으면 0 작은경우 -1을 반환
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            
        } while(!(f_num.toString().equals("0")&&s_num.toString().equals("0"))); //둘다 0이 입력되기 전까지 계속 입력받는다.

    }
}