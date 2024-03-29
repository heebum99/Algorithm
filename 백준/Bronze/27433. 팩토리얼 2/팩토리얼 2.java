import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N == 0) {
            System.out.println(1);
            System.exit(0);
        }

        long result = 1;
        for (int i = N; i >= 1; i--) {
            result *= i;
        }
        System.out.println(result);
    }
}
