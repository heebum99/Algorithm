import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        //이전 B의 개수 = 다음 A의 개수
        //이전 A+B의 개수는 = 다음 B의 개수
        int count = 1; //몇번 버튼을 눌렀는지
        int A_count = 0; //count번 눌렀을때 A의 개수
        int B_count = 1; //count번 눌렀을때 B의 개수
        int tmp;

        while (++count <= K) {
            tmp = A_count;
            A_count = B_count;
            B_count += tmp;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(A_count).append(" ").append(B_count);
        System.out.println(sb);

        br.close();
    }
}
