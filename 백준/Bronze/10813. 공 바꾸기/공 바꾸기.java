import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

//도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다.
//바구니에는 공이 1개씩 들어있고, 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있다.
//도현이는 앞으로 M번 공을 바꾸려고 한다. 도현이는 공을 바꿀 바구니 2개를 선택하고, 두 바구니에 들어있는 공을 서로 교환한다.
//공을 어떻게 바꿀지가 주어졌을 때, M번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하는 프로그램을 작성하시오.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //바구니 개수 N
        int M = Integer.parseInt(st.nextToken()); //입력받는 횟수 M
        int[] box = new int[N + 1];
        int temp = 0;

        for (int i = 1; i <= N; i++) { //박스 초기값 세팅 => 초기에는 박스 번호와 공 번호가 동일
            box[i] = i;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            temp = box[num1];
            box[num1] = box[num2];
            box[num2] = temp;
        }

        for (int i = 1; i <= N; i++) {
            bw.write(Integer.toString(box[i]) + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
