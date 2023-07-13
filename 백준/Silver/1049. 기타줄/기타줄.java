import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //끊어진 기타줄 개수
        int M = Integer.parseInt(st.nextToken()); //기타줄 브랜드 개수
        int answer = 0;
        int bundleMin = Integer.MAX_VALUE;
        int singleMin = Integer.MAX_VALUE;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int bundle = Integer.parseInt(st.nextToken());
            int single = Integer.parseInt(st.nextToken());
            bundleMin = Math.min(bundleMin, bundle);
            singleMin = Math.min(single, singleMin);
        }

        while (N > 0) {
            if (N <= 6) { //필요 기타줄 개수가 6보다 작거나 같은 경우
                answer += Math.min(bundleMin, singleMin * N);
                break;
            } else { //필요 기타줄 개수가 6보다 큰 경우
                if (bundleMin > singleMin * 6) {
                    answer = singleMin * N;
                    break;
                } else {
                    answer += (N / 6) * bundleMin;
                    N %= 6;
                }
            }
        }
        System.out.println(answer);
    }
}
