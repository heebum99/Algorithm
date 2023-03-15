import java.io.*;

//첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            for (int j = N; j >= i + 1; j--) {
                bw.write(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                bw.write("*");
            }
            bw.newLine();
        }

        for (int i = 1; i < N; i++) {
            for (int j = 1; j < i + 1; j++) {
                bw.write(" ");
            }
            for (int j = 1; j <= (2 * N) - (2 * (i + 1) - 1); j++) {
                bw.write("*");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
