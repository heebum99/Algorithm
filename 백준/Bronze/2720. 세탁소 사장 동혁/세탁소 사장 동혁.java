import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int q = 25;
        int d = 10;
        int n = 5;
        int p = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int money = Integer.parseInt(br.readLine());
            sb.append(money / q).append(" ");
            money %= q;
            sb.append(money / d).append(" ");
            money %= d;
            sb.append(money / n).append(" ");
            money %= n;
            sb.append(money / p).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
