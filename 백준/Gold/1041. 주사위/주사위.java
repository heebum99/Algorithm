import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long minSum = 0;
        long[] min = new long[3];
        int[] side = new int[6];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            side[i] = Integer.parseInt(st.nextToken());
        }

        min[0] = Math.min(side[0], side[5]);
        min[1] = Math.min(side[1], side[4]);
        min[2] = Math.min(side[2], side[3]);
        Arrays.sort(min);

        min[1] += min[0];
        min[2] += min[1];

        if (N == 1) {
            minSum = Arrays.stream(side).sum() - Arrays.stream(side).max().getAsInt();
        } else { //3면만 보이는 경우: 4, 2면만 보이는 경우:8(N-2)+4, 1면만 보이는 경우:5(N-2)^2+4(N-2)
            minSum = (min[2] * 4 + min[1] * (8 * (N - 2) + 4) + min[0] * (5 * (long) Math.pow((N - 2), 2) + 4 * (N - 2)));
        }
        System.out.println(minSum);
    }
}
