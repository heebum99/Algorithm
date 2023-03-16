import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int C = Integer.parseInt(br.readLine()); //입력할 테스트 케이스 C

        for (int i = 0; i < C; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken()); //학생 수 N
            int[] ary = new int[N];
            int ab_avg = 0;
            double percent = 0;

            for (int j = 0; j < N; j++) {
                ary[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(ary);

            int avg = Arrays.stream(ary).sum() / ary.length;

            if (ary[ary.length / 2] < avg) {
                for (int j = ary.length / 2; j < ary.length; j++) {
                    if (ary[j] > avg) {
                        ab_avg++;
                    }
                }
            } else {
                for (int j = 0; j < ary.length; j++) {
                    if (ary[j] > avg) {
                        ab_avg++;
                    }
                }
            }

            percent = ((double) ab_avg / N)*100;
            bw.write(String.format("%.3f", percent) + "%\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
