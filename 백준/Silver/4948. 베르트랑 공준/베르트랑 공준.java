import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { //에라토스테네스의 체 방식 이용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean prime[] = new boolean[250000];
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) { //에라토스테네스의 체
            if (prime[i]) {
                continue;
            }
            for (int j = i * i; j < prime.length; j = j + i) {
                prime[j] = true;
            }
        }

        StringBuilder sb = new StringBuilder();
        while (true) {
            int num = Integer.parseInt(br.readLine());
            int count = 0;

            if (num == 0) {
                break;
            }

            for (int i = num + 1; i <= num * 2; i++) {
                if (!prime[i]) {
                    count++;
                }
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }
}
