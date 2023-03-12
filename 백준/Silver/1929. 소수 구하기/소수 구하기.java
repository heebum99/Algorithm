import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        boolean[] prime = new boolean[N + 1]; //소수인지 아닌지 판별
//        Arrays.fill(prime, Boolean.TRUE); //배열의 전체를 TRUE(소수)로 초기화
        prime[0] = prime[1] = true; //0과 1은 소수가 아님

        for (int i = 2; i <= Math.sqrt(N); i++) { //M~N까지의 숫자중 소수 찾기 => 에라토스테네스의 체 방식이용, 소수가 아닌 수를 FALSE로 변경
            if (prime[i]) { //i가 소수인 경우 스킵
                continue;
            }
            for (int j = i * i; j <= N; j += i) { //i가 소수가 아닌 경우 그 수의 배수들은 다 소수가 아닌것으로 처리
                prime[j] = true;
            }
        }

        for (int i = M; i <= N; i++) {
            if (!prime[i]) {
                bw.write(Integer.toString(i));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
