import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    final static long MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        //분자
        long numer = factorial(N);

        //분모
        long denom = factorial(M) * factorial(N - M) % MOD;

        //페르마 소정리
        long result = (numer * pow(denom, MOD - 2) % MOD);
        System.out.println(result);
    }

    private static long pow(long base, long expo) { //역원 구하는 함수
        //base = 밑, expo = 지수
        if (expo == 1) {
            return base % MOD;
        }

        long tmp = pow(base, expo / 2);

        if (expo % 2 == 1) {
            return (tmp * tmp % MOD) * base % MOD;
        }
        return tmp * tmp % MOD;
    }

    private static long factorial(long n) {
        long fac = 1L;

        while (n > 1) {
            fac = (fac * n) % MOD;
            n--;
        }
        return fac;
    }
}
