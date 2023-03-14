import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다.
//또, 1번부터 N번까지 번호가 적혀있는 공을 매우 많이 가지고 있다. 가장 처음 바구니에는 공이 들어있지 않으며, 바구니에는 공을 1개만 넣을 수 있다.
//도현이는 앞으로 M번 공을 넣으려고 한다.
//도현이는 한 번 공을 넣을 때, 공을 넣을 바구니 범위를 정하고, 정한 바구니에 모두 같은 번호가 적혀있는 공을 넣는다.
//만약, 바구니에 공이 이미 있는 경우에는 들어있는 공을 빼고, 새로 공을 넣는다. 공을 넣을 바구니는 연속되어 있어야 한다.
//공을 어떻게 넣을지가 주어졌을 때, M번 공을 넣은 이후에 각 바구니에 어떤 공이 들어 있는지 구하는 프로그램을 작성하시오.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); //박스의 개수 & 최대 번호
        int M = Integer.parseInt(st.nextToken()); //입력받을 횟수
        int[] box = new int[N + 1];
//        Arrays.fill(box, 0);

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int start_box = Integer.parseInt(st.nextToken());
            int last_box = Integer.parseInt(st.nextToken());
            int ball_num = Integer.parseInt(st.nextToken());

            for (int j = start_box; j <= last_box; j++) {
                box[j] = ball_num;
            }
        }

        for (int i = 1; i <= N; i++) {
            bw.write(box[i] + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
