import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //핵심: 구간합의 나머지가 서로 같다면 구간 합의 차의 나머지는 0이다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); //숫자의 개수 N
        int M = Integer.parseInt(st.nextToken()); //M으로 나누어 떨어지는가?

        long[] sum = new long[N]; //구간 합 배열
        long[] remainder = new long[M]; //나머지를 담는 배열 => 나머지가 같은 구간합의 개수를 구하기 위함
        long count = 0; //나눠떨어지는 쌍의 개수
        int remain; // 나머지

        st = new StringTokenizer(br.readLine(), " ");
//        sum[0] = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            sum[i] = i > 0 ? sum[i - 1] + Integer.parseInt(st.nextToken()) : Integer.parseInt(st.nextToken());
//            sum[i] += (sum[i - 1] + Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < N; i++) {
            remain = (int) (sum[i] % M);
            if (remain == 0) { //나머지가 0인 경우 수 만큼 나눠떨어지는 쌍의 개수에 포함
                count++;
            }
            remainder[remain]++; //나머지가 같은 인덱스 개수 카운팅
        }

        for (int i = 0; i < M; i++) { //나머지가 같은 구간 n개 중 2개의 구간을 뽑는 경우의 수 => nC2
            if (remainder[i] > 1) {
                count += (remainder[i] * (remainder[i] - 1) / 2);
            }
        }
        System.out.println(count);
    }
}
