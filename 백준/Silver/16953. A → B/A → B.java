import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        int cnt = 1;

        while (A != B) {
            if (B % 2 != 0 && B % 10 != 1) {
                cnt = -1;
                break;
            }
            if (A > B) {
                cnt = -1;
                break;
            }
            if (B % 2 == 0) {
                B /= 2;
                cnt++;
            } else if (B % 10 == 1) {
                B -= 1;
                B /= 10;
                cnt++;
            }

        }
        System.out.println(cnt);
    }
}

