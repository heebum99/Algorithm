import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static long C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        C = Long.parseLong(st.nextToken());

        System.out.println(pow(A, B));
    }

    //지수법칙 이용 => ex) A^6 = (A^3 * A^3)
    private static long pow(long A, long exponent) {
        //모듈러 합동 공식 => (a * b) %c = (a%c * b%c) %c
        if (exponent == 1) { //지수가 1인 경우는 그대로 A값 리턴
            return A % C;
        }

        long temp = pow(A, exponent / 2); //지수의 절반에 해당하는 값을 구한다.

        if (exponent % 2 == 1) { //지수가 홀수인 경우 A^(exponent/2) * A^(exponent/2) * A이므로
            return (((temp % C) * (temp % C) % C) * (A % C) % C);
        }
        return ((temp % C) * (temp % C)) % C;
    }
}
