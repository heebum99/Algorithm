import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //배열 크기
        int[] arr = new int[N]; //입력 받은 값들의 배열
        int[] dp = new int[N]; //증가하는 수열의 길이값 배열

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            dp[i] = 1;

            // 0 ~ (i-1)번째 요소들 탐색
            for (int j = 0; j < i; j++) {
                //j번째 요소가 i번째 요소보다 작고, i번째 dp가 j번째 dp+1의 값보다 작은 경우
                if (arr[j] < arr[i] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}