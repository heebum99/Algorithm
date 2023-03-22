import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] x_pos = new int[N];
        int[] y_pos = new int[N];

        if (N <= 1) {
            System.out.println(0);
            return;
        }

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            x_pos[i] = Integer.parseInt(st.nextToken());
            y_pos[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(x_pos);
        Arrays.sort(y_pos);

        int area = (x_pos[N - 1] - x_pos[0]) * (y_pos[N - 1] - y_pos[0]);
        System.out.println(area);
    }
}
