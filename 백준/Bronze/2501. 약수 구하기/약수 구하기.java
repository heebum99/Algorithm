import java.io.*;
import java.util.StringTokenizer;

//두 개의 자연수 N과 K가 주어졌을 때, N의 약수들 중 K번째로 작은 수를 출력하는 프로그램을 작성하시오.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count = 0; //몇번째로 작은 약수인지

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
            }

            if (count == K) {
                bw.write(Integer.toString(i));
                break;
            }
        }

        if (count < K) {
            bw.write("0");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
