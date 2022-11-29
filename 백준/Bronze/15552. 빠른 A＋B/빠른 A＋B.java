import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); //입력 횟수
        int cnt = 0;
        while (cnt < T) {
            cnt++;

            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int sum = A + B;
            bw.write(Integer.toString(sum));
            bw.newLine();
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
