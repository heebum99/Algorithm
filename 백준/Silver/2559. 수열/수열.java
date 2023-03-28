import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); //전체 날짜 수
        int K = Integer.parseInt(st.nextToken()); //연속된 날짜 수

        long arr[] = new long[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long max = (-100) * K;
        int start_idx = 0;
        int end_idx = start_idx + K;
        while (end_idx <= N) {
            long sum = 0;
            for (int i = start_idx; i < end_idx; i++) {
                sum += arr[i];
            }

            if (max < sum) {
                max = sum;
            }
            start_idx++;
            end_idx++;
        }
        System.out.println(max);
    }
}
