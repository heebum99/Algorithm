import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int count = 1, rec_num = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (i == N - 1) {
                rec_num = arr[i];
            }
        }

        for (int i = N - 2; i >= 0; i--) {
            if (arr[i] > rec_num) {
                count++;
                rec_num = arr[i];
            }
        }

        System.out.println(count);
    }
}
