import java.io.*;
import java.util.StringTokenizer;

//첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다.
//둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다.
//셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); //숫자의 개수 N
        int M = Integer.parseInt(st.nextToken()); //테스트 케이스 횟수 M
        int num1, num2, result; //구간 i, j

        int[] nums = new int[N + 1]; //각 숫자들을 저장하는 배열
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 1; i <= N; i++) { //각 숫자 입력 후 배열에 저장
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int[] sum = new int[N + 1]; //부분 구간합을 저장하는 배열

        for (int i = 1; i <= N; i++) { //부분 구간합을 배열에 저장

            sum[i] = nums[i] + sum[i - 1];

        }

        for (int i = 0; i < M; i++) { //i~j까지의 부분 구간합을 구한다.
            st = new StringTokenizer(br.readLine(), " ");

            num1 = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());

            if (num1 != 0) {
                result = sum[num2] - sum[num1 - 1]; //num1 - 1을 해줘야 num1까지의 합이 출력
                bw.write(Integer.toString(result));
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
