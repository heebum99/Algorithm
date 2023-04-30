import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long min = Long.parseLong(st.nextToken());
        long max = Long.parseLong(st.nextToken());

        boolean[] check = new boolean[(int) (max - min + 1)]; //최댓값에서 최솟값의 차이만큼 배열 생성
        for (long i = 2; i * i <= max; i++) { //1보다 큰 제곱수이므로 2부터 시작
            long pow = i * i; //제곱수

            
            long start_idx = min / pow;
            if (min % pow != 0) { //나머지가 0이 아니면 그 다음수부터 체크
                start_idx++;
            }

            for (long j = start_idx; j * pow <= max; j++) { //제곱 수를 true로 변경
                check[(int) ((j * pow) - min)] = true;
            }
        }
        int count = 0;
        for (int i = 0; i <= max - min; i++) {
            if (!check[i]) {
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }
}
