import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 1; //자기 자신인 N만 가지고 있을때를 포함
        int start_idx = 1; //어느 수부터 더해나갈건지.
        int end_idx = 1; //어느 수까지 더할건지.
        int sum = 1;

        while (end_idx != N) {
            if (sum > N) { //연속된 숫자의 합이 N보다 큰 경우
                sum -= start_idx;
                start_idx++;
            } else if (sum < N) { //연속된 숫자의 합이 N보다 작은 경우
                end_idx++;
                sum += end_idx;
            } else { //같을 경우
                count++;
                end_idx++;
                sum += end_idx;
            }
        }

        System.out.println(count);

        //메모리 초과
//        int count = 0;
//        long[] sum = new long[N + 1];
//
//        for (int i = 1; i <= N; i++) {
//            sum[i] = sum[i - 1] + i;
//        }
//
//        for (int i = 0; i <= N; i++) {
//            for (int j = i + 1; j <= N; j++) {
//                if (sum[j] - sum[i] == N) {
//                    count++;
//                }
//            }
//        }
//
//        System.out.println(count);
    }
}
