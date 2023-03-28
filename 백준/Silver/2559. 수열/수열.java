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

        long arr[] = new long[N +1];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long max = (-100) * K; //최소 값으로 지정
        int start_idx = 0;
        int end_idx = start_idx + K;
        long sum = 0;
        long count = 1;

        for (int i = start_idx; i < end_idx; i++) {
            sum += arr[i];
        }

        while (true) {
            if (max < sum) {
                max = sum;
            }
            if (count < N - K + 1) {
                sum -= arr[start_idx++];
                sum += arr[end_idx++];
            } else{
                break;
            }
            count++;
        }
        System.out.println(max);
    }
}
