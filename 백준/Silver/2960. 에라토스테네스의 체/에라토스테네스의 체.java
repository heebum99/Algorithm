import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count = 0;

        boolean[] prime = new boolean[N + 1];
        prime[0] = prime[1] = true;

        for (int i = 2; i <= N; i++) {
            if (prime[i]) {
                continue;
            } else {
                count++;
            }

            if (count == K) {
                System.out.println(i);
                return;
            }

            for (int j = i * 2; j <= N; j += i) {
                if (prime[j]) {
                    continue;
                } else {
                    prime[j] = true;
                    count++;
                }

                if (count == K) {
                    System.out.println(j);
                    return;
                }
            }
        }


    }
}
