import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] p = new int[3][2];

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            p[i][0] = Integer.parseInt(st.nextToken());
            p[i][1] = Integer.parseInt(st.nextToken());
        }

        int result = CCW(p[0], p[1], p[2]);
        System.out.println(result);
    }

    private static int CCW(int[] p1, int[] p2, int[] p3) {
        int result;
        result = (p1[0] * p2[1] + p2[0] * p3[1] + p3[0] * p1[1]) - (p3[0] * p2[1] + p2[0] * p1[1] + p1[0] * p3[1]);
        if (result < 0) {
            return -1;
        } else if (result == 0) {
            return 0;
        }
        return 1;
    }
}
