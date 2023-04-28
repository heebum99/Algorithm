import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = Integer.MAX_VALUE; //첫 번째 수인지 여부를 확인하기 위해서 설정

        //결과가 최소로 나오려면 덧셈 먼저 수행 후 뺄셈 수행
        StringTokenizer sub = new StringTokenizer(br.readLine(), "-");
        while (sub.hasMoreTokens()) {
            int temp = 0;

            StringTokenizer add = new StringTokenizer(sub.nextToken(), "+");
            while (add.hasMoreTokens()) {
                temp += Integer.parseInt(add.nextToken());
            }

            if (sum == Integer.MAX_VALUE) { //첫번째 수는 temp 값을 sum에 대입
                sum = temp;
            } else { //두번째부터는 sum 값에서 temp 값만큼 빼주기
                sum -= temp;
            }
        }
        System.out.println(sum);
        br.close();
    }
}
