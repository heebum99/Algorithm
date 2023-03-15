import java.io.*;
import java.util.StringTokenizer;

//도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 순서대로 적혀져 있다.
//바구니는 일렬로 놓여져 있고, 가장 왼쪽 바구니를 1번째 바구니, 그 다음 바구니를 2번째 바구니, ..., 가장 오른쪽 바구니를 N번째 바구니라고 부른다.
//도현이는 앞으로 M번 바구니의 순서를 역순으로 만들려고 한다. 도현이는 한 번 순서를 역순으로 바꿀 때, 순서를 역순으로 만들 범위를 정하고, 그 범위에 들어있는 바구니의 순서를 역순으로 만든다.
//바구니의 순서를 어떻게 바꿀지 주어졌을 때, M번 바구니의 순서를 역순으로 만든 다음, 바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는 프로그램을 작성하시오.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //바구니 개수 N
        int M = Integer.parseInt(st.nextToken()); //입력받을 횟수 M
        int[] box = new int[N + 1];
        int[] tmp = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            box[i] = i;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int k = num1;

            for (int j = num2; j >= num1; j--) {
                tmp[j] = box[k++];
            }
            for (int j = num2; j >= num1; j--) {
                box[j] = tmp[j];
            }
        }

        for (int i = 1; i <= N; i++) {
//            box[i] = tmp[i];
            bw.write(Integer.toString(box[i]) + " ");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
