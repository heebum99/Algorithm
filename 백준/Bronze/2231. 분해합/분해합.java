import java.io.*;

//어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다.
//어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다.
//예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 따라서 245는 256의 생성자가 된다.
// 물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다. 반대로, 생성자가 여러 개인 자연수도 있을 수 있다.
//자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //브루트포스 알고리즘
        int N = Integer.parseInt(br.readLine()); //자연수 N
        int N_lenth = Integer.toString(N).length(); //자연수 N의 자릿수
        int num = 0;
        int sum = 0;
        int result = 0;

        //N이 주어졌을때 X ~ N까지 다 탐색한 후 생성자가 없다면 0을 있다면 가장 작은 생성자를 출력해낸다.
        //각 자리수 마다 최대로 들어갈 수 있는 숫자는 9, 4자리수 경우 N - (9*4) ~ N까지 탐색
        for (int i = (N - (N_lenth * 9)); i <= N; i++) {
            num = i;
            sum = 0;
            while (num != 0) { //각 자릿수를 더하는 과정
                sum += num % 10;
                num /= 10;
            }

            if (sum + i == N) {
                result = i;
                break;
            }
        }

        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
