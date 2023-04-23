import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        long start = 1;
        long end = K;
        long answer = 0;

        //이진 탐색 수행
        while (start <= end) {
            long mid = (start + end) / 2;
            long cnt = 0;

            //중앙값보다 작은 수의 개수 구하기
            for (int i = 1; i <= N; i++) {
                cnt += Math.min(mid / i, N); //작은 수 카운트
            }
            if (cnt < K) {
                start = mid + 1;
            } else {
                answer = mid; //현재 단계의 중앙값을 정답 변수에 저장
                end = mid - 1;
            }
        }
        System.out.println(answer);
        br.close();
    }
}
