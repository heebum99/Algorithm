import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int count = 0;
        long[] arr = new long[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] == M) {
                count++;
            }
        }

        int start_idx = 0;
        int end_idx = 1;
        long total = arr[start_idx] + arr[end_idx];

        while (end_idx < N) {
            if (total < M) {
                total += arr[++end_idx];
            } else if (total > M) {
                total -= arr[start_idx++];
            } else {
                if (end_idx != start_idx) {
                    count++;
                    total += arr[++end_idx];
                } else {
                    total += arr[++end_idx];
                }
            }
        }

        System.out.println(count);
    }
}
