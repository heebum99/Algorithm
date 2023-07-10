import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int zero, one, sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
//        int[] zero = new int[41];
//        int[] one = new int[41];
//        zero[0] = 1;
//        one[0] = 0;
//        zero[1] = 0;
//        one[1] = 1;
//        for (int i = 2; i < 41; i++) {
//            zero[i] = zero[i - 1] + zero[i - 2];
//            one[i] = one[i - 1] + one[i - 2];
//        }
//        for (int i = 0; i < T; i++) {
//            int N = Integer.parseInt(br.readLine());
//            sb.append(zero[N]).append(" ").append(one[N]).append("\n");
//        }
//        System.out.print(sb);
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            fibonacci(N);
            sb.append(zero).append(" ").append(one).append("\n");
        }
        System.out.print(sb);
    }

    private static void fibonacci(int n) {
        //피보나치 규칙성
        // => N에 대한 0 호출 횟수 == N-1에 대한 1의 호출 횟수
        // => N에 대한 1 호출 횟수 == N-1에 대한 0의 호출 횟수 + N-1에 대한 1의 호출 횟수
        zero = 1;
        one = 0;
        sum = 1;

        for (int i = 1; i <= n; i++) {
            zero = one;
            one = sum;
            sum = zero + one;
        }
    }
}
