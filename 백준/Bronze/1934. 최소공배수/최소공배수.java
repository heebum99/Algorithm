import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        //유클리드 호제법을 이용해 최대 공배수 = A*B / 최대공약수
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int result = A * B / gcd(A, B);
            sb.append(result).append("\n");
        }
        System.out.print(sb);
    }

    private static int gcd(int a, int b) { //재귀 함수형태의 유클리드 호제법 구현 함수
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
