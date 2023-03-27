import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] prime = new boolean[1003002];
        prime[0] = prime[1] = true;

        int N = Integer.parseInt(br.readLine());

        for (int i = 2; i <= Math.sqrt(prime.length); i++) { //에라토스테네스의 체
            if (prime[i]) {
                continue;
            }

            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

        for (int i = N; i < prime.length; i++) {
            if (!prime[i]) {
                if (isPalindrome(i)) {
                    System.out.println(i);
                    return;
                }
            }
        }

    }

    private static boolean isPalindrome(int n) {
        int len = Integer.toString(n).length();
        String num = Integer.toString(n);

        for (int i = 0; i < len / 2; i++) {
            if (num.charAt(i) != num.charAt(len - (i + 1))) {
                return false;
            }
        }
        return true;
    }
}
