import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); //스크린 크기 N
        int M = Integer.parseInt(st.nextToken()); //바구니 크기 M
        int J = Integer.parseInt(br.readLine()); //입력받을 횟수 => 떨어지는 사과 개수 J

        int left_pos = 1; //박스의 왼쪽 위치
        int right_pos = left_pos + (M-1); //박스의 오른쪽 위치
        int falling_pos; //사과가 떨어지는 위치
        int count = 0; //박스가 움직인 횟수;

        while (J-- > 0) {
            falling_pos = Integer.parseInt(br.readLine());
            while (!(left_pos <= falling_pos && falling_pos <= right_pos)) {
                if (left_pos > falling_pos) {
                    left_pos--;
                    right_pos--;
                    count++;
                } else if (right_pos < falling_pos) {
                    left_pos++;
                    right_pos++;
                    count++;
                }
                if (left_pos <= falling_pos && falling_pos <= right_pos) {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
