import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M, K, T = 0;
        int[] D = new int[51]; //색상별 보유한 돌 개수
        double[] probability = new double[51]; //색상별 확률
        double answer = 0;

        M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            D[i] = Integer.parseInt(st.nextToken());
            T += D[i];
        }

        K = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            if (D[i] >= K) {
                probability[i] = 1;
                for (int k = 0; k < K; k++) {
                    probability[i] *= (double) (D[i] - k) / (T - k);
                }
                answer += probability[i];
            }
        }
        System.out.println(answer);
    }
}
